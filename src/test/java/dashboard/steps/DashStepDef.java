package dashboard.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dashboard.pages.DashboardPage;

public class DashStepDef {
	
	WebDriver driver;
	DashboardPage dashPage;
	
	
	@Given("^Akash go to Orange HRM home page$")
	public void Akash_go_to_Orange_HRM_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
			
	@When("^Akash enter valid AkashName and password$")
	public void Akash_enter_valid_Akash_and_password() throws Throwable {
		 dashPage = new DashboardPage(driver);
		   dashPage.enterAkashNameAndPassword();
	   
	}

	@When("^Akash click on the login button$")
	public void Akash_click_on_the_login_button() throws Throwable {
	   dashPage.clickOnLoginButton();
	   
	}

	@Then("^Akash navigate to the welcome page$")
	public void Akash_navigate_to_the_welcome_page() throws Throwable {
	   dashPage.verifyWelcomeWord();
	   
	}
	
	@Then("^Akash verify AkashName is display at top right$")
	public void Akash_verify_Akash_name_is_display_at_top_right() throws Throwable {
	   dashPage.verifyAkashName();
	}
	   
	   @Then("^Akash logout$")
	   public void Akash_logout() throws Throwable {
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     dashPage.logout();
		   
	       
	   }

	   @Then("^Akash close browser$")
	   public void Akash_close_browser() throws Throwable {
	     driver.close();
	       driver.quit();
	   
	}



}
