package arrayListUsage;
import java.util.ArrayList;


public class ArrayListFunctions {
	
	/**
	 * 
	 * Write a function that takes an array of strings and returns
	 * an arraylist.  The arraylist should contain only the strings
	 * in the original list that begin with 'A'
	 * 
	 * So arrayListOfAs({"Abc","foo","AAA", "bar"}) yields ["Abc","AAA"]
	 */
	public static ArrayList<String> arraylistOfAs(String[] strings) {
		ArrayList<String> sd = new ArrayList<String>();
		for (int i = 0; i<strings.length; i++)
		{
			String word = strings[i];
			if(strings[i].length()!=0) {
				if (word.substring(0, 1).equals("A")) {
					sd.add(strings[i]);
				}
			}
		}
		return sd;
	}
	/**
	 * Takes an arrayList of numbers in sorted (ascending) 
	 * order and a number to add.
	 * 
	 * Adds the number in the correct place in the sorted list.
	 * 
	 * so insertIntoSorted([1,5,9],6) yields [1,5,6,9]
	 * 
	 */
	public static void insertIntoSorted(ArrayList<Integer> list, int number) {
		int count = 0;
		for(int i = 0; i<list.size(); i++){
			if(number < list.get(i)){
				list.add(i,number);
				count++;
				break;
			}

		}
			if (count==0){list.add(number);}
	}
	
	/**
	 * Takes an arraylist of strings and removes all strings longer
	 * than 3 characters.
	 * 
	 * So removeLongStrings(["a","xxxx","b","zzzzz"]) yields ["a","b"]
	 */
	public static void removeLongStrings(ArrayList<String> strings) {
		for(int i = 0; i<strings.size();i++){
			if(strings.get(i).length()>3){
				strings.remove(i);
				i--;
			}
		}
	}
	
}
