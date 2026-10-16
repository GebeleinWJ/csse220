package MH10_REF_004.starter;

import java.util.ArrayList;

/**
 * This program represents a large garage with 3 types of vehicles:
 * Cars, Trucks, and Motorcycles.  This garage does some weird stuff to
 * the different vehicles.
 * <br>
 * Your job is to remove as much code duplication as you can from the
 * three classes as well as the main program itself (below).
 * <br>
 * Original PlantUML diagram: https://www.plantuml.com/plantuml/uml/hLHTYvmm57ttLyW-PIhp1-QXh2FJPLbSbj7IGYbBC1SDZSas7pFOPVvxOso8LLzsnZTppxtddDmZkLSQIsrQ5bKCAnK_O8bho37byNkKl5jKq-hIsZF2ibQxkD2Iylh7pyqkFWbAeaGQdhwzeOs7eWGJKWBFAGE5V5jVVB42m6kG2d7JxcBAzMXAY-5hn7I9_hdAiBHsjdRgMmF0b9jrPwTIIdm21YIKWrIePHsZd8IIlroUVd_DqkFhIreKX-U7mx4O6XAhYcPprfsjHqaD-jdRGHi73SM9fmaMZ4q0hnBgsZ7iE-IlEUZxXIgG9rf1s70Z61DdpuCQSSunxoPhdkTGYfIGZuHHIbFzkZ4EtNFiWHI_3PRmHGYDQrZ8fJn-pPxcoJWBQ974tyIrh1nJkIHuTLwLqPQhx_wFhnIPqUkdbWijPDLL36wChks92le77dcMBKIsVtmwp1CBycXEOEq6VENCyh7QrLcfnlOxAaJ4cIlBjsP4erTts_DlFzzzkdFlp3BYViHbRBp9U-34jEml
 *
 * @author --- put your name here ---
 */
public class GarageMain {
    private ArrayList<Vehicle> vehicles;

    public static void main(String[] args) {
        GarageMain program = new GarageMain();
        String output = program.runApp();
        System.out.println(output);
    }

    public String runApp() {
        //---------------------------------------------------------------
        // do stuff (do NOT change the following code in this method).
        this.setupGarage();

        String finalOutput = "";

        this.addTenMiles();
        finalOutput += this.addPassengers(2);
        this.addTenMiles();
        finalOutput += this.addPassengers(1);
        this.addTenMiles();
        finalOutput += this.addPassengers(5);

        finalOutput += this.toString();

        return finalOutput;
        //---------------------------------------------------------------
    }

    public void setupGarage() {
        this.vehicles = new ArrayList<Vehicle>();

        //---------------------------------------------------------------
        // Add Cars
        this.vehicles.add(new Car(4));
        this.vehicles.add(new Car(6));
        this.vehicles.add(new Car(8));

        //---------------------------------------------------------------
        // Add Trucks
        this.vehicles.add(new Truck(45));
        this.vehicles.add(new Truck(55));
        this.vehicles.add(new Truck(60));

        //---------------------------------------------------------------
        // Add Motorcycles
        this.vehicles.add(new Motorcycle(1000));
        this.vehicles.add(new Motorcycle(1200));
        this.vehicles.add(new Motorcycle(1500));
    }

    public void addTenMiles() {
        //go through all
        for(int i = 0; i < this.vehicles.size(); i++) {
            Vehicle currentCar = this.vehicles.get(i);
            currentCar.travelBy(10);
        }
    }

    public String addPassengers(int num) {
        String results = "";
        for(int i = 0; i < this.vehicles.size(); i++) {
            Vehicle currentCar = this.vehicles.get(i);
            results += currentCar.addPassengers(num) + "\n";
        }


        return results;
    }

    @Override
    public String toString() {
        String info = "";
        for(int i = 0; i < this.vehicles.size(); i++) {
            Vehicle currentCar = this.vehicles.get(i);
            info += currentCar.toString() + "\n";
        }

        return info;
    }

}
