package MH09;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import MH09Test.*;

@RunWith(Suite.class)
@SuiteClasses({TestShiftLetters.class, TestAddOnlyDigits.class, TestWrapTillX.class, TestAddThroughArray.class})
public class MH09RunAllTests {
	public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
		double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;
		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", numberOfTests, testsPassed, percentagePassed, testClassName);
	} // outputResults
}
