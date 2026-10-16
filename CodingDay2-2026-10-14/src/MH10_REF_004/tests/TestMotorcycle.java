package MH10_REF_004.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import MH10_REF_004.starter.Motorcycle;

public class TestMotorcycle {
    @Test
    public void testMotorcycle() {
        Motorcycle m = new Motorcycle(1500);
        assertEquals("Motorcycle", m.getClass().getSimpleName());
    }

    @Test
    public void testGetNumWheels() {
        Motorcycle m = new Motorcycle(1400);
        assertEquals(2, m.getNumWheels());
    }

    @Test
    public void testGetNumMilesTraveled() {
        Motorcycle m = new Motorcycle(1000);
        assertEquals(0, m.getNumMilesTraveled());
        m.travelBy(25);
        assertEquals(25, m.getNumMilesTraveled());
        m.travelBy(5);
        assertEquals(30, m.getNumMilesTraveled());
    }

    @Test
    public void testAddAndMaxPassengersByOne() {
        Motorcycle m = new Motorcycle(750);
        String resultString = "";
        resultString = m.addPassengers(1);
        assertEquals(1, m.getNumPassengers());
        assertEquals("Motorcycle added 1 passenger(s).", resultString);

        resultString = m.addPassengers(1);
        assertEquals(2, m.getNumPassengers());
        assertEquals("Motorcycle added 1 passenger(s).", resultString);

        resultString = m.addPassengers(1);
        assertEquals(2, m.getNumPassengers());
        assertEquals("This Motorcycle can only have 2 passengers! No action taken.", resultString);
    }

    @Test
    public void testAddAndMaxPassengersByMult() {
        Motorcycle m = new Motorcycle(450);
        String resultString = "";

        resultString = m.addPassengers(4);
        assertEquals(0, m.getNumPassengers());
        assertEquals("This Motorcycle can only have 2 passengers! No action taken.", resultString);

        resultString = m.addPassengers(2);
        assertEquals(2, m.getNumPassengers());
        assertEquals("Motorcycle added 2 passenger(s).", resultString);

        resultString = m.addPassengers(5);
        assertEquals(2, m.getNumPassengers());
        assertEquals("This Motorcycle can only have 2 passengers! No action taken.", resultString);
    }

    @Test
    public void testGetMotorSizeInCC() {
        Motorcycle m750 = new Motorcycle(750);
        assertEquals(750, m750.getMotorSizeInCC());

        Motorcycle m1500 = new Motorcycle(1500);
        assertEquals(1500, m1500.getMotorSizeInCC());

        Motorcycle m2300 = new Motorcycle(2300);
        assertEquals(2300, m2300.getMotorSizeInCC());
    }

    @Test
    public void testShaveMotor() {
        Motorcycle m1500 = new Motorcycle(1500);
        String resultString = "";
        assertEquals(1500, m1500.getMotorSizeInCC());

        resultString = m1500.shaveMotor(500);
        assertEquals(1000, m1500.getMotorSizeInCC());
        assertEquals("Motorcycle shaved 500cc('s) of motor.", resultString);

        Motorcycle m750 = new Motorcycle(750);
        assertEquals(750, m750.getMotorSizeInCC());

        resultString = m750.shaveMotor(60);
        assertEquals(690, m750.getMotorSizeInCC());
        assertEquals("Motorcycle shaved 60cc('s) of motor.", resultString);

        resultString = m750.shaveMotor(690);
        assertEquals(690, m750.getMotorSizeInCC());
        assertEquals("Cannot shave that much motor! No action taken.", resultString);

        resultString = m750.shaveMotor(689);
        assertEquals(1, m750.getMotorSizeInCC());
        assertEquals("Motorcycle shaved 689cc('s) of motor.", resultString);
    }

    @Test
    public void testMilesAndService() {
        Motorcycle m = new Motorcycle(1600);
        assertEquals(0, m.getNumMilesTraveled());
        m.travelBy(25);
        assertEquals(25, m.getNumMilesTraveled());
        m.service();
        assertEquals(0, m.getNumMilesTraveled());
        m.travelBy(5);
        assertEquals(5, m.getNumMilesTraveled());
        m.service();
        assertEquals(0, m.getNumMilesTraveled());
    }

    @Test
    public void testToString() {
        Motorcycle m = new Motorcycle(1250);
        m.addPassengers(2);
        m.travelBy(50);
        String expected = "Motorcycle has 2 wheels, 2 passengers currently, and has traveled 50 miles since last service.";
        expected += " This Motorcycle has 1250 size motor (currently).";

        assertEquals(expected, m.toString());
    }
}
