package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {

	@Test
	public void startApp()
	{
		Assert.assertEquals(12, 13);
		System.out.println("start app");
	}
	
	
	@Test(dependsOnMethods="startApp")
	public void loginApp()
	{
		System.out.println("Login to app");
	}
	
	
	@Test(dependsOnMethods="loginApp")
	public void logoutApp()
	{
		System.out.println("logout app");
	}
	
	
}
