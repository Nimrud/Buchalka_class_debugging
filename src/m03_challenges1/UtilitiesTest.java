package m03_challenges1;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertArrayEquals;

public class UtilitiesTest {

    @Test
    public void everyNthChar_1() {
        Utilities utils = new Utilities();
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        int n = 2;
        char[] resultArray = utils.everyNthChar(hello, n);
        char[] expectedArray = {'e', 'l'};
        assertArrayEquals(expectedArray, resultArray);
        //assertEquals(Arrays.toString(expectedArray), Arrays.toString(resultArray));
    }

    @Test
    public void everyNthChar_2() {
        Utilities utils = new Utilities();
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        int n = 6;
        utils.everyNthChar(hello, n);
    }

    @Test
    public void removePairs_first() {
        //fail();
        String string = "AABCDDEFF";
        String result = new Utilities().removePairs(string);
        assertEquals("ABCDEF", result);
    }

    @Test
    public void removePairs_second() {
        String string = "ABCCABDEEF";
        String result = new Utilities().removePairs(string);
        assertEquals("ABCABDEF", result);
    }

    @Test
    public void removePairs_third() {
        String string = "A";
        String result = new Utilities().removePairs(string);
        assertEquals("A", result);
    }

    @Test
    public void removePairs_fourth() {
        String result = new Utilities().removePairs(null);
        assertNull(result);
    }

    @Test
    public void convert() {
        fail();
    }

    @Test
    public void nullIfOddLength() {
        fail();
    }
}