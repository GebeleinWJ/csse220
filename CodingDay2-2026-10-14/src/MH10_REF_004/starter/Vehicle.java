package MH10_REF_004.starter;

import java.util.Vector;

/**
 * This class combines all the common features of the Car, Truck, and Motorcycle classes,
 * into one super package.
 * Author: Will Gebelein
 */
public class Vehicle {
    private int maxPassengers;
    private int numWheels;
    private int numMilesTraveled;
    private int numPassengers;
    public Vehicle(String type){
        this.numMilesTraveled = 0;
        this.numPassengers = 0;

        if(type.equals("Car")){
            this.maxPassengers=5;//Less code doing it like this
            this.numWheels=4;
        }
        else if(type.equals("Motorcycle")){
            this.maxPassengers=2;
            this.numWheels=2;
        }
        else if(type.equals("Truck")){
            this.maxPassengers=10;
            this.numWheels=4;
        }
    }
    public int getNumWheels() { return this.numWheels; }
    public int getNumMilesTraveled() { return this.numMilesTraveled; }
    public int getNumPassengers() { return this.numPassengers; }
    public void travelBy(int miles) {
        this.numMilesTraveled += miles;
    }
    public void service() {
        this.numMilesTraveled = 0;
    }

    public String addPassengers(int numToAdd) {
        if((this.numPassengers + numToAdd) <= maxPassengers) {
            this.numPassengers += numToAdd;
            return this.getClass().getSimpleName() + " added " + numToAdd + " passenger(s).";
        }
        return "This " + this.getClass().getSimpleName() + " can only have " +
                maxPassengers + " passengers! No action taken.";

    }
    public String toString() {
        String toReturn = this.getClass().getSimpleName() +  " has " + this.numWheels +
                " wheels, " + this.numPassengers + " passengers currently, and has traveled " +
                this.numMilesTraveled + " miles since last service.";

        return toReturn;
    }
}
