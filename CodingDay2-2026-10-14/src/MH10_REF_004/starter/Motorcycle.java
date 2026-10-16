package MH10_REF_004.starter;

/**
 * This class represents a Motorcycle with 2 wheels, a max of 2 passengers
 * and a variable sized engine in CCs.  Engines may be (somehow) "shaved"
 * effectively reducing the size of the engine in CCs.
 */
public class Motorcycle extends Vehicle{
    private static int maxPassengers = 2;

    private int numWheels;
    private int motorSizeInCC;

    public Motorcycle(int motorSizeInCC) {
        super("Motorcycle");
        this.motorSizeInCC = motorSizeInCC;
        this.numWheels=2;
    }
    public int getMotorSizeInCC() { return this.motorSizeInCC; }

    public String shaveMotor(int downsize) { //we know... not really possible
        if(this.motorSizeInCC > downsize) {
            this.motorSizeInCC -= downsize;
            return this.getClass().getSimpleName() + " shaved " + downsize + "cc('s) of motor.";
        }

        return "Cannot shave that much motor! No action taken.";
    }

    @Override
    public String toString() {
        String toReturn = this.getClass().getSimpleName() +  " has " + this.numWheels +
                " wheels, " + super.getNumPassengers() + " passengers currently, and has traveled " +
                super.getNumMilesTraveled() + " miles since last service.";

        toReturn += " This " + this.getClass().getSimpleName() +  " has " + this.motorSizeInCC +
                " size motor (currently).";

        return toReturn;
    }
}
