package yt.yt_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v140.page.model.WebAppManifest;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _11_mause_actions 

{
	/**
	 * @param args
	 */
	public static void main(String args[]) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		// for right click
//		WebElement button= driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
//		Actions act=new Actions(driver);
//		act.contextClick(button).perform(); 
		
		
		// for double click
//		WebElement buttonElement=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
//		Actions act=new Actions(driver);
//		act.doubleClick(buttonElement).perform();
//		System.out.println("clicked");
		
		// for double click
//	driver.findElement(By.xpath("//button[text()='Click Me']")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='Click Me']")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-primary' and text()='Click Me']")).click();
//		System.out.println("clicked");
		
	}

}
