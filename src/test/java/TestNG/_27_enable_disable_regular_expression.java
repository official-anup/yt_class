package TestNG;

import org.testng.annotations.Test;

public class _27_enable_disable_regular_expression 
{
//	is it disabled and we add this in group and include this group in 
//	XML,still it will not be run
//	
	@Test(enabled = false,groups = {"smoke"})
	public void PersonalLoanMobileLogin() 
	{
         System.out.println("Personal Loan Mobile Login");
	}
	
	@Test(enabled = false)
	public void PersonalLoanWebLogin() 
	{
         System.out.println("Personal Loan Web Login");
	}
	
	@Test(enabled = false)
	public void PersonalLoanApiLogin() 
	{
         System.out.println("Personal Loan Api Login");
	}
	
	@Test
	public void AutomobileLoanMobileLogin() 
	{
         System.out.println("Automobile Loan Mobile Login");
	}
	
	@Test(groups = "smoke")
	public void AutomobileLoanWebLogin() 
	{
         System.out.println("Automobile Loan Web Login");
	}
	
	@Test
	public void AutomobileLoanApiLogin() 
	{
         System.out.println("Automobile Loan Api Login");
	}

}
