package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import commonOperations.GeneralActions;

public class RegisterPage {
	
	WebDriver driver = null;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, RegisterPage.class);
	}
	
	@FindBy(how=How.NAME,using="firstName")
	private WebElement firstName;
	
	@FindBy(how=How.NAME,using="lastName")
	private WebElement lastName;
	
	@FindBy(how=How.NAME,using="email")
	private WebElement username;
	
	@FindBy(how=How.NAME,using="password")
	private WebElement password;
	
	@FindBy(how=How.NAME,using="confirmPassword")
	private WebElement confirmPassword;
	
	

}
