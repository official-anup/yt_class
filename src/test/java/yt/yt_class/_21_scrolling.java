package yt.yt_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _21_scrolling 
{
	public static void main(String args[]) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		// for scroll down
//		driver.get("https://www.tutorialspoint.com/selenium/practice/scroll-down.php");
//		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
//		Thread.sleep(3000);
//		jsExecutor.executeScript("window.scrollBy(0,500)");
		
//		/////////////////////////////
	
		// to scroll down by visibility of the element
//		WebElement ele=driver.findElement(By.xpath("//h3[text()='Where does it come from?']"));
//		jsExecutor.executeScript("arguments[0].scrollIntoView();",ele);
//		Thread.sleep(4000);
		
		// //////////////////////////////
		
		// to the botton of the page
//		driver.get("https://www.tutorialspoint.com/selenium/practice/scroll-down.php");

//		jsExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight);");

		
		// //////////////////////////////
		
		// horizontal scroll or we can do this with an element,if we have something in right or left side
		driver.get("https://www.tutorialspoint.com/selenium/practice/horizontal-scroll.php");
		// Locate the horizontal scroll container
		WebElement scrollDiv = driver.findElement(By.className("horizan-scroll"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(4000);
		// Scroll fully to the RIGHT
		js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth;", scrollDiv); // i don't find anything in righ 
//		side so i used this otherwise i cound have used below thing 
//		js.executeScript("arguments[0].scrollIntoView();",scrollDiv); // this thing
		Thread.sleep(4000);
		
	}

}
