package MH10_REF_004.starter;

/**
 * This class represents a Car with 4 wheels, a max of 5 passengers
 * and a variable number of cylinders.  Cylinders may be "hollowed"
 * out, effectively removing cylinders.
 */
public class Car extends Vehicle{
    private static int maxPassengers = 5;

    private int numWheels;
    private int numCylinders;

    public Car(int numCylinders) {
        super("Car");
        this.numWheels=4;
        this.numCylinders = numCylinders;
    }

    public int getNumCylinders() { return this.numCylinders; }


    public String hollowCylinder(int howMany) {
        if(this.numCylinders > howMany) {
            this.numCylinders -= howMany;
            return this.getClass().getSimpleName() + " hollowed " + howMany + " cylinder(s).";
        }

        return "Cannot hollow that many cylinders! No action taken.";
    }

    @Override
    public String toString() {
        String toReturn = this.getClass().getSimpleName() +  " has " + this.numWheels +
                " wheels, " + super.getNumPassengers() + " passengers currently, and has traveled " +
                super.getNumMilesTraveled() + " miles since last service.";

        toReturn += " This " + this.getClass().getSimpleName() +  " has " + this.numCylinders +
                " cylinders.";

        return toReturn;
    }
}
