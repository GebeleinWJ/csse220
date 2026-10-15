package simulationObjects;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Dimension2D;

/**
 * This class represents a Person who can either be healthy (green), infected (orange), or recovered (pink).
 * Once a Person becomes infected, they will remain infected for a certain length of time before they
 * become recovered. Once recovered, the Person cannot be infected again.
 * 
 * Inspired by this article: https://www.washingtonpost.com/graphics/2020/world/corona-simulator/
 * 
 * To visualize a population of Persons over time you should provide a method that says if a Person 
 * isHealthy, isSick, or isRecovered.
 * 
 * 
 * This class should use inheritance to make it simple to write. You should not need to copy and paste
 * 
 * TODO: Part 4 You can change this file but will need to provide each of the methods started in order to get full 
 * functionality.
 * 
 * @author YOUR_NAME
 *
 */
public class Person extends SimulationObject{
	public static final int PERSON_RADIUS = 10;
	public static final int PERSON_SPEED = 5;
	
	//How many timesteps to recover once infected
	public static final int TIME_TO_RECOVER = 100;
	
	public static final Color HEALTHY_COLOR = new Color(134, 184, 184);
	public static final Color INFECTED_COLOR = new Color(204, 102, 0);
	public static final Color RECOVERED_COLOR = new Color(196, 116, 195);
	private Color color;

	private int infected;//0 for healthy, 1 for infected, 2 for recovered.
	private int infectedTimer;
	public Person(int x, int y, int inf) {
		super(x, y, "Person");
		this.infected=inf;
		this.infectedTimer=TIME_TO_RECOVER;
		super.setColor(HEALTHY_COLOR);
		super.setRadius(PERSON_RADIUS);
		super.setMoveSpeed(PERSON_SPEED);
	}


	//TODO: add instance variables
	
	//TODO: add constructors

	public void update(Dimension2D dim){
		super.update(dim);
		super.normalizeVelocity();
		if(this.isInfected()&&this.infectedTimer>0){
			this.infectedTimer-=1;
			super.setColor(INFECTED_COLOR);;

		}
		if(this.isInfected()&&this.infectedTimer<=0){
			this.infected=2;
			super.setColor(RECOVERED_COLOR);
		}
	}
	public void bounce(Person other) {
		super.bounce(other);
		if(this.isInfected()&&other.isHealthy()){
			other.infected=1;
		}
	}

	public boolean isHealthy() {
		// TODO return true if this person is healthy.  False if infected or recovered
		if(this.infected==0) {
			return true;
		}
		return false;
	}

	public boolean isInfected() {
		// TODO return true if this person is sick.  False if infected or recovered
		if(this.infected==1) {
			return true;
		}
		return false;
	}
	
	public boolean isRecovered() {
		// TODO return true if this person is recovered.  False if infected or healthy
		if(this.infected==2) {
			return true;
		}
		return false;
	}
}
