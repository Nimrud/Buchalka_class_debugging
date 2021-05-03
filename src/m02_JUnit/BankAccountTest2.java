package m02_JUnit;

import static junit.framework.TestCase.*;

public class BankAccountTest2 {

    private BankAccount account;
    private static int count = 0;

    @org.junit.BeforeClass    // @BeforeClass - jest uruchamiana raz dla wszystkich testów (static)
    // trzeba zakończyć (zamknąć) metodę - za pomocą @AfterClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases (like reading data from database)." +
                " Count = " + count++);
    }

    @org.junit.Before    // @Before - jest uruchamiana przed każdym testem
    public void setup(){
        account = new BankAccount("John", "Contre", 1000.00, BankAccount.CHECKING);
        System.out.println("Initializing new bank account...");
    }

    @org.junit.Test
    public void deposit() {
        double firstDeposit = account.deposit(200.00, true);
        assertEquals(1200.00, firstDeposit);
    }

    @org.junit.Test
    public void withdraw_branch() {
        double firstWithdraw = account.withdraw(600.00, true);
        assertEquals(400.00, firstWithdraw);
    }

    // gdy spodziewamy się błędu metody, to trzeba użyć 'expected' w adnotacji
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_branch_overLimit() {
        account.withdraw(1300.00, true);
        fail("Should have thrown and IllegalArgumentException");
    }

    // stara wersja metody (przed JUnit 4), która powinna zwracać błąd (test jest wtedy zaliczony):
    @org.junit.Test
    public void withdraw_ATM() {
        try {
            account.withdraw(600.00, false);
            fail("Should have thrown and IllegalArgumentException");
        } catch (IllegalArgumentException e) {

        }
    }

    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(340.00, true);
        assertEquals(1340.00, account.getBalance());
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        account.withdraw(150.00, true);
        assertEquals(850.00, account.getBalance());
    }

    @org.junit.Test
    public void isChecking_true(){
        assertTrue("The account is NOT a checking account", account.isChecking());
    }

    @org.junit.After         // @After - uruchamia się po każdym teście
    public void shutdown(){
        System.out.println("Count = " + count++);
    }

    @org.junit.AfterClass    // @AfterClass - uruchamia się raz po wszystkich testach
    public static void afterClass(){
        System.out.println("This executes after any test cases. Count = " + count++);
    }
}
