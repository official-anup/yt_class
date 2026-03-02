package yt.yt_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basic_commands {
	public static void main(String args[]) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println("page source :"+driver.getPageSource());
		
		System.out.println("page title :"+driver.getTitle());
		
		System.out.println("Current url :"+driver.getCurrentUrl());
		
		
		
		
	}

}
