package MH08Test;
import MH08.MH08;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class TestDefinitionContains {

    @Test
    public void testDefinitionContainsN01() {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("science", "a branch of knowledge or study dealing with a body of facts or truths systematically arranged and showing the operation of general laws");
        dictionary.put("computer", "programmable electronic device designed to accept data, perform prescribed mathematical and logical operations at high speed, and display the results of these operations");
        dictionary.put("program", "a precise sequence of instructions enabling a computer to perform a task; a piece of software");
        dictionary.put("data", "information in digital format, as encoded text or numbers, or multimedia images, audio, or vide");
        dictionary.put("calculator", "a small electronic or mechanical device that performs calculations, requiring manual action for each individual operation");
        String termToFind = "device";

        ArrayList<String> expectedWords = new ArrayList<>(Arrays.asList(new String[]{"computer", "calculator"}));
        ArrayList<String> actualWords = MH08.definitionContains(dictionary, termToFind);
        Collections.sort(expectedWords);
        Collections.sort((actualWords));
        assertEquals(expectedWords, actualWords);
    }

    @Test
    public void testDefinitionContainsN02() {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("1", "A B C");
        dictionary.put("2", "C D E");
        dictionary.put("3", "E F G");
        dictionary.put("4", "A B");
        dictionary.put("5", "C E F");
        String termToFind = "C";

        ArrayList<String> expectedWords = new ArrayList<>(Arrays.asList(new String[]{"1", "2", "5"}));
        ArrayList<String> actualWords = MH08.definitionContains(dictionary, termToFind);
        Collections.sort(expectedWords);
        Collections.sort((actualWords));
        assertEquals(expectedWords, actualWords);
    }

    @Test
    public void testDefinitionContainsN03() {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("1", "A B C");
        dictionary.put("2", "C D E");
        dictionary.put("3", "E F G");
        dictionary.put("4", "A");
        dictionary.put("5", "C E F");
        String termToFind = "A";

        ArrayList<String> expectedWords = new ArrayList<>(Arrays.asList(new String[]{"1", "4"}));
        ArrayList<String> actualWords = MH08.definitionContains(dictionary, termToFind);
        Collections.sort(expectedWords);
        Collections.sort((actualWords));
        assertEquals(expectedWords, actualWords);
    }

    @Test
    public void testDefinitionContainsN04() {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("1", "A B C");
        dictionary.put("2", "C D E");
        dictionary.put("3", "E F G");
        dictionary.put("4", "A");
        dictionary.put("5", "C E F");
        String termToFind = "B";

        ArrayList<String> expectedWords = new ArrayList<>(Arrays.asList(new String[]{"1"}));
        ArrayList<String> actualWords = MH08.definitionContains(dictionary, termToFind);
        Collections.sort(expectedWords);
        Collections.sort((actualWords));
        assertEquals(expectedWords, actualWords);
    }

    @Test
    public void testDefinitionContainsN05() {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("1", "A B C");
        dictionary.put("2", "C D E");
        dictionary.put("3", "E F G");
        dictionary.put("4", "A");
        dictionary.put("5", "C E F");
        String termToFind = "E";

        ArrayList<String> expectedWords = new ArrayList<>(Arrays.asList(new String[]{"2", "3", "5"}));
        ArrayList<String> actualWords = MH08.definitionContains(dictionary, termToFind);
        Collections.sort(expectedWords);
        Collections.sort((actualWords));
        assertEquals(expectedWords, actualWords);
    }

    @Test
    public void testDefinitionContainsN06() {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("1", "A B C");
        dictionary.put("2", "C D E");
        dictionary.put("3", "E F G");
        dictionary.put("4", "A");
        dictionary.put("5", "C E F");
        String termToFind = "F";

        ArrayList<String> expectedWords = new ArrayList<>(Arrays.asList(new String[]{"3", "5"}));
        ArrayList<String> actualWords = MH08.definitionContains(dictionary, termToFind);
        Collections.sort(expectedWords);
        Collections.sort((actualWords));
        assertEquals(expectedWords, actualWords);
    }

    @Test
    public void testDefinitionContainsN07() {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("1", "A B C");
        dictionary.put("2", "C D E");
        dictionary.put("3", "E F G");
        dictionary.put("4", "A");
        dictionary.put("5", "C E F");
        String termToFind = "G";

        ArrayList<String> expectedWords = new ArrayList<>(Arrays.asList(new String[]{"3"}));
        ArrayList<String> actualWords = MH08.definitionContains(dictionary, termToFind);
        Collections.sort(expectedWords);
        Collections.sort((actualWords));
        assertEquals(expectedWords, actualWords);
    }

    @Test
    public void testDefinitionContainsN08() {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("1", "A B C");
        dictionary.put("2", "C D E");
        dictionary.put("3", "E F G");
        dictionary.put("4", "A");
        dictionary.put("5", "C E F");
        String termToFind = "H";

        ArrayList<String> expectedWords = new ArrayList<>();
        ArrayList<String> actualWords = MH08.definitionContains(dictionary, termToFind);

        assertEquals(expectedWords, actualWords);
    }
}
