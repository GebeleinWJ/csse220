package MH07Test;
import MH07.MH07;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestProductOfDiagonal {

    @Test
    public void testProductOfDiagonal01() {
        assertEquals(45, MH07.productOfDiagonal(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }));
    }

    @Test
    public void testProductOfDiagonal02() {
        assertEquals(0, MH07.productOfDiagonal(new int[0][0]));
    }

    @Test
    public void testProductOfDiagonal03() {
        assertEquals(6, MH07.productOfDiagonal(new int[][]{
                {-3, 4},
                {5, -2}
        }));
    }

    @Test
    public void testProductOfDiagonal04() {
        assertEquals(7, MH07.productOfDiagonal(new int[][]{
                {7}
        }));
    }

    @Test
    public void testProductOfDiagonal05() {
        assertEquals(0, MH07.productOfDiagonal(null));
    }

    @Test
    public void testProductOfDiagonal06() {
        assertEquals(0, MH07.productOfDiagonal(new int[][]{
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15}
        }));
    }

    @Test
    public void testProductOfDiagonal07() {
        assertEquals(-6, MH07.productOfDiagonal(new int[][]{
                {-1, 0, 0},
                {0, 2, 0},
                {0, 0, 3}
        }));
    }

}
