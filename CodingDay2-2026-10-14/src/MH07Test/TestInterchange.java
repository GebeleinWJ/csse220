package MH07Test;
import MH07.MH07;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
public class TestInterchange {
	
	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------


	@Test
	public void testInterchange1() {
		String input1 = "1234567";
		String input2 = "ABCDEFG";
		Character[] resultArray = {'1', 'B', '3', 'D', '5', 'F', '7'};
		ArrayList<Character> result = new ArrayList<Character>(Arrays.asList(resultArray));
		
		assertTrue(result.equals(MH07.interchange(input1, input2)));
	}
	
	@Test
	public void testInterchange2() {
		String input1 = "Hello123";
		String input2 = "Stringab";
		Character[] resultArray = new Character[]{'H', 't', 'l', 'i', 'o', 'g', '2', 'b'};
		ArrayList<Character> result = new ArrayList<Character>(Arrays.asList(resultArray));
		
		assertTrue(result.equals(MH07.interchange(input1, input2)));
	}
		
	@Test
    public void testInterchange3() {
        String input1 = "";
        String input2 = "";
        Character[] resultArray = new Character[]{};
        ArrayList<Character> result = new ArrayList<Character>(Arrays.asList(resultArray));

        assertTrue(result.equals(MH07.interchange(input1, input2)));
    }
	
	@Test
	public void testInterchange4() {
		
		String input1 = "ABC";
		String input2 = "DEF";
		Character[] resultArray = new Character[]{'A', 'E', 'C'};
		ArrayList<Character> result = new ArrayList<Character>(Arrays.asList(resultArray));
		
		assertTrue(result.equals(MH07.interchange(input1, input2)));
	}
		
	@Test
	public void testInterchange5() {
		String input1 = "AB";
		String input2 = "DE";
		Character[] resultArray = new Character[]{'A', 'E'};
		ArrayList<Character> result = new ArrayList<Character>(Arrays.asList(resultArray));
		
		assertTrue(result.equals(MH07.interchange(input1, input2)));
	}
	
	@Test
	public void testInterchange6() {
		
		//big test
		String input1 = "";
		String input2 = "";
		ArrayList<Character> result = new ArrayList<Character>();
		int firstAsciiLetter = 97; //ASCII value of letter 'a'
		int lastAsciiLetter = 122; //ASCII value of letter 'z'
		for (int i = 0; i < 200; i++) { //make a 200 character string that contains all lower-case letters
			char tempChar1 = (char) ((i%(lastAsciiLetter-firstAsciiLetter+1))+firstAsciiLetter);
			char tempChar2 = (char) (((i+1)%(lastAsciiLetter-firstAsciiLetter+1))+firstAsciiLetter);
			input1 += "" + tempChar1;
			input2 += "" + tempChar2;
			if(i%2==0)
				result.add(tempChar1);
			else
				result.add(tempChar2);
		}
		
		assertTrue(result.equals(MH07.interchange(input1, input2)));
	}
}
