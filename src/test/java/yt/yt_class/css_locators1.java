package yt.yt_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css_locators1 
{
	public static void main(String args[]) throws InterruptedException 
	{
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://rahulshettyacademy.com/locatorspractice/");
	   
	   // tag#id
	   driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("anup");
	   
	   // tag[attribute=value]
	   driver.findElement(By.cssSelector("input[name=inputPassword]")).sendKeys("rahulshettyacademy");

	   //tag.value
	   driver.findElement(By.cssSelector("button.signInBtn")).click();
	   
	   System.out.println("logged in !!");
	   
	 
	   
//	   //Switch to next window
	   String nextWindow=driver.getWindowHandle();
	   driver.switchTo().window(nextWindow);
	   
	   Thread.sleep(3000);
	   
//	   driver.findElement(By.className("logout-btn")).click();
	   
	   
//	   // tag.class[attribute=value],use this if all properties are there
	   
	   
	   // tag[attribute$=substring] ,last $ means ends with something 
//	   driver.findElement(By.cssSelector("button[class$=btn]")).click();
	   
//	   and ^=  in before means it is starts with
//	   driver.findElement(By.cssSelector("button[class^=logout]")).click();
	   
//	   and *=  means contains
	   driver.findElement(By.cssSelector("button[class*=logout]")).click();
	   
	   
	   
	   
	}

}
