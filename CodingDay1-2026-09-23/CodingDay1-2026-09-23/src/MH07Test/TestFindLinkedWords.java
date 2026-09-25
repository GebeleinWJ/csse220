package MH07Test;
import MH07.MH07;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestFindLinkedWords {

    private static void assertLinkedWords(String[] expected, String[] words) {
        ArrayList<String> expectedList = new ArrayList<>(Arrays.asList(expected));
        Collections.sort(expectedList);

        ArrayList<String> actualList = MH07.findLinkedWords(words);
        Collections.sort(actualList);

        assertEquals(expectedList, actualList);
    }

    @Test
    public void testFindLinkedWords01() {
        assertLinkedWords(new String[] { "bear" },
                new String[] { "bear", "read", "book" });
    }

    @Test
    public void testFindLinkedWords02() {
        assertLinkedWords(new String[] { "hi", "item", "meet" },
                new String[] { "hi", "item", "tea", "meet" });
    }

    @Test
    public void testFindLinkedWords03() {
        assertLinkedWords(new String[] { "croc" },
                new String[] { "croc" });
    }

    @Test
    public void testFindLinkedWords04() {
        assertLinkedWords(new String[] {},
                new String[] { "none", "of", "these", "words", "are", "linked" });
    }

    @Test
    public void testFindLinkedWords05() {
        assertLinkedWords(new String[] {},
                new String[] { "cat" });
    }

    @Test
    public void testFindLinkedWords06() {
        assertLinkedWords(new String[] { "cat", "tac" },
                new String[] { "cat", "tac" });
    }

    @Test
    public void testFindLinkedWords07() {
        assertLinkedWords(new String[] { "bat" },
                new String[] { "bat", "tea", "tac" });
    }

}
