package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _39_with_pf_login_test 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		// obj of login base class
		_39_with_pf_login_base pf=new _39_with_pf_login_base(driver);
		pf.enterUsername("standard_user");
		pf.enterPassword("secret_sauce");
		pf.clickSubmit();
		
	}

}
