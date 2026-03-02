package yt.yt_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _7_count_hyperlink 
{
	public static void main(String args[])
	{
		

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	//list all anchor tags
	List<WebElement> allAnchor=driver.findElements(By.tagName("a"));
//	System.out.println("Total links on webpage :"+allAnchor.size());

for(WebElement anchor:allAnchor)
	{
		System.out.println("number of anchor tags :"+anchor.getText());
	}
	
	
	}
}
