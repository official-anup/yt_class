package TestNG;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class _37_invocationCount 
{
//	@Test(invocationCount = 3)
//	public void demoTest() 
//	{
//	  System.out.println("This is recurring method..");	
//	}
	
	
	@Test(invocationCount = 3)
	public void demoTest(ITestContext context) 
	{
	  int currentinvocationcount=context.getAllTestMethods()[0].getCurrentInvocationCount();
	  // [1],if there is another method
	  System.out.println("Current invocation :"+currentinvocationcount);
	  System.out.println("This is recurring method..");	
	}

}
