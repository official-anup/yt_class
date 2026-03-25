package yt.yt_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _9_count_number_of_radio_button 

{

	public static void main(String args[]) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
//        WebElement element=driver.findElement(By.xpath("//input[@value='radio2']"));
//        element.click();
//	
//		List<WebElement> allRadio=driver.findElements(By.xpath("//input[@type='radio']"));
//		System.out.println("count is :"+allRadio.size());
		
//		driver.close();  // it shows connetion timeout error
		
	}
}
