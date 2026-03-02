package yt.yt_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _20_frame_Iframe 
{
	public static void main(String args[]) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
		// switch to iframe by id and also same for name
//		driver.switchTo().frame("courses-iframe");
//		driver.findElement(By.linkText("Courses")).click();
//		System.out.println("cliked !!");
//		
//	    String elename=  driver.findElement(By.linkText("Courses")).getText();
//		System.out.println("Element name :"+elename);
		
//		///////////////////////////////////////////////////
		// switch to iframe using index
//		driver.switchTo().frame(0);
//	    String elename=  driver.findElement(By.linkText("Courses")).getText();
//		System.out.println("Element name :"+elename);
		
//		///////////////////////////////////////////////////
	
		// 1. switch to iframe by web element
		
		
        WebElement frameElement = driver.findElement(By.id("courses-iframe"));
		
        //2.
        driver.switchTo().frame(frameElement);
        
        //  3: Now you are inside iframe
        driver.findElement(By.linkText("All Access Plan")).click();

        // Step 4: Switch back to main page
//        driver.switchTo().defaultContent();

//        driver.quit();
        
   // //////////////////////////////////////////////////     
        // practice nested frame
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame2");
        // perform action in frame 2 ie child frame and
        
        // return to parent frame
        driver.switchTo().parentFrame();
        //perform action in parent frame
        
        // come to deault page
        driver.switchTo().defaultContent();

        
	}

}
