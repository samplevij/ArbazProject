package testCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseTest.DefineWebDriver;
import pageObjects.HomePage;

public class RegressionSuite {
	
	WebDriver myfate=null;
	HomePage homePage;
	
	
	@Test
	public void verifySuccessfulLogin()
	{
		myfate =DefineWebDriver.getDriver();
		homePage = new HomePage(myfate);
		homePage.enterUsername("vijay");
		homePage.enterPassword("test");
		homePage.clickLogin();
		assertTrue(homePage.loginSuccess());
	}

}
