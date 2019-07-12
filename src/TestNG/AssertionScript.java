package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScript {
	
	@Test
	public void test1()
	{
	Assert.assertEquals(12, 13);	
	}
	
	@Test
	public void test2()
	{
		System.out.println("Tes case 2 started");
	    Assert.assertEquals(15, 16, "Dropdown count doesnot match please check with developer");
	    System.out.println("Test case 2 completed");
	}
	@Test
	public void test3()
	{
		System.out.println("Test case 3 started");
		Assert.assertEquals("Hello", "Hello", "Word doesnot match please raise a bug");
		System.out.println("Test case 3 completed");
	}
}
