package yt.yt_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _17_open_new_window 

{
	public static void main(String args[]) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		// oepn new window
//		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		
		
	}

}
