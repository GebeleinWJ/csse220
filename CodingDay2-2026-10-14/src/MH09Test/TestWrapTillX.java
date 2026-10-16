package MH09Test;
import MH09.MH09;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestWrapTillX {
    private static int testsPassed;
    private static int numberOfTests;

    @BeforeClass
    public static void oneTimeSetUp() {
        testsPassed = 0;
        numberOfTests = 0;
    } // oneTimeSetUp

    @AfterClass
    public static void oneTimeTearDown() {
        String className = TestWrapTillX.class.getSimpleName();
    } // oneTimeTearDown

    // --------------------------------------------
    // JUnit Tests
    // --------------------------------------------

    @Test
    public void testWrapTillXN01() {
        numberOfTests++;
        assertEquals("ghijkabcdef", MH09.wrapTillX("abcdefxghijk"));
        testsPassed++;
    }

    @Test
    public void testWrapTillXN02() {
        numberOfTests++;
        assertEquals("", MH09.wrapTillX("x"));
        testsPassed++;
    }

    @Test
    public void testWrapTillXN03() {
        numberOfTests++;
        assertEquals("456123", MH09.wrapTillX("123x456"));
        testsPassed++;
    }

    @Test
    public void testWrapTillXN04() {
        numberOfTests++;
        assertEquals("12345", MH09.wrapTillX("12345x"));
        testsPassed++;
    }

    @Test
    public void testWrapTillXN05() {
        numberOfTests++;
        assertEquals("12345", MH09.wrapTillX("x12345"));
        testsPassed++;
    }

    @Test
    public void testWrapTillXN06() {
        numberOfTests++;
        assertEquals("klmnopqrstuvwyzabcdefghij", MH09.wrapTillX("abcdefghijxklmnopqrstuvwyz"));
        testsPassed++;
    }
}
