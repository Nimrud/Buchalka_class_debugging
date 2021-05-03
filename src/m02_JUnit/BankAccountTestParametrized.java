package m02_JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParametrized {

    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParametrized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("John", "Travolta", 5000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][] {
                {100.00, true, 5100.00},    // testujemy pierwszą wartość, trzecia wartość: oczekiwana
                {333.33, true, 5333.33},
                {0.01, true, 5000.01},
                {1000.00, true, 6000.00}
        });
    }

    @org.junit.Test
    public void deposit() {
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance());
    }
}
