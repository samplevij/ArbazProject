package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import commonOperations.GeneralActions;

public class HomePage {
	
	WebDriver driver = null;
	GeneralActions generalActions;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.NAME,using="userName")
	private WebElement username;
	
	@FindBy(how=How.NAME,using="password")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@value='Submit']")
	private WebElement loginButton;
	
	@FindBy(how=How.LINK_TEXT,using="REGISTER")
	private WebElement registerLink;
	
	@FindBy(how=How.XPATH,using="//h3[text()='Login Successfully']")
	private List<WebElement> successMessage;
	
	public void enterUsername(String testData)
	{
		generalActions = new GeneralActions(driver);
		generalActions.typeInput(username, testData);
	}
	
	public void enterPassword(String testData)
	{
		generalActions = new GeneralActions(driver);
		generalActions.typeInput(password, testData);
	}
	
	public void clickLogin()
	{
		generalActions = new GeneralActions(driver);
		generalActions.leftClick(loginButton);
	}
	
	public boolean loginSuccess()
	{
		return successMessage.size()>0;
	}
	
	

}
