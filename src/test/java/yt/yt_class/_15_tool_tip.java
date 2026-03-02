package yt.yt_class;

import java.security.Identity;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _15_tool_tip 
{
	public static void main(String args[]) 
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
//		get text on button ,not hover text
//		driver.get("https://demoqa.com/tool-tips");
//		WebElement textElement=driver.findElement(By.id("toolTipButton"));
//		Actions actions=new Actions(driver);
//		actions.moveToElement(textElement).perform();
//		System.out.println("Hover text is :"+textElement.getText());
		
	//get hover text
		driver.get("https://google.com");
		String toolTipString=driver.findElement(By.className("gLFyf")).getAttribute("title");
//		System.out.println(toolTipString); //get "search" which is correct
		String actualString="Search";
		if(actualString.equals(toolTipString))
		{
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		
	
	
   }
}
