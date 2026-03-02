package yt.yt_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _19_js_executor 
{
	public static void main(String args[]) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/webtables");  
	    
		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		
		
//		jsExecutor.executeScript("document.getElementById('searchBox').value='Cierra';");
		jsExecutor.executeScript(
			    "var element = document.getElementById('searchBox');" +
			    "element.value='Cierra';" +
			    "element.dispatchEvent(new Event('input'));"
			);
		WebElement element=driver.findElement(By.id("basic-addon2"));
		
		jsExecutor.executeScript("arguments[0].click()",element);
		
		 jsExecutor.executeScript("history.go(0)");
	
	
	
	
	
	
	
	
	}

}
