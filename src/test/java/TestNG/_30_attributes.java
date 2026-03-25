package TestNG;

import org.testng.annotations.Test;


public class _30_attributes 
{
	@Test(description = "This is test case 1 description")
	public void test1() 
	{
		System.out.println("Test case 1,for decription");
		
	}
	
	@Test(priority =1)
	public void test2() 
	{
		System.out.println("Test case 2,has priority 1,it will execute last,because other test cases has no priority means they have prioritu 0 means they run first");
		
	}
	
	
	@Test(groups = {"smoke"})
	public void test3() 
	{
		System.out.println("Test case 3,for smoke test");
		
	}
	
	
	@Test(enabled = true)
	public void test4() 
	{
		System.out.println("Test case 4,for enable");
		
	}
	
	@Test(dependsOnMethods = "test1")
	public void test5() 
	{
		System.out.println("Test case 5,for dependsOnMethods");
		
	}
	
	@Test(timeOut = 3000)
	public void test6() 
	{
		System.out.println("Test case 6,for timeouts");
		
	}
	
	
	@Test(invocationCount = 3)
	public void test7() 
	{
		System.out.println("Test case 7,for invocationCount");
		
	}
	
	
}
