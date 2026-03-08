package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _39_without_PF_login_test 
{
	 public static void main(String[] args) throws InterruptedException {

	        WebDriverManager.chromedriver().setup();

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://www.saucedemo.com/");

	        _39_without_PF_login_base lp = new _39_without_PF_login_base(driver);

	        lp.enterUserName("standard_user");
	        lp.enterPassword("secret_sauce");
	        lp.submit();

	        Thread.sleep(4000);
	        driver.quit();
	    }

}
