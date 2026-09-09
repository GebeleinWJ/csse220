import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CodingBatPractice {
	
	public static void main(String[] args) {
		
		//Example  print to check method functionality
		System.out.println("fizzArray3(5, 10)");
		System.out.println( "  Expected:  [5, 6, 7, 8, 9]"     );
		System.out.println( "  Actual:" + Arrays.toString(  fizzArray3(5, 10)   )   );
		
		//TODO create calls to methods to test them here
			
	}
	
	/**
	 * Solve this method from:  https://codingbat.com/prob/p142539
	 * 
	 * Explanation of pieces of method signature:
	 *
	 * public       = method can be accessed from any other class (anywhere)
	 * start, end   = input parameters 
	 * int[]        = return type  (this method returns an int array)
	 * static       = because main is static (we will learn about static more later in the course)
	 */
	public int bigDiff(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		for (int i=1; i<nums.length; i++)
		{
			if(max<nums[i])
			{
				max = nums[i];
			}
			if(min>nums[i])
			{
				min = nums[i];
			}
		}
		return max-min;
	}

	public static int[] fizzArray3(int start, int end) {

			int target = end - start;
			int[] output = new int[target];
			for (int i=0;i<target;i++)
			{
				output[i] = i+start;
			}
			return output;


	}
	
	//TODO make additional methods here to test out
	
	

}
