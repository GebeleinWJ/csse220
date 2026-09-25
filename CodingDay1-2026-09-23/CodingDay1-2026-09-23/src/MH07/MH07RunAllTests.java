package MH07;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import MH07Test.*;

@RunWith(Suite.class)
@SuiteClasses({TestRemoveUpperCase.class, TestProductOfDiagonal.class, TestDailyChanges.class, TestFindLinkedWords.class})
public class MH07RunAllTests {
	public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
		double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;
		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", numberOfTests, testsPassed, percentagePassed, testClassName);
	} // outputResults
}
