package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _32_data_providers 
{
	
	@Test(dataProvider = "searchdata")
	public void searchKeywords(String country,String monument) 
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement searchElement=driver.findElement(By.name("q"));
		searchElement.sendKeys(country,monument);
		
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		
	}
	
	@DataProvider(name="searchdata")
	public Object[][] dataProviderMethod()
	{
		return new Object[][]
		{
			{"India","Taj mahal"},
			{"Italy","Eiffel tower"},
			{"USA","Statue of liberty"},
		};
	}

}
