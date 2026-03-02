package yt.yt_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _13_alerts 
{
	public static void main(String args[]) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		// simple alert and press ok
//		driver.findElement(By.xpath("//button[normalize-space()='Click me']")).click();	
//		driver.switchTo().alert().accept();
		
		
		//confirm alter
//		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept(); // to accept
//		driver.switchTo().alert().dismiss();
	
		// prompt
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("anup");
		Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	
	
	}

}
