package MH08Test;
import MH08.MH08;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class TestFindZipCodes {

	private static int testsPassed;
	private static int numberOfTests;

	@BeforeClass
	public static void oneTimeSetUp() {
		testsPassed = 0;
		numberOfTests = 0;
	} // oneTimeSetUp

	// --------------------------------------------

	@AfterClass
	public static void oneTimeTearDown() {
		String className = TestFindZipCodes.class.getSimpleName();
	} // oneTimeTearDown

	// --------------------------------------------
	// Helper operations
	// --------------------------------------------

	private static HashMap<Integer, ArrayList<Double>> initMap() {
		@SuppressWarnings("serial")
		HashMap<Integer, ArrayList<Double>> m = new HashMap<Integer, ArrayList<Double>>() {
			{
				put(46901, new ArrayList<Double>(Arrays.asList(40.501576,-86.14677)));
				put(47801, new ArrayList<Double>(Arrays.asList(39.433602,-87.410094)));
				put(55422, new ArrayList<Double>(Arrays.asList(45.014764,-93.33965)));
				put(80309, new ArrayList<Double>(Arrays.asList(40.087835,-105.373507)));
				put(90265, new ArrayList<Double>(Arrays.asList(34.051056,-118.80768)));
				put(96728, new ArrayList<Double>(Arrays.asList(19.866007,-155.12172)));
				put(98909, new ArrayList<Double>(Arrays.asList(46.637538,-120.794978)));
				put(99790, new ArrayList<Double>(Arrays.asList(64.856055,-146.27598)));
			}
		};		
		
		return m;
	}

	private static boolean checkResult(ArrayList<Integer> answer, ArrayList<Integer> answerToCheck) {
		boolean soFarSoGood = true;
		while (soFarSoGood && (answerToCheck.size() > 0)) {
			soFarSoGood = answer.remove(answerToCheck.remove(0));
		} // end while
		return soFarSoGood && (answer.size() == 0) && (answerToCheck.size() == 0);
	} // checkResult

	// --------------------------------------------
	// JUnit Tests
	// --------------------------------------------

	@Test
	public void testFindZipCodesN01() {
		HashMap<Integer, ArrayList<Double>> myMap = initMap();
		// ----------------------------------------
		// Find 3 zips
		// ----------------------------------------
		ArrayList<Integer> correctAnswer = new ArrayList<Integer>(Arrays.asList(80309, 46901, 47801));

		numberOfTests++;
		ArrayList<Integer> result = MH08.findZipCodes(myMap, 39.1, 41.1);
		String incorrectAnsMsg = "\n" + "expected:" + correctAnswer.toString() + " but was: " + result;
		assertTrue(incorrectAnsMsg, checkResult(correctAnswer, result));
		assertTrue("expected: map to not be changed", myMap.equals(initMap()));
		testsPassed++;
	} // testFindZipCodesN01

	@Test
	public void testFindZipCodesN02() {
		HashMap<Integer, ArrayList<Double>> myMap = initMap();
		// ----------------------------------------
		// Find 0 zips
		// ----------------------------------------
		ArrayList<Integer> correctAnswer = new ArrayList<Integer>();

		numberOfTests++;
		ArrayList<Integer> result = MH08.findZipCodes(myMap, 49.0, 59.0);
		String incorrectAnsMsg = "\n" + "expected:" + correctAnswer.toString() + " but was: " + result;
		assertTrue(incorrectAnsMsg, checkResult(correctAnswer, result));
		assertTrue("expected: map to not be changed", myMap.equals(initMap()));
		testsPassed++;
	} // testFindZipCodesN02

	@Test
	public void testFindZipCodesN03() {
		HashMap<Integer, ArrayList<Double>> myMap = initMap();
		// ----------------------------------------
		// Find all zips
		// ----------------------------------------
		ArrayList<Integer> correctAnswer = new ArrayList<Integer>(
				Arrays.asList(46901,47801,55422,80309,90265,96728,98909,99790));

		numberOfTests++;
		ArrayList<Integer> result = MH08.findZipCodes(myMap, 15.0, 65.0);
		String incorrectAnsMsg = "\n" + "expected:" + correctAnswer.toString() + " but was: " + result;
		assertTrue(incorrectAnsMsg, checkResult(correctAnswer, result));
		assertTrue("expected: map to not be changed", myMap.equals(initMap()));
		testsPassed++;
	} // testFindZipCodesN03

	@Test
	public void testFindZipCodesN04() {
		HashMap<Integer, ArrayList<Double>> myMap = initMap();
		// ----------------------------------------
		// Find zip with most north latitude
		// ----------------------------------------
		ArrayList<Integer> correctAnswer = new ArrayList<Integer>(Arrays.asList(99790));

		numberOfTests++;
		ArrayList<Integer> result = MH08.findZipCodes(myMap, 64.75, 64.95);
		String incorrectAnsMsg = "\n" + "expected:" + correctAnswer.toString() + " but was: " + result;
		assertTrue(incorrectAnsMsg, checkResult(correctAnswer, result));
		assertTrue("expected: map to not be changed", myMap.equals(initMap()));
		testsPassed++;
	} // testFindZipCodesN04
	
	@Test
	public void testFindZipCodesN05() {
		HashMap<Integer, ArrayList<Double>> myMap = new HashMap<Integer, ArrayList<Double>>();
		// ----------------------------------------
		// Test with an empty map
		// ----------------------------------------
		ArrayList<Integer> correctAnswer = new ArrayList<Integer>(Arrays.asList());

		numberOfTests++;
		ArrayList<Integer> result = MH08.findZipCodes(myMap, 64.75, 64.95);
		String incorrectAnsMsg = "\n" + "expected:" + correctAnswer.toString() + " but was: " + result;
		assertTrue(incorrectAnsMsg, checkResult(correctAnswer, result));
		assertTrue("expected: map to not be changed", myMap.size() == 0);
		testsPassed++;
	} // testFindZipCodesN05
	

}
