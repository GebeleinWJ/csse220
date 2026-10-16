package MH10_REF_004.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import MH10_REF_004.starter.Truck;

public class TestTruck {
    @Test
    public void testTruck() {
        Truck t = new Truck(50);
        assertEquals("Truck", t.getClass().getSimpleName());
    }

    @Test
    public void testGetNumWheels() {
        Truck t = new Truck(4);
        assertEquals(4, t.getNumWheels());
    }

    @Test
    public void testGetNumMilesTraveled() {
        Truck t = new Truck(6);
        assertEquals(0, t.getNumMilesTraveled());
        t.travelBy(25);
        assertEquals(25, t.getNumMilesTraveled());
        t.travelBy(5);
        assertEquals(30, t.getNumMilesTraveled());
    }

    @Test
    public void testAddAndMaxPassengersByOne() {
        Truck t = new Truck(8);
        String resultString = "";
        resultString = t.addPassengers(1);
        assertEquals(1, t.getNumPassengers());
        assertEquals("Truck added 1 passenger(s).", resultString);

        resultString = t.addPassengers(1);
        assertEquals(2, t.getNumPassengers());
        assertEquals("Truck added 1 passenger(s).", resultString);

        resultString = t.addPassengers(1);
        assertEquals(3, t.getNumPassengers());
        assertEquals("Truck added 1 passenger(s).", resultString);

        resultString = t.addPassengers(1);
        assertEquals(4, t.getNumPassengers());
        assertEquals("Truck added 1 passenger(s).", resultString);

        resultString = t.addPassengers(1);
        assertEquals(5, t.getNumPassengers());
        assertEquals("Truck added 1 passenger(s).", resultString);

        resultString = t.addPassengers(1);
        assertEquals(6, t.getNumPassengers());
        assertEquals("Truck added 1 passenger(s).", resultString);

        resultString = t.addPassengers(1);
        assertEquals(7, t.getNumPassengers());
        assertEquals("Truck added 1 passenger(s).", resultString);

        resultString = t.addPassengers(1);
        assertEquals(8, t.getNumPassengers());
        assertEquals("Truck added 1 passenger(s).", resultString);

        resultString = t.addPassengers(1);
        assertEquals(9, t.getNumPassengers());
        assertEquals("Truck added 1 passenger(s).", resultString);

        resultString = t.addPassengers(1);
        assertEquals(10, t.getNumPassengers());
        assertEquals("Truck added 1 passenger(s).", resultString);

        resultString = t.addPassengers(1);
        assertEquals(10, t.getNumPassengers());
        assertEquals("This Truck can only have 10 passengers! No action taken.", resultString);
    }

    @Test
    public void testAddAndMaxPassengersByMult() {
        Truck t = new Truck(8);
        String resultString = "";

        resultString = t.addPassengers(4);
        assertEquals(4, t.getNumPassengers());
        assertEquals("Truck added 4 passenger(s).", resultString);

        resultString = t.addPassengers(10);
        assertEquals(4, t.getNumPassengers());
        assertEquals("This Truck can only have 10 passengers! No action taken.", resultString);

        resultString = t.addPassengers(5);
        assertEquals(9, t.getNumPassengers());
        assertEquals("Truck added 5 passenger(s).", resultString);

        resultString = t.addPassengers(5);
        assertEquals(9, t.getNumPassengers());
        assertEquals("This Truck can only have 10 passengers! No action taken.", resultString);
    }

    @Test
    public void testGetTruckBedSquareFootage() {
        Truck t45 = new Truck(45);
        assertEquals(45, t45.getTruckBedSquareFootage());

        Truck t50 = new Truck(50);
        assertEquals(50, t50.getTruckBedSquareFootage());

        Truck t55 = new Truck(55);
        assertEquals(55, t55.getTruckBedSquareFootage());
    }

    @Test
    public void testCutBed() {
        Truck t45 = new Truck(45);
        String resultString = "";
        assertEquals(45, t45.getTruckBedSquareFootage());

        resultString = t45.cutBed(11);
        assertEquals(34, t45.getTruckBedSquareFootage());
        assertEquals("Truck cut 11 square feet of the bed.", resultString);

        Truck t60 = new Truck(60);
        assertEquals(60, t60.getTruckBedSquareFootage());

        resultString = t60.cutBed(16);
        assertEquals(44, t60.getTruckBedSquareFootage());
        assertEquals("Truck cut 16 square feet of the bed.", resultString);

        resultString = t60.cutBed(44);
        assertEquals(44, t60.getTruckBedSquareFootage());
        assertEquals("Cannot cut that much bed! No action taken.", resultString);

        resultString = t60.cutBed(43);
        assertEquals(1, t60.getTruckBedSquareFootage());
        assertEquals("Truck cut 43 square feet of the bed.", resultString);
    }

    @Test
    public void testMilesAndService() {
        Truck t = new Truck(60);
        assertEquals(0, t.getNumMilesTraveled());
        t.travelBy(25);
        assertEquals(25, t.getNumMilesTraveled());
        t.service();
        assertEquals(0, t.getNumMilesTraveled());
        t.travelBy(5);
        assertEquals(5, t.getNumMilesTraveled());
        t.service();
        assertEquals(0, t.getNumMilesTraveled());
    }

    @Test
    public void testToString() {
        Truck t = new Truck(50);
        t.addPassengers(3);
        t.travelBy(50);
        String expected = "Truck has 4 wheels, 3 passengers currently, and has traveled 50 miles since last service.";
        expected += " This Truck has 50 square footage in the bed.";

        assertEquals(expected, t.toString());
    }
}
