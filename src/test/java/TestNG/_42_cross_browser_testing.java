package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _42_cross_browser_testing 
{
	WebDriver driver;
	
	
	@BeforeMethod
	@Parameters("browser")
	public void launchBrowser(String browser) 
	{
		switch (browser.toLowerCase()) 
		{
			case "chrome": 
			
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				break;
		
			
			case "fire": 
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
			
			
		default:
            driver=null;
            break;
		}
        
	}

	
	@Test
	public void verifyTitle() 
	{
		driver.get("https://www.saucedemo.com/");
		String actuTitleString="Swag Labs";
		String expTitleString=driver.getTitle();
		
		Assert.assertEquals(expTitleString, actuTitleString);
		
	}
	
	@AfterMethod
	public void quit() 
	{
		driver.close();
		
	}
}
