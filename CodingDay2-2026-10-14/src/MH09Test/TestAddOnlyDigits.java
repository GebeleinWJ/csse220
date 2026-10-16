package MH09Test;
import MH09.MH09;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAddOnlyDigits {
    private static int testsPassed;
    private static int numberOfTests;

    @BeforeClass
    public static void oneTimeSetUp() {
        testsPassed = 0;
        numberOfTests = 0;
    } // oneTimeSetUp

    @AfterClass
    public static void oneTimeTearDown() {
        String className = TestAddOnlyDigits.class.getSimpleName();
    } // oneTimeTearDown

    // --------------------------------------------
    // JUnit Tests
    // --------------------------------------------


    @Test
    public void testAddOnlyDigits01() {
        numberOfTests++;
        assertEquals(6, MH09.addOnlyDigits("123"));
        testsPassed++;
    }

    @Test
    public void testAddOnlyDigits02() {
        numberOfTests++;
        assertEquals(0, MH09.addOnlyDigits("abc"));
        testsPassed++;
    }

    @Test
    public void testAddOnlyDigits03() {
        numberOfTests++;
        assertEquals(6, MH09.addOnlyDigits("abc123"));
        testsPassed++;
    }

    @Test
    public void testAddOnlyDigits04() {
        numberOfTests++;
        assertEquals(32, MH09.addOnlyDigits("ab23cd45op99"));
        testsPassed++;
    }

    @Test
    public void testAddOnlyDigits05() {
        numberOfTests++;
        assertEquals(10, MH09.addOnlyDigits("1111111111"));
        testsPassed++;
    }

    @Test
    public void testAddOnlyDigits06() {
        numberOfTests++;
        assertEquals(20, MH09.addOnlyDigits("1a1b1c1d1e1f1g1h1i1j1k9l"));
        testsPassed++;
    }
}
