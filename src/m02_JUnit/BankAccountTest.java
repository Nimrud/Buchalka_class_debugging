package m02_JUnit;

import static junit.framework.TestCase.*;

public class BankAccountTest {

    // METODY:
    // assertEquals() lub assertNotEquals()
    // assertArrayEquals() - porównuje, czy tablice mają tę samą wielkość, te same wartości oraz czy są w tej samej kolejności
    // assertNull() lub assertNotNull()
    // assertSame() lub assertNotSame() - porównuje, czy obiekty są tą samą instancją (porównanie referencji)
    // assertThat() - porównuje daną wartość z całym zestawem wartości

    @org.junit.Test
    public void deposit() {
        //fail("To be implemented");
        BankAccount account = new BankAccount("John", "Contre", 1000.00, BankAccount.CHECKING);
        double firstDeposit = account.deposit(200.00, true);
        assertEquals(1200.00, firstDeposit);
        // poszczególne testy powinny być od siebie niezależne
        // tzn. to, co dzieje się w jednym, nie powinno wpływać na inne
    }

    @org.junit.Test
    public void withdraw() {
        fail("To be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("John", "Contre", 1000.00, BankAccount.CHECKING);
        account.deposit(340.00, true);
        assertEquals(1340.00, account.getBalance());
    }

    @org.junit.Test
    public void getBalance_withdraw(){
        BankAccount account = new BankAccount("John", "Contre", 1000.00, BankAccount.CHECKING);
        account.withdraw(150.00, true);
        assertEquals(850.00, account.getBalance());
    }

    @org.junit.Test
    public void isChecking_true(){
        BankAccount account = new BankAccount("John", "Contre", 1000.00, BankAccount.SAVINGS);
        assertTrue("The account is NOT a checking account", account.isChecking());
        // message - wyświetla się, gdy test nie przejdzie
    }
}
