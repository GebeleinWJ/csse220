package MH07Test;
import MH07.MH07;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
public class TestFindSmallestNumberInLongestList {


	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	private ArrayList<Integer> nums8421 = new ArrayList<Integer>();
	private ArrayList<Integer> nums9999 = new ArrayList<Integer>();
	private ArrayList<Integer> nums888 = new ArrayList<Integer>();
	private ArrayList<Integer> nums77 = new ArrayList<Integer>();
	private ArrayList<Integer> nums123 = new ArrayList<Integer>();
	private ArrayList<Integer> nums56187 = new ArrayList<Integer>();
	private ArrayList<Integer> nums653 = new ArrayList<Integer>();
	private ArrayList<Integer> nums32 = new ArrayList<Integer>();
	private ArrayList<Integer> nums65 = new ArrayList<Integer>();
	private ArrayList<Integer> nums76 = new ArrayList<Integer>();
	private ArrayList<Integer> nums3 = new ArrayList<Integer>();
	private ArrayList<Integer> nums765987 = new ArrayList<Integer>();
	

	@Before
	public void setup() {
		this.nums8421.addAll(Arrays.asList(8, 4, 2, 1));
		this.nums9999.addAll(Arrays.asList(9, 9, 9, 9));
		this.nums123.addAll(Arrays.asList(1,2,3));
		this.nums56187.addAll(Arrays.asList(5,6,1,8,7));
		this.nums653.addAll(Arrays.asList(6,5,3));
		this.nums32.addAll(Arrays.asList(3,2));
		this.nums65.addAll(Arrays.asList(6,5));
		this.nums76.addAll(Arrays.asList(7,6));
		this.nums3.addAll(Arrays.asList(3));
		this.nums765987.addAll(Arrays.asList(7,6,5,9,8,7));
		this.nums888.addAll(Arrays.asList(8,8,8));
		this.nums77.addAll(Arrays.asList(7,7));
	}
	
	
	//Checking if the longest list is identified correctly
	@Test
	public void testFindSmallestNumberInLongestListHomogenousLists() {
		ArrayList<ArrayList<Integer>> test1 = new ArrayList<ArrayList<Integer>>();
		test1.add( this.nums77 );
		assertEquals( 7, MH07.findSmallestNumberInLongestList(  test1   ) ); 
		test1.add( this.nums888 );
		assertEquals( 8, MH07.findSmallestNumberInLongestList(  test1   ) ); 
		test1.add( this.nums9999 );
		assertEquals( 9, MH07.findSmallestNumberInLongestList(  test1   ) ); 
		
	}
	
	
	//Checking if the smallest element in a list is identified correctly
	@Test
	public void testFindSmallestNumberInLongestListSingleList() {
		ArrayList<ArrayList<Integer>> test1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> test2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> test3 = new ArrayList<ArrayList<Integer>>();
		test1.add( this.nums653 );
		assertEquals( 3, MH07.findSmallestNumberInLongestList(  test1   ) ); 
		test2.add( this.nums9999 );
		assertEquals( 9, MH07.findSmallestNumberInLongestList(  test2   ) ); 
		test3.add( this.nums123 );
		assertEquals( 1, MH07.findSmallestNumberInLongestList(  test3   ) ); 
		
	}
	
	@Test
	public void testFindSmallestNumberInLongestListMultipleLists() {
		ArrayList<ArrayList<Integer>> test1 = new ArrayList<ArrayList<Integer>>();
		test1.add( this.nums653 );
		assertEquals( 3, MH07.findSmallestNumberInLongestList(  test1   ) ); 
		test1.add( this.nums9999 );
		assertEquals( 9, MH07.findSmallestNumberInLongestList(  test1   ) ); 
		test1.add( this.nums56187 );
		assertEquals( 1, MH07.findSmallestNumberInLongestList(  test1   ) ); 
		test1.add(nums765987);
		assertEquals( 5, MH07.findSmallestNumberInLongestList(  test1   ) ); 
		
		ArrayList<ArrayList<Integer>> test2 = new ArrayList<ArrayList<Integer>>();
		test2.add(nums765987);
		assertEquals( 5, MH07.findSmallestNumberInLongestList(  test2   ) ); 
		test2.add( this.nums56187 );
		assertEquals( 5, MH07.findSmallestNumberInLongestList(  test2   ) );
		test2.add( this.nums9999 );
		assertEquals( 5, MH07.findSmallestNumberInLongestList(  test2   ) );
		test2.add( this.nums653 );
		assertEquals( 5, MH07.findSmallestNumberInLongestList(  test2   ) );
	}
}