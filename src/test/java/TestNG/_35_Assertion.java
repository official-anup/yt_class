package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _35_Assertion 
{
	@Test
	public void AsserDemo() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String expTitle="Automation Testing Practice";
		String actTitile=driver.getTitle();
//		System.out.println(actTitile);
		Assert.assertEquals(expTitle, actTitile);
		
		WebElement logo=driver.findElement(By.className("wikipedia-icon"));
        Assert.assertTrue(logo.isDisplayed());
        
		WebElement searchButton=driver.findElement(By.className("wikipedia-search-button"));
        Assert.assertTrue(searchButton.isDisplayed());
		
        
//        Thread.sleep(4000);
        driver.close();
		
	}

}
