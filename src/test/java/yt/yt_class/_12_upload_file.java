package yt.yt_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _12_upload_file 
{
	public static void main(String args[]) throws InterruptedException, AWTException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/upload-download");
		//using sendkeys(),when type=file is given
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\91766\\Downloads\\www.facebook.com_.png");
//		
		
		// using robot class
//		WebElement ele = driver.findElement(By.id("uploadFile"));
//		ele.click();
//
//		Robot rb = new Robot();
//		rb.setAutoDelay(500);
//
//		Thread.sleep(2000);
//
//		StringSelection ss = new StringSelection("C:\\Users\\91766\\Downloads\\b1.png");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_V);
//		rb.keyRelease(KeyEvent.VK_V);
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
//
//		System.out.println("done");
	
	}

}
