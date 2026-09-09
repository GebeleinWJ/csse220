
/**
 * This class can determine the number of 4s in a 2d array, the distance between two elements on a 2d array,
 * seperate an int array with multidigit variables into a 2d array, where each sub array is each digit,
 * and can determine if a 2d array is symmetric.
 * @author Will Gebelein
 *         Created Dec 15, 2013.
 */
public class Two2DArrayProblems {
	
	/**
	 * 
	 * Count the number of times 4 occurs in the array.  So
	 * the array
	 * 
	 * 		int[][] intArray2 = 
     *       {{0,0,0},
     *       {4,4,0}};
     *
     *       returns 2
	 * @param data 
	 * @return the number of times 4 occurs in the array.
	 */
	public static int count4s(int[][] data) {
		int total = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++)
			{
				if (data[i][j]==4)
				{
					total++;
				}
			}
		}
		return total;
	}
	
	
	
	/**
	 * Takes a square array of integers.
	 * 
	 * Returns true if the array is symmetric.  That is if
	 * the array[i,j] == array[j,i] for all i and j
	 * 
	 * So {{1,0,0},
	 *     {0,1,0},
	 *     {0,0,1}} returns true
     *
     *    {{1,0,3},
	 *     {0,1,0},
	 *     {0,0,1}} returns false because [0,2] != [2,0]
	 * @param input 
	 * @return true if the array is symmetric, false otherwise.
	 */
	public static boolean isSymmetric(int[][] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++)
			{
				if (input[i][j]!=input[j][i])
				{
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Takes an array of numbers (ints), all of which have equal number of digits.
	 * 
	 * Returns a 2D array of ints, where the digits
	 * correspond to the original numbers (ints).  
	 * 
	 *    [123, 456]
	 *     
	 *     yields
	 *      
	 *    [[1, 2, 3],
     *     [4, 5, 6] ];
	 * @param input 
	 * @return a 2D array of ints, where the digits
	 * correspond to the original ints. 
	 *  
	 */
	public static int[][] numbersToDigitArrays(int[] input) {


		int digit = 0;
		int number = input[0];
		while(number!=0) {
			number /= 10;
			digit++;
		}
		int[][]output = new int[input.length][digit];
		for (int i = 0; i < input.length; i++) {
            number = input[i];
			for (int j = 0; j<digit; j++){
				int div = (int) Math.pow(10,digit-j-1);
				int ret = number/div;
				number = number - div*ret;//I love abusing int div
				output[i][j]=ret;
			}
		}

		return output;
	
	}
	
	/**
	 * Takes an array of integers representing a map.
	 * 
	 * On the map there is one square representing the person: '@'
	 * At least one and maybe more squares representing an exit: 'X'
	 * And empty squares: '.'
	 * 
	 * The function returns the shortest distance from the person to 
	 * an exit.  Note the person can't move diagonally so it is the
	 * Manhattan distance. 
	 * 
	 * If you're not sure what "Manhattan distance" is, be sure to 
	 * look it up! Having that definition makes things much easier.
	 * 
	 *  For example, in the map:
	 *  @...
	 *  .X.X
	 *  
	 *  The function returns 2 (east, south)
	 *  
	 *  X.XX
	 *  ....
	 *  .@.. returns 3
	 *  
	 * @param input 
	 * @return the shortest Manhattan distance from the person to 
	 * an exit. 
	 */
	public static int distanceToExit(char[][] input) {
		int[]firstLoc=new int[2];

		for(int i = 0; i<input.length;i++){
			for(int j = 0; j<input[i].length;j++){
				if(input[i][j]=='@') {
					firstLoc[0] = i;
					firstLoc[1] = j;
				}
			}
		}
		int count = 0;
		for(int i = 0; i<input.length;i++){
			for(int j = 0; j<input[i].length;j++){
				if(input[i][j]=='X') {
					count++;
				}
			}
		}
		int temp = 0;
		int[][] targets= new int[count][2];
		for(int i = 0; i<input.length;i++){
			for(int j = 0; j<input[i].length;j++){
				if(input[i][j]=='X') {
					targets[temp][0]=i;
					targets[temp][1]=j;
					temp++;
				}
			}
		}
		int t1 = firstLoc[0];
		int t2 = firstLoc[1];
		int t3 = targets[0][0];
		int t4 = targets[0][1];
		int diff =Math.abs(t1-t3)+Math.abs(t2-t4);
		for(int i = 1; i<count; i++) {
			t3 = targets[i][0];
			t4 = targets[i][1];
			int dif = Math.abs(t1-t3)+Math.abs(t2-t4);
			if (diff>dif){
				diff = dif;
			}
		}
		return diff;
	}
}
