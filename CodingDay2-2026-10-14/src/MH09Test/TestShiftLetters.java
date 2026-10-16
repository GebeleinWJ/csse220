package MH09Test;
import MH09.MH09;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestShiftLetters {
    private static int testsPassed;
    private static int numberOfTests;

    @BeforeClass
    public static void oneTimeSetUp() {
        testsPassed = 0;
        numberOfTests = 0;
    } // oneTimeSetUp

    @AfterClass
    public static void oneTimeTearDown() {
        String className = TestShiftLetters.class.getSimpleName();
    } // oneTimeTearDown

    // --------------------------------------------
    // JUnit Tests
    // --------------------------------------------

    @Test
    public void testShiftLettersN01() {
        numberOfTests++;
        assertEquals("bcdefg", MH09.shiftLetters("abcdef"));
        testsPassed++;
    }

    @Test
    public void testShiftLettersN02() {
        numberOfTests++;
        assertEquals("ifmmp", MH09.shiftLetters("hello"));
        testsPassed++;
    }

    @Test
    public void testShiftLettersN03() {
        numberOfTests++;
        assertEquals("IFMMP", MH09.shiftLetters("HELLO"));
        testsPassed++;
    }

    @Test
    public void testShiftLettersN04() {
        numberOfTests++;
        assertEquals("cbaaA", MH09.shiftLetters("bazzZ"));
        testsPassed++;
    }

    @Test
    public void testShiftLettersN05() {
        numberOfTests++;
        assertEquals("bcdefghijklmnopqrstuvwxyzaBCDEFGHIJKLMNOPQRSTUVWXYZA", MH09.shiftLetters("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        testsPassed++;
    }
}
