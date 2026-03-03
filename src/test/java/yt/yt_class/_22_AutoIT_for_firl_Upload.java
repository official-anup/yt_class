package yt.yt_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _22_AutoIT_for_firl_Upload 
{
	public static void main(String args[]) throws InterruptedException 
	{
		
		// 2-may-2022
		String expectedDay="2";
		String expectedMonth="May";
		String expectedYear="2002";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/date-picker");
		WebElement datElement= driver.findElement(By.id("datePickerMonthYearInput"));
		Thread.sleep(3000);
		datElement.click();
		
	}

}
