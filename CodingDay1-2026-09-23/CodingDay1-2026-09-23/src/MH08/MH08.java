package MH08;

import java.util.HashMap;
import java.util.ArrayList;

import java.util.*;
public class MH08 {

	/** See printed instructions for a description of this method. */
	public static String highestAverage(HashMap<String, ArrayList<Integer>> namesToGrades) {
		Set<String> nova = namesToGrades.keySet();
		Double highest = -100.0;
		int highestSign = 0;
		Object[] arr = nova.toArray();
		for (int i = 0; i<arr.length; i++){
			ArrayList<Integer> temp = namesToGrades.get(arr[i]);
			Double temp2 = 0.0;
			for (int j = 0; j<temp.toArray().length; j++){
				temp2+=temp.get(j);
			}
			temp2 = temp2/temp.toArray().length;
			if(temp2>highest){
				highest = temp2;
				highestSign = i;
			}
		}
		return arr[highestSign].toString();

	}

	/** See printed instructions for a description of this method. */
	public static ArrayList<String> definitionContains(HashMap<String, String> dictionary, String termToFind) {
		ArrayList<String>output = new ArrayList<>();
		Set<String> nova = dictionary.keySet();
		Object[] arr = nova.toArray();
		for(int i = 0; i<arr.length; i++){
			String temp = dictionary.get(arr[i]);
			if(temp.contains(termToFind)){
				output.add(arr[i].toString());
			}
		}
		return output;
	}

	/** See printed instructions for a description of this method. */
	public static String findMismatch(String[] names, Integer[] ages) {

		for(int i = 0; i<names.length; i++){

			for(int j = 0; j<names.length; j++){
				if (names[i] == names[j] && ages[i] != ages[j]) {
					return names[i];
				}
			}
		}
		return "";
	}

	/** See printed instructions for a description of this method. */
	public static double classAverage(HashMap<String, Integer> gradesMap) {
		// TODO: Implement this method
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
