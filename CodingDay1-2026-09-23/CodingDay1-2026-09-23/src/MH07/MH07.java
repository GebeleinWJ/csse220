package MH07;

import java.util.ArrayList;

import java.util.*;
public class MH07 {

	/** See printed instructions for a description of this method. */
	public static String removeUpperCase(String input) {
		String output = "";
		for (int i = 0; i< input.length(); i++){
			Character c = input.charAt(i);
			if(!Character.isUpperCase(c)) {
				output = output+c.toString();
			}
		}
		return output;
	}

	/** See printed instructions for a description of this method. */
	public static int productOfDiagonal(int[][] matrix) {
		if(matrix==null){
			return 0;
		}
		if(matrix.length==0) {
			return 0;
		}
		int output = 1;
		for(int i = 0; i<matrix.length; i++){
			for(int j = 0; j<matrix.length; j++){
				if(i==j){
					output = output*matrix[i][j];
				}
			}
		}
		return output;
	}

	/** See printed instructions for a description of this method. */
	public static ArrayList<Integer> dailyChanges(int[] balances) {
		ArrayList<Integer> derivative = new ArrayList<>();
		for(int i = 1; i<balances.length; i++){
			int temp = balances[i]-balances[i-1];
			derivative.add(temp);
		}
		return derivative;
	}

	/** See printed instructions for a description of this method. */
	public static ArrayList<String> findLinkedWords(String[] words) {
		ArrayList<String> output = new ArrayList<>();
		String opener = words[0];
		output.add(opener);
		int count = 0;
		for(int i = 1; i<words.length; i++){
			String t= words[i].substring(0,1);
			String h = output.get(count).substring(output.get(count).length()-1);
			if(h.equals(t)){
				count = i;
				opener = words[i];
				output.add(words[i]);
			}
		}
		return output;
	}

}
