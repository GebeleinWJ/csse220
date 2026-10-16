package MH10_REF_004.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import MH10_REF_004.starter.Car;

public class TestCar {

    @Test
    public void testCar() {
        Car c = new Car(6);
        assertEquals("Car", c.getClass().getSimpleName());
    }

    @Test
    public void testGetNumWheels() {
        Car c = new Car(4);
        assertEquals(4, c.getNumWheels());
    }

    @Test
    public void testGetNumMilesTraveled() {
        Car c = new Car(6);
        assertEquals(0, c.getNumMilesTraveled());
        c.travelBy(25);
        assertEquals(25, c.getNumMilesTraveled());
        c.travelBy(5);
        assertEquals(30, c.getNumMilesTraveled());
    }

    @Test
    public void testAddAndMaxPassengersByOne() {
        Car c = new Car(8);
        String resultString = "";
        resultString = c.addPassengers(1);
        assertEquals(1, c.getNumPassengers());
        assertEquals("Car added 1 passenger(s).", resultString);

        resultString = c.addPassengers(1);
        assertEquals(2, c.getNumPassengers());
        assertEquals("Car added 1 passenger(s).", resultString);

        resultString = c.addPassengers(1);
        assertEquals(3, c.getNumPassengers());
        assertEquals("Car added 1 passenger(s).", resultString);

        resultString = c.addPassengers(1);
        assertEquals(4, c.getNumPassengers());
        assertEquals("Car added 1 passenger(s).", resultString);

        resultString = c.addPassengers(1);
        assertEquals(5, c.getNumPassengers());
        assertEquals("Car added 1 passenger(s).", resultString);

        resultString = c.addPassengers(1);
        assertEquals(5, c.getNumPassengers());
        assertEquals("This Car can only have 5 passengers! No action taken.", resultString);
    }

    @Test
    public void testAddAndMaxPassengersByMult() {
        Car c = new Car(8);
        String resultString = "";

        resultString = c.addPassengers(1);
        assertEquals(1, c.getNumPassengers());
        assertEquals("Car added 1 passenger(s).", resultString);

        resultString = c.addPassengers(5);
        assertEquals(1, c.getNumPassengers());
        assertEquals("This Car can only have 5 passengers! No action taken.", resultString);

        resultString = c.addPassengers(3);
        assertEquals(4, c.getNumPassengers());
        assertEquals("Car added 3 passenger(s).", resultString);

        resultString = c.addPassengers(5);
        assertEquals(4, c.getNumPassengers());
        assertEquals("This Car can only have 5 passengers! No action taken.", resultString);
    }

    @Test
    public void testGetNumCylinders() {
        Car c4 = new Car(4);
        assertEquals(4, c4.getNumCylinders());

        Car c6 = new Car(6);
        assertEquals(6, c6.getNumCylinders());

        Car c8 = new Car(8);
        assertEquals(8, c8.getNumCylinders());
    }

    @Test
    public void testHollowCylinder() {
        Car c4 = new Car(4);
        String resultString = "";
        assertEquals(4, c4.getNumCylinders());

        resultString = c4.hollowCylinder(1);
        assertEquals(3, c4.getNumCylinders());
        assertEquals("Car hollowed 1 cylinder(s).", resultString);

        Car c6 = new Car(6);
        assertEquals(6, c6.getNumCylinders());

        resultString = c6.hollowCylinder(4);
        assertEquals(2, c6.getNumCylinders());
        assertEquals("Car hollowed 4 cylinder(s).", resultString);

        resultString = c6.hollowCylinder(2);
        assertEquals(2, c6.getNumCylinders());
        assertEquals("Cannot hollow that many cylinders! No action taken.", resultString);

        resultString = c6.hollowCylinder(3);
        assertEquals(2, c6.getNumCylinders());
        assertEquals("Cannot hollow that many cylinders! No action taken.", resultString);

        Car c8 = new Car(8);
        assertEquals(8, c8.getNumCylinders());

        resultString = c8.hollowCylinder(8);
        assertEquals(8, c8.getNumCylinders());
        assertEquals("Cannot hollow that many cylinders! No action taken.", resultString);

        resultString = c8.hollowCylinder(7);
        assertEquals(1, c8.getNumCylinders());
        assertEquals("Car hollowed 7 cylinder(s).", resultString);
    }

    @Test
    public void testMilesAndService() {
        Car c = new Car(6);
        assertEquals(0, c.getNumMilesTraveled());
        c.travelBy(25);
        assertEquals(25, c.getNumMilesTraveled());
        c.service();
        assertEquals(0, c.getNumMilesTraveled());
        c.travelBy(5);
        assertEquals(5, c.getNumMilesTraveled());
        c.service();
        assertEquals(0, c.getNumMilesTraveled());
    }

    @Test
    public void testToString() {
        Car c = new Car(6);
        c.addPassengers(3);
        c.travelBy(50);
        String expected = "Car has 4 wheels, 3 passengers currently, and has traveled 50 miles since last service.";
        expected += " This Car has 6 cylinders.";

        assertEquals(expected, c.toString());
    }
}
