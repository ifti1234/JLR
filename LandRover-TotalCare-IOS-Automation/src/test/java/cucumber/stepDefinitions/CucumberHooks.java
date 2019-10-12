package cucumber.stepDefinitions;

import com.mobile.core.AppiumManager;
import com.mobile.core.Base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks extends Base {

	public Scenario scenario;

	@Before
	public void beforeHook(Scenario scenario) throws Exception {
		this.scenario = scenario;

		new AppiumManager().Driverinitializer();

	}

	@After
	public void afterHook(Scenario scenario) {

		if (scenario.isFailed()) {
			extentReport_AddScreenCapture();
			driver.quit();
			// driver = null;
		}
		tearDownDriver();
		System.out.println("Appium Connection Server has been Quit!");

	}

}
