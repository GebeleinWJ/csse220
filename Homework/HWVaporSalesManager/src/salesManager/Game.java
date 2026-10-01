package salesManager;

import java.util.ArrayList;
import java.util.Objects;

/**
 * The Game class allows for the creation of games,
 * and allows for the selling of these games.
 * Each Game tracks the number of times it was sold, both in a bundle and by itself.
 * allowing for easy computation of revenue.
 *************************************************************************************** 
 * REQUIRED HELP CITATION
 * 
 * Used copilot and ChatGPT for GenAI sections.
 *************************************************************************************** 
 * TODO: List each team member's name and email username here. 
 * @author First Student - studenfi
 * @author Second Student - studense
 *************************************************************************************** 
 */
public class Game {
	// Adhere to (1), (2), and (3) below.

	//Instance variables. title, rating, and price are non-moving parts, while the other parts alter throughout the life of a Game.
	String title;
	String rating;
	double price;
	int bundleNumCopiesSold=0; //determines how many individual copies were sold
	int personalNumCopiesSold=0; //determines how many bundled copies were sold
	double bundleRevenue = 0;
	ArrayList<Bundle> bundlesIn = new ArrayList<>();//because trying to calculate bundleRevenue without this would suck
	// HINT: See the static methods `doubleToDollars` and `listToCommaSeparatedString` 
	// in SalesManager.java. Using these methods will save you time when formatting 
	// the sales report. 

	public Game() {
	} // Keep this constructor for unit tests

	/**
	 * The main constructor. Assigns the params to their instance variables, and sets the
	 * this.bundleRevenue to 0.
	 * @param title
	 * @param rating
	 * @param price
	 */
	public Game(String title, String rating, double price) {
		this.title = title;
		this.rating = rating;
		this.price = price;
		this.bundleRevenue=0;
	}

	/**
	 * Sells a copy individually. Separate from sellCopy to employ different functions for each,
	 * which makes this easier.
	 */
	public void sellIndividualCopy(){
		this.personalNumCopiesSold++;
	}
	/**
	 * Sells a copy from a bundle. Separate from sellCopy to employ different functions for each,
	 * which makes this easier. bundleRevenue is incremented here, instead of a single ending calculation.
	 */
	public void sellCopy(Bundle b){
		this.bundleRevenue+=b.getPrice()/b.getGames().length;
		this.bundleNumCopiesSold++;
	}

	/**
	 * Computes the total revenue of the game, combining bundleRevenue with personal revenue.
	 * @return double
	 */
	public double computeTotalRevenue(){
		return this.bundleRevenue+this.price*this.personalNumCopiesSold;
	}

	/**
	 * Returns a sales report String in the form:
	 * Name: X
	 * Rating: T
	 * Price: $XX.XX
	 * Copies Sold Individually: XX
	 * Copies Sold In Bundles: XX
	 * Total Copies Sold: XX
	 * Total Revenue: $XXX.XX
	 * This function uses SalesManagerMain.doubleToDollars() and Game.computeTotalRevenue()
	 * @return String
	 */
	public String handlePrintSalesReport(){

		return "Title: "+this.title+"\nRating: "+this.rating+"\nPrice: "+ SalesManagerMain.doubleToDollars(this.price)+"\nCopies Sold Individually: "+this.personalNumCopiesSold+"\nCopies Sold in Bundles: "+this.bundleNumCopiesSold+"\nTotal Copies Sold: "+(this.bundleNumCopiesSold+this.personalNumCopiesSold)+"\nTotal Revenue: "+ SalesManagerMain.doubleToDollars(computeTotalRevenue());
	}

	/**
	 * Adda a bundle to the bundlesIn arrayList.
	 * @param b
	 */
	public void addBundle(Bundle b){
		boolean temp = false;
		for(int i = 0; i<b.getGames().length; i++){
			if(Objects.equals(b.getGames()[i], this.title)){
				temp = true;
			}
		}
		if(!temp){
			b.addGame(this);
		}
		this.bundlesIn.add(b);
	}

	/**
	 * Gets the title of the game.
	 * @return String
	 */
	public String getTitle(){
		return this.title;
	}
	/**
	 * This toString method is a watered-down version of handlePrintSalesReport
	 * @return String
	 */
	public String toString(){
		return "Title: "+this.title+"\nRating: "+this.rating+"\nPrice: "+ SalesManagerMain.doubleToDollars(this.price)+"\nCopies Sold Individually: "+this.personalNumCopiesSold+"\nCopies Sold in Bundles: "+this.bundleNumCopiesSold;
	}

	// (1) Requirements on Field Declaration Design/Engineering:
	// -- Fields of this class must be declared with the 'private' access modifier -
	// this provides compiler-enforced encapsulation
	// -- Getters/setters are not allowed for any field that is a collection, for
	// example, no getter or setter for an ArrayList field
	// This restriction keeps these complex internal data structures 'private',
	// i.e., encapsulated

	// (2) Requirements on New Method Design/Engineering:
	// Adhere to OOD Principle 4.a by creating 'tell' methods inside of Game.
	// That is, if your app needs something computed using the data stored in the
	// Game class,
	// then design/engineer the Game class so that it implements the computation
	// inside a new 'public' Game method.
	// Then a client can 'tell' Game to do that computation by calling this new Game
	// method.

	// (3) Requirements for Game's toString Method:
	// Implement a toString method that returns a String containing the values in
	// the object's fields
	// After adding fields to this class, use the Eclipse command: Source | Generate
	// toString
	// When debugging, call this toString method on Game objects from a
	// System.out.println command
	//
	// HINT: You may need to modify the toString method automatically generated by
	// Eclipse, both for Game and for Bundle (why?)

	/**
	 * TODO: Add class-level description here.
	 *
	 ***************************************************************************************
	 * REQUIRED HELP CITATION
	 *
	 * TODO: cite your help here or say "only used CSSE220 materials"
	 ***************************************************************************************
	 * TODO: List each team member's name and email username here.
	 * @author First Student - studenfi
	 * @author Second Student - studense
	 ***************************************************************************************
	 */


		// (1) Requirements on Field Declaration Design/Engineering:
		// -- Fields of this class must be declared with the 'private' access modifier -
		// this provides compiler-enforced encapsulation
		// -- Getters/setters are not allowed for any field that is a collection, for
		// example, no getter or setter for an ArrayList field
		// This restriction keeps these complex internal data structures 'private',
		// i.e., encapsulated

		// (2) Requirements on New Method Design/Engineering:
		// Adhere to OOD Principle 4.a by creating 'tell' methods inside of Game.
		// That is, if your app needs something computed using the data stored in the
		// Game class,
		// then design/engineer the Game class so that it implements the computation
		// inside a new 'public' Game method.
		// Then a client can 'tell' Game to do that computation by calling this new Game
		// method.

		// (3) Requirements for Game's toString Method:
		// Implement a toString method that returns a String containing the values in
		// the object's fields
		// After adding fields to this class, use the Eclipse command: Source | Generate
		// toString
		// When debugging, call this toString method on Game objects from a
		// System.out.println command
		//
		// HINT: You may need to modify the toString method automatically generated by
		// Eclipse, both for Game and for Bundle (why?)
	}

