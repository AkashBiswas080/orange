package Com.runner;

import java.io.File;

import org.junit.runner.RunWith;
import org.junit.AfterClass;
import cucumber.api.CucumberOptions;
import com.cucumber.listener.Reporter;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = {"dashboard.steps"},
		tags = {"@smokeTest"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome = true		
		)
public class Runner {
	
	@AfterClass
	public static void writeExtenReport() {
		
		Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone",System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machin", "Windows 10 " + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.7.0");
		Reporter.setSystemInfo("Maven", "3.6.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_231");
		Reporter.setSystemInfo("Smart Tech", "Saturday Morning");
		
	}
}
