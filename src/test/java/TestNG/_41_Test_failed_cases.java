package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _41_Test_failed_cases 
{
	@Test
//	(retryAnalyzer =_41_Retry_Analyser.class)
	public void test1() 
	{
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void test2() 
	{
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void test3() 
	{
		Assert.assertTrue(true);
		
	}

}
