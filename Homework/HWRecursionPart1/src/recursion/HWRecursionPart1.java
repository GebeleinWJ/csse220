package recursion;

import java.util.ArrayList;

/**
 * Class: HWRecursionPart1
 * @author CSSE Faculty
 * Purpose: Provide practice implementing basic recursive operations
 *  
 */
public class HWRecursionPart1 {

	/**
	 * Recursive summation of one to the input value.
	 * summation = 1 + 2 + ... + value
	 * requires: value >= 1
	 * 
	 */
	public static int summation(int value) {
		if(value==0){
			return 0;
		}
		return value+summation(value-1);
	} // summation

	/**
	 * Sum the elements in an arrayList. You may modify the list (e.g. remove
	 * elements).
	 * requires: |inputList| >= 0
	 */
	public static int arrayListSummation(ArrayList<Integer> inputList) {
		if(inputList.toArray().length==1){
			return inputList.getFirst();
		}
		int total = inputList.getFirst();
		inputList.removeFirst();
		return total+arrayListSummation(inputList);
	} // arrayListSummation

	/**
	 * Returns the number of threes in the prime factorization of the input value.
	 */
	public static int countNumberOf3sInPrimeFactorization(int inputNumber) {
		if(inputNumber%3!=0||inputNumber==0){
			return 0;
		}
		int total = 1+countNumberOf3sInPrimeFactorization(inputNumber/3);
		return total;
	} // countNumberOf3sInPrimeFactorization

	/**
	 * Determine if a value is an even power of three (3^2, 3^4, 3^6).
	 * <br>
	 * You can assume the input value is a power of three.
	 */
	public static boolean evenPowerOfThree(int inputValue) {
		if(inputValue==1){
			return true;
		}
		else if(inputValue%3!=0){
			return false;
		}

		boolean out = true;
		return out!=evenPowerOfThree(inputValue/3);
	} // evenPowerOfThree

	/**
	 * Determine if there are no doubled letters in a String.
	 */
	public static boolean noDoubledLetters(String inputString) {
		if(inputString.length()<=1){
			return true;
		}
		boolean out = inputString.charAt(0)!=inputString.charAt(1)&&noDoubledLetters(inputString.substring(1));
		return out;

	} // noDoubledLetters

	/**
	 * Imagine a game where you're given a starting number and can repeatedly make
	 * one of two moves. You can either divide the number by three if it's divisible
	 * by three, or subtract seven. You win the game if you can reduce the number to
	 * 1.
	 * <br>
	 * Write a function to determine if the game can be one with a particular
	 * staring number.
	 */
	public static boolean numbersGame(int startingNumber) {
		boolean out = false;
		if((startingNumber)%7==1){
			out = true;
		}
		else if(startingNumber>1&&startingNumber%3==0){
			out = numbersGame(startingNumber/3);
		}
		else if (startingNumber>1){
			out = numbersGame(startingNumber-7);
		}
		return out;
	} // numbersGame
	
} // end HWRecursionPart1
