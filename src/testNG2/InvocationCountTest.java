package testNG2;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=10)
	public void sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("the sum is "+c);
	}
	
	
	
}
