package yt.yt_class;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _8_broken_dead_links 
{

	public static void main(String args[]) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links :"+linkList.size());
		int resCode=200; // for valid links
		int brokenlink=0;
				
		for(WebElement ele:linkList)
		{
			String url=ele.getAttribute("href");
			try 
			{
				
			
				URL urlink=new URL(url);
				
				HttpURLConnection huC =(HttpURLConnection)urlink.openConnection();
			
		        huC.setRequestMethod("HEAD");
		        huC.connect();
		        
		        resCode=huC.getResponseCode();
		        
		        if(resCode>=400)
		        {
		        	System.out.println("Broken link :"+url);
		        	brokenlink++;	        
		        }
		        
			 }
			
			
			
			catch (MalformedURLException e) 
			{
				// TODO: handle exception
			}
			catch (Exception e) 
			{
				// TODO: handle exception
			}
	        
		
		}
	
        System.out.println("Total broken links :"+brokenlink);
	
	}
}
