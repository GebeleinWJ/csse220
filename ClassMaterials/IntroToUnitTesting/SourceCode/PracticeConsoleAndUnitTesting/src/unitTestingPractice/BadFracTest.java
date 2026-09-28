package unitTestingPractice;

import static org.junit.jupiter.api.Assertions.*;

public class BadFracTest {

    @org.junit.jupiter.api.Test
    public void test_gcm() {
    }

    @org.junit.jupiter.api.Test
    public void test_getNum() {
    }

    @org.junit.jupiter.api.Test
    public void test_getDen() {
    }

    @org.junit.jupiter.api.Test
    public void test_isReduced() {
        BadFrac frac1 = new BadFrac(2,7);
        assertTrue(frac1.isReduced());
        BadFrac frac2 = new BadFrac(1,4);
        assertTrue(frac2.isReduced());
        BadFrac frac3 = new BadFrac(2,4);
        assertFalse(frac3.isReduced());
        BadFrac frac4 = new BadFrac(0,4);
        assertFalse(frac4.isReduced());

    }

    @org.junit.jupiter.api.Test
    public void test_add() {
        BadFrac frac1 = new BadFrac(1,2);
        BadFrac frac2 = new BadFrac(1,3);
        BadFrac ans1 = frac1.add(frac2);
        assertEquals(5, ans1.getNum());
        assertEquals(6,ans1.getDen());
        BadFrac frac3 = new BadFrac(3,2);
        BadFrac frac4 = new BadFrac(4,3);
        BadFrac ans2 = frac3.add(frac4);
        assertEquals(17, ans2.getNum());
        assertEquals(6,ans2.getDen());
        BadFrac frac5 = new BadFrac(10,2);
        BadFrac frac6 = new BadFrac(1,30);
        BadFrac ans3 = frac5.add(frac6);
        assertEquals(302, ans3.getNum());
        assertEquals(60,ans3.getDen());
        BadFrac frac7 = new BadFrac(1,2);
        BadFrac frac8 = new BadFrac(1,2);
        BadFrac ans4 = frac7.add(frac8);
        assertEquals(2, ans4.getNum());
        assertEquals(2,ans4.getDen());
    }

    @org.junit.jupiter.api.Test
    public void testAdd() {
    }
}