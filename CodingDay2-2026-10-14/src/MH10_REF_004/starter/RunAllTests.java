package MH10_REF_004.starter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import MH10_REF_004.tests.TestCar;
import MH10_REF_004.tests.TestTruck;
import MH10_REF_004.tests.TestMotorcycle;
import MH10_REF_004.tests.TestGarageMain;

@RunWith(Suite.class)
@SuiteClasses({TestCar.class, TestTruck.class, TestMotorcycle.class, TestGarageMain.class})
public class RunAllTests {
    // runs all the tests in the SuiteClasses annotation
}
