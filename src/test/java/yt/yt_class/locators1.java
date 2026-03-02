package yt.yt_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators1 {
	
	public static void main(String args[]) throws InterruptedException
	{
		
	  try {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
//		By.partialLinkText("Log")
//		By.linkText("Login")
//		By.tagName("input")
//		By.name("email")
//		driver.findElement(By.id("inputUsername")).sendKeys("anup");
//		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("anup");
		
		driver.findElement(By.xpath("//*[@id=\"inputUsername\"]")).sendKeys("hello");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		
		//switch to next page
		String nextPage=driver.getWindowHandle();
		driver.switchTo().window(nextPage);
		
		Thread.sleep(3000);// have to add this,without this not able to click logout
//		because webpage need time to load content
		
		//locate element and perform handle
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/button")).click();
		
//		System.out.println("current page title is :"+driver.getCurrentUrl());
	  
		// it will print number of input tags in home ie login page
//		because it is getting number after logout
	  List<WebElement> elelist=driver.findElements(By.tagName("input"));
	  System.out.println("number of input tags  : "+elelist.size());
	  
	  }
	  
	  catch (Exception e) {
		// TODO: handle exception
		  System.out.println("Error is :"+e.getMessage());
	}
		
		
		
		
	}

}
