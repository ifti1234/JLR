package cucumber.runners;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import com.mobile.core.Base;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features/08Guides.feature", plugin = { "com.cucumber.listener.ExtentCucumberFormatter:",
		"rerun:output/rerun.txt" }, glue = "cucumber.stepDefinitions", monochrome = true, dryRun = false)
// tags = {"@SignUp2" },
public class CukesRunner {

	@BeforeClass
	public static void setup() throws Exception {
		setReportPath();
	}

	@AfterClass
	public static void teardown() throws Exception {

		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");

	}

	public static void setReportPath() {
		SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		String folder = "./report/TestAutomationReport_" + df.format(new Date());
		Base.setFolder(folder);
		File dir = new File(folder);
		dir.mkdir();
		String report_name = "TestAutomationReport_" + df.format(new Date()) + ".html";
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath(folder + "/" + report_name);
	}

}
