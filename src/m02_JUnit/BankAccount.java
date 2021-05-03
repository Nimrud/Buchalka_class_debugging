package m02_JUnit;

// Aby dodać automatyczny moduł testowy (JUnit) ustawiamy kursor na nazwie klasy
// Następnie Alt+Enter, wybieramy Create Test => OK
// "JUnit nor found in this module" => Fix => OK
// Na dole okienka wybieramy metody, dla których chcemy stworzyć testy
// Została stworzona nowa klasa z testami
// Mimo importu pojawiają się błędy kompilacji
// => File => Project structure => Modules => klik na JUnit
// => po prawej stronie mini rozwijana lista => Test zmieniamy na Compile => OK
// DOBRA PRAKTYKA: od razu dodajemy do wszystkich testów TestCase.fail()
// bo domyślnie wszystkie testy są puste, więc wszystko śmiga (nawet jeśli w kodzie są błędy logiczne)

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;    // [checking account - rachunek bieżący]
    public static final int SAVINGS = 2;
    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }

    // The branch argument is true if the customer is performing transaction
    // at a branch, with a teller [kasjer]
    // It's false if the customer is performing the transaction at an ATM
    public double deposit(double amount, boolean branch){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount, boolean branch){
        if (!branch && (amount > 500.00)){
            System.out.println("You can withdraw up to 500 at ATM.");
            throw new IllegalArgumentException();
        }

        if (amount <= balance){
            balance -= amount;
        } else {
            System.out.println("You cannot withdraw more than you have.");
            throw new IllegalArgumentException("[legal note]");
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking(){
        return accountType == CHECKING;
    }

    // More methods here... (not necessary for testing)
}
