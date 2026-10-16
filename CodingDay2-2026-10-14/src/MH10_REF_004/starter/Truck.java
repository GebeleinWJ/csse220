package MH10_REF_004.starter;

/**
 * This class represents a Truck with 4 wheels, a max of 10 passengers
 * and a variable sized truck bed in square feet.  The bed of the truck
 * may be cut, effectively reducing the size of the bed in square feet.
 */
public class Truck extends Vehicle{
    private static int maxPassengers = 10; //lots of bed space

    private int numWheels;
    private int truckBedSquareFootage;

    public Truck(int truckBedSquareFootage) {
        super("Truck");
        this.numWheels=4;
        this.truckBedSquareFootage = truckBedSquareFootage;
    }

    public int getTruckBedSquareFootage() { return this.truckBedSquareFootage; }

    public String cutBed(int numSquareFootageToCut) {
        if(this.truckBedSquareFootage > numSquareFootageToCut) {
            this.truckBedSquareFootage -= numSquareFootageToCut;
            return this.getClass().getSimpleName() + " cut " + numSquareFootageToCut +
                    " square feet of the bed.";
        }

        return "Cannot cut that much bed! No action taken.";
    }


    @Override
    public String toString() {
        String toReturn = this.getClass().getSimpleName() +  " has " + this.numWheels +
                " wheels, " + super.getNumPassengers() + " passengers currently, and has traveled " +
                super.getNumMilesTraveled() + " miles since last service.";

        toReturn += " This " + this.getClass().getSimpleName() +  " has " + this.truckBedSquareFootage +
                " square footage in the bed.";

        return toReturn;
    }
}
