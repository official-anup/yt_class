package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _39_with_pf_login_base 
{

	WebDriver driver;
	
	//constructor
	public _39_with_pf_login_base(WebDriver d)
	{
		driver=d;		
		// this method will create web elements
		PageFactory.initElements(driver, this);
	}
	
	//elements
	@FindBy(id = "user-name")
	WebElement usernamElement;
	
	@FindBy(id = "password")
	WebElement passwordElement;
	
	
	@FindBy(id = "login-button")
	WebElement submitButtonElement;
	
	//actions
	public void enterUsername(String uname) 
	{
		usernamElement.sendKeys(uname);
	    submitButtonElement.click();
	}
	
	
	public void enterPassword(String pass) 
	{
		passwordElement.sendKeys(pass);
	}
	
	public void clickSubmit() 
	{
	    submitButtonElement.click();
	}



	
}
