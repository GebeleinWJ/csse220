package MH08;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import MH08Test.*;

@RunWith(Suite.class)
@SuiteClasses({TestHighestAverage.class, TestDefinitionContains.class, TestFindMismatch.class, TestClassAverage.class})
public class MH08RunAllTests {
	public static void outputResults(int testsPassed, int numberOfTests, String testClassName) {
		double percentagePassed = (double) testsPassed / (double) numberOfTests * 100.0;
		System.out.printf("%5d   %8d   %10.1f%%   %-15s\n", numberOfTests, testsPassed, percentagePassed, testClassName);
	} // outputResults
}
