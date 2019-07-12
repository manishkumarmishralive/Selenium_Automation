package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScript2 {
	
	@Test
	public void test1()
	{
		String mystr="Maneesh Mishra";
		//Assert.assertTrue(mystr.contains("Maneesh"));
		Assert.assertTrue(mystr.contains("Sachin"), "Names are not matching");
	}
	
	public void test2()
	{
		Assert.assertTrue(false);
	}
}
