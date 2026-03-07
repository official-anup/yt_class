package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listerner_for_34 implements ITestListener
{

	// we have to address all method,
//	we can skipped some their's implementation like
	// last method
	
	public void onStart(ITestContext Result) 
	{
		System.out.println("On Start method invoked");
	}
	
	public void onFinish(ITestContext Result) 
	{
		System.out.println("On Finish method invoked");
	}
	
	public void onTestFailure(ITestResult Result) 
	{
		System.out.println("Name of the method failed :"+Result.getMethod());
	}
	
	
	public void onTestSkipped(ITestResult Result) 
	{
		System.out.println("Name of the method skipped :"+Result.getMethod());
	}
	
	public void onTestStart(ITestResult Result) 
	{
		System.out.println("Name of the method stat :"+Result.getMethod());
	}
	
	
	public void onTestSuccess(ITestResult Result) 
	{
		System.out.println("Name of the method successfully executed :"+Result.getMethod());
	}
	
	public void onTestFailedWithinSuccessPercentage(ITestResult Result) 

	{
	}
}
