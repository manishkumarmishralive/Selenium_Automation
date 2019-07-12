package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert
{

	@Test
	public void testSoft()
	{
		SoftAssert assertion=new SoftAssert(); 
		System.out.println("Test 1 started");
	    Assert.assertEquals(12, 13);
	    System.out.println("Test 1 completes");
	    
	}
}
