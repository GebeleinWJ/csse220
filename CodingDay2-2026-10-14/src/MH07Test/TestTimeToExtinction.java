package MH07Test;
import MH07.MH07;

import static org.junit.Assert.*;
import org.junit.Test;
public class TestTimeToExtinction {
	

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------


	@Test
	public void testTimeToExtinction1() {
		assertEquals(1, MH07.timeToExtinction(1)  );
		assertEquals(2, MH07.timeToExtinction(1.5)  );
		assertEquals(13, MH07.timeToExtinction(12.5)  );
	}
	
	@Test
	public void testTimeToExtinction2() {
		assertEquals(2, MH07.timeToExtinction(2)  );
		assertEquals(50, MH07.timeToExtinction(50)  );
		assertEquals(99, MH07.timeToExtinction(99)  );
		assertEquals(52, MH07.timeToExtinction(200)  );
	}
	
	@Test
	public void testTimeToExtinction3() {
		assertEquals(51, MH07.timeToExtinction(100)  );
		assertEquals(67, MH07.timeToExtinction(1000)  );
		assertEquals(86, MH07.timeToExtinction(10000)  );
	}
	
	@Test
	public void testTimeToExtinction4() {
		assertEquals(80, MH07.timeToExtinction(277432)  );
		assertEquals(61, MH07.timeToExtinction(52224)  );

		
	}
}