package MH09Test;
import MH09.MH09;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAddThroughArray {
    private static int testsPassed;
    private static int numberOfTests;

    @BeforeClass
    public static void oneTimeSetUp() {
        testsPassed = 0;
        numberOfTests = 0;
    } // oneTimeSetUp

    @AfterClass
    public static void oneTimeTearDown() {
        String className = TestAddThroughArray.class.getSimpleName();
    } // oneTimeTearDown

    // --------------------------------------------
    // JUnit Tests
    // --------------------------------------------

    @Test
    public void testAddThroughArray01() {
        numberOfTests++;
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] expected = {1, 1, 6, 6, 6, 1, 1, 1, 1, 1};
        MH09.addThroughArray(array, 2, 5, 5);
        assertArrayEquals(expected, array);
        testsPassed++;
    }

    @Test
    public void testAddThroughArray02() {
        numberOfTests++;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {1, 2, 3, 4, 15, 16, 17, 18, 19, 10};
        MH09.addThroughArray(array, 4, 9, 10);
        assertArrayEquals(expected, array);
        testsPassed++;
    }

    @Test
    public void testAddThroughArray03() {
        numberOfTests++;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        MH09.addThroughArray(array, 0, 10, 10);
        assertArrayEquals(expected, array);
        testsPassed++;
    }

    @Test
    public void testAddThroughArray04() {
        numberOfTests++;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MH09.addThroughArray(array, 0, 0, 10);
        assertArrayEquals(expected, array);
        testsPassed++;
    }

    @Test
    public void testAddThroughArray05() {
        numberOfTests++;
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {0, -10, -10, -10, -10, -10, -10, -10, -10, 0, 0};
        MH09.addThroughArray(array, 1, 9, -10);
        assertArrayEquals(expected, array);
        testsPassed++;
    }

    @Test
    public void testAddThroughArray06() {
        numberOfTests++;
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        MH09.addThroughArray(array, 11, 11, -10);
        assertArrayEquals(expected, array);
        testsPassed++;
    }
}
