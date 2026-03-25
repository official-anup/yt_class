package yt.yt_class;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag_drop 

{
	public static void main(String args[]) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//drag  and drop
//		driver.get("https://testautomationcentral.com/demo/drag_and_drop.html");
//	    WebElement source=driver.findElement(By.id("draggable"));
//	    WebElement destionation=driver.findElement(By.id("droppable"));
//		Actions action=new Actions(driver);
//		action.dragAndDrop(source,destionation).perform();
//		
		
		// hover 
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	    WebElement hoverElement=driver.findElement(By.id("mousehover"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", hoverElement);
//	    Actions action=new Actions(driver);
//	    action.moveToElement(hoverElement).perform();
	
		System.out.println("done");
	    
	}

}
