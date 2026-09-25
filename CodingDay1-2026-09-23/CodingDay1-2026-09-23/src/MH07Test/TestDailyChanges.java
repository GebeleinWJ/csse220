package MH07Test;
import MH07.MH07;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestDailyChanges {

    @Test
    public void testDailyChanges01() {
        assertEquals(new ArrayList<>(Arrays.asList(1, 1, 1)),
                MH07.dailyChanges(new int[]{0, 1, 2, 3}));
    }

    @Test
    public void testDailyChanges02() {
        assertEquals(new ArrayList<Integer>(),
                MH07.dailyChanges(new int[]{}));
    }

    @Test
    public void testDailyChanges03() {
        assertEquals(new ArrayList<>(Arrays.asList(-2, 5)),
                MH07.dailyChanges(new int[]{5, 3, 8}));
    }

    @Test
    public void testDailyChanges04() {
        assertEquals(new ArrayList<>(Arrays.asList(-99, 98, -97, 96)),
                MH07.dailyChanges(new int[]{100, 1, 99, 2, 98}));
    }

    @Test
    public void testDailyChanges05() {
        assertEquals(new ArrayList<Integer>(),
                MH07.dailyChanges(new int[]{9}));
    }

    @Test
    public void testDailyChanges06() {
        assertEquals(new ArrayList<>(Arrays.asList(15)),
                MH07.dailyChanges(new int[]{10, 25}));
    }

    @Test
    public void testDailyChanges07() {
        assertEquals(new ArrayList<>(Arrays.asList(0, 0, 0)),
                MH07.dailyChanges(new int[]{4, 4, 4, 4}));
    }
}
