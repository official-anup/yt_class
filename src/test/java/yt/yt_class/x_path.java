package yt.yt_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class x_path 
{
	public static void main(String args[]) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		// relative x-path  and using single attribute ---- By.xpath("//input[@id='username']")
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("demo search");
		
		// absolute x-path
//		driver.findElement(By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[1]/div[1]/div[3]/textarea")).sendKeys("full xpath");
		
		
		// using single attribute
//		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("single attribute");
//		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("single attribute");
		
		//using multiple attribute and also try with * instead of "tag"
//		driver.findElement(By.xpath("//textarea[@class='gLFyf'][@id='APjFqb']")).sendKeys("multiple attribute");		
		
		
		// using And ,also with *
//		driver.findElement(By.xpath("//textarea[@class='gLFyf' and @id='APjFqb' ]")).sendKeys("multiple attribute");
		
		
		// using or  ,also with *
//		driver.findElement(By.xpath("//textarea[@class='gLFyf' or @id='APjFqb' ]")).sendKeys("multiple attribute");
		
		
		// using contains() and also with *
//		driver.findElement(By.xpath("//textarea[contains(@class,'gLFyf')]")).sendKeys("using contains()");
		
		
		
		// starts-with and also with *
//		driver.findElement(By.xpath("//textarea[starts-with(@class,'gLF')]")).sendKeys("starts-with");
		

		// using text() , be carefull with the spaces inside the text
//		driver.findElement(By.xpath("//*[text()='Google offered in:  ']"));
//		System.out.println("element found !!");
		
		
		// using position(), //tagname[@attribute-type='attributevalue'][posotion()=value]
//		it is used when where are parent and childs and we want nth number of child
//		driver.get("");
		
		
//		using last(),//tagname[@attribute-type='attributevalue'][last()]
		// input[@type='text'][last()]
		
		
	}

}
