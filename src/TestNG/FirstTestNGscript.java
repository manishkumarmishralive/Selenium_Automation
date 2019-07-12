package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGscript {
	@Test(priority=1, description="This test case will verify login functionality")
	public void loginApplication(){
		
	System.out.println("Hey, This is my first TestNG test");	
	Assert.assertEquals(12, 13);
	}
	@Test(priority=2,description="This test case will verify select items functionality")
	public void selectItems(){
		
	System.out.println("Hey, This is my first TestNG test");	
		
	}
	@Test(priority=-3,description="This test case will verify logout functionality")
	public void checkedOut(){
		
	System.out.println("Hey, This is my first TestNG test");	
		
	}
	
}
