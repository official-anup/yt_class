package yt.yt_class;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v140.network.model.TrustTokenOperationDone;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _16_capture_screenshot 
{
	public static void main(String args[]) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice");;
		
// // why we convert this
//		TakesScreenshot ssScreenshot =((TakesScreenshot)driver);
//		File srcFile= ssScreenshot.getScreenshotAs(OutputType.FILE);
//		File destFile=new File("C:\\Users\\91766\\Downloads\\FullPage.png");
// //     copy file to destination
//		FileUtils.copyFile(srcFile, destFile);
//		System.out.println("Done !");
		
		// // section SS
        WebElement sectionElement=driver.findElement(By.cssSelector(".form-container.sign-in-container"));
        File srcFile= sectionElement.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\91766\\Downloads\\SectionSS.png");
 //     copy file to destination
		FileUtils.copyFile(srcFile, destFile);
		System.out.println("Done !");
		
		// WebElement SS
//      WebElement sectionElement=driver.findElement(By.xpath("//button[@type='submit']"));
//      File srcFile= sectionElement.getScreenshotAs(OutputType.FILE);
//	  File destFile=new File("C:\\Users\\91766\\Downloads\\WebElementSS.png");
// //  //   copy file to destination
//	  FileUtils.copyFile(srcFile, destFile);
//	  System.out.println("Done !");
		
		
		
	}

}
