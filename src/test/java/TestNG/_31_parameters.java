package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _31_parameters 
{

	@Test
	@Parameters({"i","j"})
	public void add(int a,int b) 
	{
		System.out.println("Addition of A and B is  :"+(a+b));
	}
	
	
	@Test
	@Parameters({"y","z"})
	public void multiply(int c,int d) 
	{
		System.out.println("Multiplication of A and B is  :"+(c*d));
	}
	
}
