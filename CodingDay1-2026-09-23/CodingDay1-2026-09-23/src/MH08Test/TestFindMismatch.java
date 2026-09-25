package MH08Test;
import MH08.MH08;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.HashMap;

public class TestFindMismatch {

    @Test
    public void testFindMismatchN01() {
        String[] names = {"Adam", "Sandy", "Jill", "Sandy", "Jill", "Tom"};
        Integer[] ages = {20,     25,      30,     25,      40,     42};
        assertEquals("Jill", MH08.findMismatch(names, ages));
    }

    @Test
    public void testFindMismatchN02() {
        String[] names = {"A", "B", "C", "D", "E", "A"};
        Integer[] ages = {20,  25,  30,   25, 40,  42};
        assertEquals("A", MH08.findMismatch(names, ages));
    }

    @Test
    public void testFindMismatchN03() {
        String[] names = {"A", "B", "C", "D", "E", "A"};
        Integer[] ages = {20,  25,  30,   25, 40,  20};
        assertEquals("", MH08.findMismatch(names, ages));
    }

    @Test
    public void testFindMismatchN04() {
        String[] names = {"A", "B", "C", "D", "E", "A", "B", "C"};
        Integer[] ages = {20,  25,  30,   25, 40,  20,  25,  31};
        assertEquals("C", MH08.findMismatch(names, ages));
    }

    @Test
    public void testFindMismatchN05() {
        String[] names = {"A", "B", "C", "D", "E", "A", "A", "A"};
        Integer[] ages = {20,  25,  30,   25, 40,  20,  20,  31};
        assertEquals("A", MH08.findMismatch(names, ages));
    }

    @Test
    public void testFindMismatchN06() {
        String[] names = {"A", "B", "C", "D", "E", "A", "A", "A", "C", "B"};
        Integer[] ages = {20,  25,  30,   25, 40,  20,  20,  20,  40,  25};
        assertEquals("C", MH08.findMismatch(names, ages));
    }

    @Test
    public void testFindMismatchN07() {
        String[] names = {"A", "B", "C", "D", "E", "A", "A", "A", "C", "B"};
        Integer[] ages = {20,  25,  30,   25, 40,  20,  20,  20,  30,  30};
        assertEquals("B", MH08.findMismatch(names, ages));
    }

    @Test
    public void testFindMismatchN08() {
        String[] names = {"A", "A", "C", "D", "E", "A", "A", "A", "C", "B"};
        Integer[] ages = {20,  25,  30,   25, 40,  25,  25,  25,  30,  30};
        assertEquals("A", MH08.findMismatch(names, ages));
    }
}
