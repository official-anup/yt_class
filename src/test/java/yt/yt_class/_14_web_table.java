package yt.yt_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _14_web_table 
{
	public static void main(String args[]) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/webtables");
		
		//
        String textString=driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
		System.out.println(textString);
		
	
		
		// total row ie tr
//		List <WebElement> totalRow=driver.findElements(By.xpath("//table/tbody/tr"));
//		System.out.println("Tota number of rows :"+totalRow.size());
		
		// total number of column
//		List<WebElement> totalColumn=driver.findElements(By.xpath("//table/thead/tr[1]/th"));			
//		System.out.println("Tota number of column :"+totalColumn.size());
//		
		
		// data of all column
		List<WebElement> allData=driver.findElements(By.xpath("//table/tbody/tr/td"));			
		for(WebElement data:allData)
		{
			System.out.println(data.getText());
		}
		
		
	}

}
