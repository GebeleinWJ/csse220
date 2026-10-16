package MH08Test;
import MH08.MH08;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIsValidMenu {

	// JUnit tests for isValidMenu
	
	@Test
    public void testGoodMenu() {
        String[] menu = {"tenders", "hamburgers", "fish", "sushi", "pot pie", "curry", "steak"};
        assertTrue(MH08.isValidMenu(menu));        
    }
	
	@Test
    public void testGoodMenu2() {
        String[] menu = {"tofu", "fish", "tenders", "sushi", "hot dogs", "curry", "steak"};
        assertTrue(MH08.isValidMenu(menu));
    }
	
	@Test
    public void testValidMenuButIWouldHateIt() {
        String[] menu = {"liver", "mushrooms", "blood pudding", "fermented shark", "live octopus", "tenders", "grass"};
        assertTrue(MH08.isValidMenu(menu));
    }
	
	@Test
    public void testTooManyTenders() {
        String[] menu = {"tenders", "tenders", "tenders", "tenders", "tenders", "tenders", "tenders"};
        assertFalse(MH08.isValidMenu(menu));
    }
	
	@Test
    public void testMissingTenders() {
        String[] menu = {"nuggets", "hamburgers", "fish", "sushi", "pot pie", "curry", "steak"};
        assertFalse(MH08.isValidMenu(menu));
	}
    
	@Test
    public void testNotEnoughEntrees() {
        String[] menu = {"tenders", "hamburgers", "fish", "bacon", "pot pie", "curry"};
        assertFalse(MH08.isValidMenu(menu));
    }
	
	@Test
    public void testEmptyMenu() {
        String[] menu = {};
        assertFalse(MH08.isValidMenu(menu));

    }
	
	@Test
    public void testRepeatedEntreeOnce() {
        String[] menu = {"tenders", "hamburgers", "fish", "hamburgers", "pot pie", "curry", "hot dogs"};
        assertTrue(MH08.isValidMenu(menu));
    }
	
	@Test
    public void testRepeatedEntreeTwice() {
        String[] menu = {"tenders", "hamburgers", "hamburgers", "hamburgers", "pot pie", "curry", "hot dogs"};
        assertFalse(MH08.isValidMenu(menu));
    }
	
	
		
}
