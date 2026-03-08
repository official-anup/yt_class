package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _39_without_PF_login_base 
{
	 WebDriver driver;

	    public _39_without_PF_login_base(WebDriver d) {
	        driver = d;
	    }

	    By username = By.id("user-name");
	    By password = By.id("password");
	    By loginButton = By.id("login-button");

	    public void enterUserName(String uname) {
	        driver.findElement(username).sendKeys(uname);
	    }

	    public void enterPassword(String pass) {
	        driver.findElement(password).sendKeys(pass);
	    }

	    public void submit() {
	        driver.findElement(loginButton).click();
	    }
}
