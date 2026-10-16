package MH08Test;
import MH08.MH08;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCount {
	@Test
	public void testCount() {
		String[] letters = new String[] {"A", "A", "A", "B", "C", "A", "B", "D"};
		String[] names = new String[] {"Bob", "Joe", "Rick", "Joe", "Mike", "Bob", "Alice"};
		assertEquals(2, MH08.count(1, letters));
		assertEquals(1, MH08.count(2, letters));
		assertEquals(0, MH08.count(3, letters));
		assertEquals(1, MH08.count(4, letters));
		assertEquals(3, MH08.count(1, names));
		assertEquals(2, MH08.count(2, names));
	}
}
