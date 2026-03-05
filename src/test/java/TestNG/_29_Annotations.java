package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _29_Annotations 
{
	
	@BeforeSuite
	public void beforeSuit() 
	{
		System.out.println("Before Suit.....");
//		Runs once before all tests in the suite start.
	}

	
	@AfterSuite
	public void afterSuit() 
	{
		System.out.println("After Suit.....");
//		 Runs once after all tests in the suite finish.
	}

	
	
	
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("Before Test.....");
//		Executes before any test method in the <test> tag.
	}

	
	@AfterTest
	public void afterTest() 
	{
		System.out.println("After Test.....");
//		Executes after any test method in the <test> tag.
	}
	
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("Before Class.....");
	}

	
	@AfterClass
	public void afterClass() 
	{
		System.out.println("After Class.....");
	}
	
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Before Method.....");
	}

	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("After Method.....");
	}
	
	@Test
	public void test1() 
	{
		System.out.println("This is test 1 ");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("This is test 2 ");
	}
	

}
