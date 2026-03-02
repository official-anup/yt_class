package yt.yt_class;

import java.lang.module.FindException;
import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _6_handling_dropdown 
{
	public static void main(String args[]) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement ele=driver.findElement(By.id("dropdown-class-example"));
		Select dropdown=new Select(ele);
		
//		A)To select/deselect values from dropdown:
//			-------------------------------------------
//			1)selectByVisibleText()
//		---------------------------------
//		 dropdown.selectByVisibleText("Option1");
		// // to print value,we cant store this in varible ,rather do like below
//		 String selectedText = dropdown.getFirstSelectedOption().getText();
//		 System.out.println(selectedText);
//		 
		 
//			2)deselectByVisibleText(),for multiselect
//		 ----------------------------
		
//
//			3)selectByValue()
//		---------------------------
//		dropdown.selectByValue("option2");
//		 String selectedText = dropdown.getFirstSelectedOption().getText();
//		 System.out.println(selectedText);
		
//			4)deseelctByValue()
//---------------------------------
		
//			5)selectByIndex()
//		----------------------
//		 dropdown.selectByIndex(1);
//		 String selectedText = dropdown.getFirstSelectedOption().getText();
//		 System.out.println(selectedText);
		
		
		
//			6)deseelctByIndex()
//-----------------------------------------------------
//			7)deselectAll()
//--------------------------------------------------
		
		
//			B)To check if the dropdown element allows multiple selections at a time
//			-isMultiple()
//		if(dropdown.isMultiple()==true) 
//		{
//		   System.out.println("return multiple select options");	
//		}
//		else 
//		{
//			System.out.println("does not return multiple select option");
//			
//		}
//---------------------------------------------------------------------
		
//			C)To get options from dropdown
//			---------------------------------
//			-getOptions()
//		List<WebElement> allOptions=dropdown.getOptions();
//		for(WebElement options:allOptions)
//		{
//			System.out.println(options.getText());
//		}

	
	
	
	
	}

}
