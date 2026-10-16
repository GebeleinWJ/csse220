package MH09;


import java.util.*;
public class MH09 {

	/** See printed instructions for a description of this method. */
	public static String shiftLetters(String input) {
		String output = "";
		Character letter = input.toCharArray()[0];
		if(letter=='z'){
			letter = 'a';
		}
		else if (letter == 'Z') {
			letter = 'A';
		}
		else{
			letter = (char) (letter + 1);
		}
		letter = (Character) letter;
		if (input.length()>1) {
			output = letter.toString() + shiftLetters(input.substring(1));
		}
		else if (input.length()==1){
			output = letter.toString();
		}
		return output;
	}

	/** See printed instructions for a description of this method. */
	public static int addOnlyDigits(String input) {
		// Its not pretty but it works
		int output = 0;
		int number = 0;
		Character temp = input.charAt(0);
		if(temp.toString().equals("1")){
			number = Integer.parseInt(String.valueOf(temp));
		}
		else if(temp.toString().equals("2")){
			number = Integer.parseInt(String.valueOf(temp));
		}
		else if(temp.toString().equals("3")){
			number = Integer.parseInt(String.valueOf(temp));
		}
		else if(temp.toString().equals("4")){
			number = Integer.parseInt(String.valueOf(temp));
		}
		else if(temp.toString().equals("5")){
			number = Integer.parseInt(String.valueOf(temp));
		}
		else if(temp.toString().equals("6")){
			number = Integer.parseInt(String.valueOf(temp));
		}
		else if(temp.toString().equals("7")){
			number = Integer.parseInt(String.valueOf(temp));
		}
		else if(temp.toString().equals("8")){
			number = Integer.parseInt(String.valueOf(temp));
		}
		else if(temp.toString().equals("9")){
			number = Integer.parseInt(String.valueOf(temp));
		}
		else if(temp.toString().equals("0")){
			number = Integer.parseInt(String.valueOf(temp));
		}
		else{
			number = 0;
		}

		if(input.length()==1){
			return output+number;
		}
		else {
			return output+number+addOnlyDigits(input.substring(1));
		}
	}

	/** See printed instructions for a description of this method. */
	public static String wrapTillX(String input) {
		// I hated every second of this
		boolean xReached = false;
		String output = "";
		int xLoc = input.indexOf("x");
		if(input.startsWith("x")){
			xReached=true;
		}
		if(input.length()==2&&input.endsWith("x")){
			return input.substring(0,1);
		}
		else if(input.length()==2&&input.startsWith("x")){
			return input.substring(1,2);
		}
		else if(input.length()==1){
			return "";
		}
		else if(input.isEmpty()){
			return "";
		}
		if(xReached){
			output = String.valueOf(input.charAt(1))+wrapTillX("x"+input.substring(2));
		}
		else{

			output = wrapTillX(input.substring(0,xLoc-1)+input.substring(xLoc))+input.charAt(xLoc-1);
		}
		return output;
	}

	/** See printed instructions for a description of this method. */
	public static void addThroughArray(int[] array, int from, int to, int amountToAdd) {
		// TODO: Implement this method

	}
}
