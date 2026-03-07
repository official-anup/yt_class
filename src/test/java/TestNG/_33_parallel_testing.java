package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _33_parallel_testing 
{
	WebDriver driver;
	
	@Test
	public void verfyTitle() 
	{
		driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/");
		String actTitle="Swag Labs";
		String expectTitle=driver.getTitle();
		Assert.assertEquals(expectTitle,actTitle);
		System.out.println("Done !!");
	}

	
	
	@Test
	public void verfyLogo() 
	{
		driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/");
		WebElement logo=driver.findElement(By.className("login_logo"));
		Assert.assertTrue(logo.isDisplayed());
		System.out.println("Done !!");
	}

}
