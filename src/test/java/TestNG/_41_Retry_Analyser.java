package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class _41_Retry_Analyser implements IRetryAnalyzer
{
	//counter to keep track of retry attempts
	int counterForRetryAttempts=0;
	
	//set max limit for retry
	int setMaxLimitForRetry=3;
	
	


	public boolean retry(ITestResult result) 
	{
		if(!result.isSuccess())
		{
			if(counterForRetryAttempts<setMaxLimitForRetry)
			{
				counterForRetryAttempts++;
				return true;
			}
		}
		return false;
	}


}
