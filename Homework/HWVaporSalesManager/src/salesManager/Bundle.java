package salesManager;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * TODO: Add class-level description here.
 * The Bundle class allows for the grouping of games into bundles,
 * and allows for the selling of these bundles.
 * Each bundle tracks the number of times it was sold, allowing for easy computation of revenue.
 *************************************************************************************** 
 * REQUIRED HELP CITATION
 * 
 * Used copilot and chatGPT for GenAI sections. Bundle doesn't have any of these
 ***************************************************************************************
 * @author Will Gebelein - gebelewj@rose-hulman.edu
 * @author Luke Mowery - moweryLr@rose-hulman.edu
 *************************************************************************************** 
 */
public class Bundle {
	// Adhere to (1), (2), and (3) below.
	
	// HINT: See the static methods `doubleToDollars` and `listToCommaSeparatedString` 
	// in SalesManager.java. Using these methods will save you time when formatting 
	// the sales report.

	//Instance variables. name, price are constant. games and numberCopiesSold both alter over time.
	String name;
	double price;
	ArrayList<Game> games = new ArrayList<>();
	int numberCopiesSold =0;
	
	public Bundle() {} // Keep this constructor for unit tests

	/**
	 * The main constructor. Assigns the params to their instance variables, and sets the
	 * this.numberCopiesSold to 0.
	 * @param n
	 * @param p
	 * @param g
	 */
	public Bundle(String n, double p, ArrayList<Game> g) {
		this.name = n;
		this.price = p;
		this.games = g;
		this.numberCopiesSold=0;
	}

	/**
	 * Sells a copy of the bundle. Increases numberCopiesSold, and triggers the bundle sell for all games
	 * in the bundle.
	 */
	public void sellCopy(){
		this.numberCopiesSold++;
		int length = this.games.toArray().length;
		for(int i =0; i<length; i++){
			this.games.get(i).sellCopy(this);//Despite the function not saying bundle, this is the bundle specifc selling.
		}
	}

	/**
	 * Returns the total revenue earned by this bundle.
	 * @return double
	 */
	public double totalBundleRevenue(){
		return this.price*this.numberCopiesSold;
	}

	/**
	 * Returns a sales report String in the form:
	 * Name: X
	 * Games: X,Y,Z
	 * Price: $XX.XX
	 * Copies Sold: XX
	 * Total Revenue: $XXX.XX
	 * This function uses SalesManagerMain.doubleToDollars() and Bundle.totalBundleRevenue()
	 * @return String
	 */
	public String handlePrintSalesReport(){
		String x = games.get(0).getTitle();
		for (int i = 1; i<games.toArray().length;i++){//this for loop is what displays the Games: X,Y,Z
			x = x+","+games.get(i).getTitle();
		}
		return "Name: "+this.name+"\nGames: "+ x +"\nPrice: "+SalesManagerMain.doubleToDollars(this.price)+"\nCopies Sold: "+this.numberCopiesSold+"\nTotal Revenue: "+ SalesManagerMain.doubleToDollars(totalBundleRevenue());
	}

	/**
	 * These mutators allow for games to be added to the bundle, games to be removed from the bundle,
	 * and the price of the bundle to be changed. (removeGame and alterPrice are not utilized by main)
	 * @param g/p
	 */
	public void addGame(Game g){
		this.games.add(g);
	}
	public void removeGame(Game g){
		this.games.remove(g);
	}
	public void alterPrice(double p){
		this.price = p;
	}

	/**
	 * These getters can return the name, price, and games of the bundle.
	 * @return String/double/String[]
	 */
	public String getName(){
		return this.name;
	}
	public double getPrice(){
		return this.price;
	}
	public String[] getGames(){
		int length = this.games.toArray().length;
		String[] gregs = new String[length];//Don't worry about the variable name. This is a temporary variable that only exists here. Its name is useless.
		for(int i =0; i<length; i++){//This loop adds Game's to a Game array
			gregs[i] = games.get(i).getTitle();
		}
		return gregs;
	}

	/**
	 * This toString method is a watered-down version of handlePrintSalesReport
	 * @return String
	 */
	public String toString(){
		return "Name: "+this.name+"\nGames: "+ Arrays.toString(games.toArray()) +"\nPrice: "+SalesManagerMain.doubleToDollars(this.price)+"\nCopies Sold: "+this.numberCopiesSold;
	}

	// (1) Requirements on Field Declaration Design/Engineering:
	// -- Fields of this class must be declared with the 'private' access modifier -
	// this provides compiler-enforced encapsulation
	// -- Getters/setters are not allowed for any field that is a collection, for
	// example, no getter or setter for an ArrayList field
	// This restriction keeps these complex internal data structures 'private',
	// i.e., encapsulated

	// (2) Requirements on New Method Design/Engineering:
	// Adhere to OOD Principle 4.a by creating 'tell' methods inside of Bundle.
	// That is, if your app needs something computed using the data stored in the
	// Bundle class,
	// then design/engineer the Bundle class so that it implements the computation
	// inside a new 'public' Bundle method.
	// Then a client can 'tell' Bundle to do that computation by calling this new
	// Bundle method.

	// (3) Requirements for Bundle's toString Method:
	// Implement a toString method that returns a String containing the values in
	// the object's fields
	// After adding fields to this class, use the Eclipse command: Source | Generate
	// toString
	// When debugging, call this toString method on Bundle objects from a
	// System.out.println command
	//
	// HINT: You may need to modify the toString method automatically generated by
	// Eclipse, both for Game and for Bundle (why?)
}
