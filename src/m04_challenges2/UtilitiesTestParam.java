package m04_challenges2;

import m03_challenges1.Utilities;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParam {

    private Utilities utils;
    private String inputString;
    private String expectedString;

    public UtilitiesTestParam(String inputString, String expectedString) {
        this.inputString = inputString;
        this.expectedString = expectedString;
    }

    @Before
    public void setUp() throws Exception {
        utils = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<String[]> testCondition(){
        return Arrays.asList(new String[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
                });
    }

    @Test
    public void removePairs() {
        String output = utils.removePairs(inputString);
        //System.out.println(output);
        assertEquals(expectedString, output);
    }
}