package m03_challenges1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertArrayEquals;

public class UtilitiesTest {

    private Utilities utils;

    @Before
    public void setup() {
        utils = new Utilities();
    }

    @Test
    public void everyNthChar_1() {
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        int n = 2;
        char[] resultArray = utils.everyNthChar(hello, n);
        char[] expectedArray = {'e', 'l'};
        assertArrayEquals(expectedArray, resultArray);
        //assertEquals(Arrays.toString(expectedArray), Arrays.toString(resultArray));
    }

    @Test
    public void everyNthChar_2() {
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        int n = 6;
        utils.everyNthChar(hello, n);
    }

    @Test
    public void removePairs_first() {
        String string = "AABCDDEFF";
        String result = utils.removePairs(string);
        assertEquals("ABCDEF", result);
    }

    @Test
    public void removePairs_second() {
        String string = "ABCCABDEEF";
        String result = utils.removePairs(string);
        assertEquals("ABCABDEF", result);
    }

    @Test
    public void removePairs_third() {
        String string = "A";
        String result = utils.removePairs(string);
        assertEquals("A", result);
    }

    @Test
    public void removePairs_fourth() {
        String result = utils.removePairs(null);
        assertNull(result);
    }

    @Test
    public void convert_1() {
        int result = utils.convert(10, 5);
        assertEquals(300, result);
    }

    @Test(expected = ArithmeticException.class)
    public void convert_2() {
        utils.convert(10, 0);
    }

    @Test
    public void nullIfOddLength() {
        String str1 = "dog";
        String str2 = "potato";
        String result1 = utils.nullIfOddLength(str1);
        assertNull(result1);
        String result2 = utils.nullIfOddLength(str2);
        assertNotNull(result2);
    }
}