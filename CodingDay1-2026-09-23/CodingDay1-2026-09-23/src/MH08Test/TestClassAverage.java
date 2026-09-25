package MH08Test;
import MH08.MH08;

import java.util.HashMap;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestClassAverage {

    @Test
    public void testClassAverageN01() {
        String[] names = {"Jill", "Sam", "Tim", "Jane", "Rick"};
        Integer[] grades = {90, 91, 92, 93, 94};
        HashMap<String, Integer> gradesMap = new HashMap<>();
        for(int i = 0; i < names.length; i++) {
            gradesMap.put(names[i], grades[i]);
        }
        assertEquals(92, MH08.classAverage(gradesMap), 0.001);
    }

    @Test
    public void testClassAverageN02() {
        String[] names = {"A", "B", "C", "D", "E"};
        Integer[] grades = {90, 90, 90, 90, 90};
        HashMap<String, Integer> gradesMap = new HashMap<>();
        for(int i = 0; i < names.length; i++) {
            gradesMap.put(names[i], grades[i]);
        }
        assertEquals(90, MH08.classAverage(gradesMap), 0.001);
    }

    @Test
    public void testClassAverageN03() {
        String[] names = {"A", "B", "C", "D", "E"};
        Integer[] grades = {90, 90, 90, 90, 91};
        HashMap<String, Integer> gradesMap = new HashMap<>();
        for(int i = 0; i < names.length; i++) {
            gradesMap.put(names[i], grades[i]);
        }
        assertEquals(90.2, MH08.classAverage(gradesMap), 0.001);
    }

    @Test
    public void testClassAverageN04() {
        String[] names = {"A", "B"};
        Integer[] grades = {90, 91};
        HashMap<String, Integer> gradesMap = new HashMap<>();
        for(int i = 0; i < names.length; i++) {
            gradesMap.put(names[i], grades[i]);
        }
        assertEquals(90.5, MH08.classAverage(gradesMap), 0.001);
    }

    @Test
    public void testClassAverageN05() {
        String[] names = {"A"};
        Integer[] grades = {90};
        HashMap<String, Integer> gradesMap = new HashMap<>();
        for(int i = 0; i < names.length; i++) {
            gradesMap.put(names[i], grades[i]);
        }
        assertEquals(90, MH08.classAverage(gradesMap), 0.001);
    }

    @Test
    public void testClassAverageN06() {
        String[] names = {"A", "B", "C", "D"};
        Integer[] grades = {70, 50, 65, 88};
        HashMap<String, Integer> gradesMap = new HashMap<>();
        for(int i = 0; i < names.length; i++) {
            gradesMap.put(names[i], grades[i]);
        }
        assertEquals(68.25, MH08.classAverage(gradesMap), 0.001);
    }
}
