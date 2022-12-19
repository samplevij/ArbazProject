package stepDefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import baseTest.DefineWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class SampleDefns {
	
	WebDriver myfate=null;
	HomePage homePage;
	
	@Given("I am opening the url {string}")
	public void i_am_opening_the_url(String url) {
		myfate =DefineWebDriver.getDriver();
		myfate.navigate().to(url);
	   
	}

	@When("I Enter the credentials as {string} and {string}")
	public void i_enter_the_credentials_as_and(String uname, String pwd) {
		homePage = new HomePage(myfate);
		homePage.enterUsername(uname);
		homePage.enterPassword(pwd);
	   
	}

	@When("I click the Login Button")
	public void i_click_the_login_button() {
	  homePage.clickLogin();
	}

	@Then("Login is successful and I am on booking page")
	public void login_is_successful_and_i_am_on_booking_page() {
	    assertTrue(homePage.loginSuccess());
	}

}
