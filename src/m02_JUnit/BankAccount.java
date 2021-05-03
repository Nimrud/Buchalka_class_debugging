package m02_JUnit;

// Aby dodać automatyczny moduł testowy (JUnit) ustawiamy kursor na nazwie klasy
// Następnie Alt+Enter, wybieramy Create Test => OK
// "JUnit nor found in this module" => Fix => OK
// Na dole okienka wybieramy metody, dla których chcemy stworzyć testy
// Zostały stworzone nowe klasy z testami
// Mimo importu pojawiają się błędy kompilacji
// => File => Project structure => Modules => klik na JUnit
// => po prawej stronie mini rozwijana lista => Test zmieniamy na Compile => OK
// DOBRA PRAKTYKA: od razu dodajemy do wszystkich testów TestCase.fail()
// bo domyślnie wszystkie testy są puste, więc wszystko śmiga (nawet jeśli w kodzie są błędy logiczne)

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // The branch argument is true if the customer is performing transaction
    // at a branch, with a teller [kasjer]
    // It's false if the customer is performing the transaction at an ATM
    public double deposit(double amount, boolean branch){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount, boolean branch){
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    // More methods here... (not necessary for testing)
}
