package commonOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralActions {
	
	WebDriver driver=null;
	WebDriverWait wait =null;
	
	public GeneralActions(WebDriver driver)
	{
		this.driver=driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	
	public void typeInput(WebElement element,String testData)
	{
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(testData);
	}
	
	public void leftClick(WebElement element)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public void selectFromDropDown(WebElement element,String testData)
	{
		wait.until(ExpectedConditions.visibilityOf(element));
		Select sel = new Select(element);
		sel.selectByValue(testData);
	}

}
