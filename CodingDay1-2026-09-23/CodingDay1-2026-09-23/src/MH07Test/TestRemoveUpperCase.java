package MH07Test;
import MH07.MH07;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRemoveUpperCase {

    @Test
    public void testRemoveUpperCase01() {
        assertEquals("hello", MH07.removeUpperCase("hello"));
    }

    @Test
    public void testRemoveUpperCase02() {
        assertEquals("", MH07.removeUpperCase("HELLO"));
    }

    @Test
    public void testRemoveUpperCase03() {
        assertEquals("here are the  droids", MH07.removeUpperCase("Where are the OTHER droids"));
    }

    @Test
    public void testRemoveUpperCase04() {
        assertEquals("rs-umn", MH07.removeUpperCase("rOsE-HuLmAn"));
    }

    @Test
    public void testRemoveUpperCase05() {
        assertEquals(" think  act", MH07.removeUpperCase("I think YOU act"));
    }

    @Test
    public void testRemoveUpperCase06() {
        assertEquals("haberdashery", MH07.removeUpperCase("WhaTUberDOORdashAReAHURry"));
    }

    @Test
    public void testRemoveUpperCase07() {
        assertEquals("", MH07.removeUpperCase(""));
    }

    @Test
    public void testRemoveUpperCase08() {
        assertEquals("1234!@#$", MH07.removeUpperCase("1234!@#$"));
    }

}

