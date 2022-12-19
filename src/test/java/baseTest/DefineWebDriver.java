package baseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DefineWebDriver {
	
	static WebDriver driver= null;
	
	@Parameters({"browser","appUrl"})
	@BeforeSuite
	public void startBrowser(String browserName,String applicationUrl)
	{
		
		switch(browserName)
		{
		case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.navigate().to(applicationUrl);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
		driver.quit();
	}

}
