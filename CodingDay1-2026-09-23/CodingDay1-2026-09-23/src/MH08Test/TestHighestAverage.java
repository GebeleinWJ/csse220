package MH08Test;
import MH08.MH08;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestHighestAverage {

    @Test
    public void testHighestAverageN01() {
        HashMap<String, ArrayList<Integer>> namesToGrades = new HashMap<>();

        for(int i = 1; i <= 20; i++) {
            namesToGrades.put("Name"+i, new ArrayList<>());
            namesToGrades.get("Name"+i).add(i);
            namesToGrades.get("Name"+i).add(i+1);
            namesToGrades.get("Name"+i).add(i+2);
            namesToGrades.get("Name"+i).add(i+3);
            namesToGrades.get("Name"+i).add(i+4);
            namesToGrades.get("Name"+i).add(i+5);
        }

        assertEquals("Name20", MH08.highestAverage(namesToGrades));
    }

    @Test
    public void testHighestAverageN02() {
        Integer[] lower = {77, 88, 99};
        Integer[] higher = {100, 101};
        HashMap<String, ArrayList<Integer>> namesToGrades = new HashMap<>();
        namesToGrades.put("Sam", new ArrayList<>(Arrays.asList(new Integer[]{66})));
        namesToGrades.put("Jill", new ArrayList<>(Arrays.asList(lower)));
        namesToGrades.put("Jane", new ArrayList<>(Arrays.asList(higher)));
        namesToGrades.put("Pete", new ArrayList<>(Arrays.asList(lower)));
        assertEquals("Jane", MH08.highestAverage(namesToGrades));
    }

    @Test
    public void testHighestAverageN03() {
        HashMap<String, ArrayList<Integer>> namesToGrades = new HashMap<>();
        namesToGrades.put("Sam", new ArrayList<>(Arrays.asList(new Integer[]{66})));
        namesToGrades.put("Jill", new ArrayList<>(Arrays.asList(new Integer[]{67})));
        namesToGrades.put("Pete", new ArrayList<>(Arrays.asList(new Integer[]{68})));
        namesToGrades.put("Jane", new ArrayList<>(Arrays.asList(new Integer[]{69})));
        namesToGrades.put("Ron", new ArrayList<>(Arrays.asList(new Integer[]{70})));
        assertEquals("Ron", MH08.highestAverage(namesToGrades));
    }

    @Test
    public void testHighestAverageN04() {
        HashMap<String, ArrayList<Integer>> namesToGrades = new HashMap<>();
        namesToGrades.put("Jill", new ArrayList<>(Arrays.asList(new Integer[]{1})));
        assertEquals("Jill", MH08.highestAverage(namesToGrades));
    }

    @Test
    public void testHighestAverageN05() {
        HashMap<String, ArrayList<Integer>> namesToGrades = new HashMap<>();
        namesToGrades.put("Sam", new ArrayList<>(Arrays.asList(new Integer[]{100})));
        namesToGrades.put("Jill", new ArrayList<>(Arrays.asList(new Integer[]{60, 61, 62, 63})));
        namesToGrades.put("Pete", new ArrayList<>(Arrays.asList(new Integer[]{70, 70, 70, 70, 70, 70})));
        namesToGrades.put("Jane", new ArrayList<>(Arrays.asList(new Integer[]{99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99})));
        namesToGrades.put("Ron", new ArrayList<>(Arrays.asList(new Integer[]{25, 50, 75, 100, 101})));
        assertEquals("Sam", MH08.highestAverage(namesToGrades));
    }

    @Test
    public void testHighestAverageN06() {
        HashMap<String, ArrayList<Integer>> namesToGrades = new HashMap<>();
        namesToGrades.put("Sam", new ArrayList<>(Arrays.asList(new Integer[]{90, 90, 90})));
        namesToGrades.put("Jill", new ArrayList<>(Arrays.asList(new Integer[]{90, 90, 90, 90})));
        namesToGrades.put("Pete", new ArrayList<>(Arrays.asList(new Integer[]{90, 90, 90, 91})));
        namesToGrades.put("Jane", new ArrayList<>(Arrays.asList(new Integer[]{90})));
        namesToGrades.put("Ron", new ArrayList<>(Arrays.asList(new Integer[]{90, 90, 90, 90, 90, 90, 90, 90})));
        assertEquals("Pete", MH08.highestAverage(namesToGrades));
    }
}
