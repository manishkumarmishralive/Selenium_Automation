package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyApplication {
	
	@Test
	public void startApp(){
		Assert.assertEquals(12, 13);
		System.out.println("start App");
	}
	@Test(dependsOnMethods="startApp")
	public void loginApp(){
		
		System.out.println("Login to App");
	}
	@Test(dependsOnMethods="loginApp")
	public void logOutApp(){
		
		System.out.println("Logout to App");
	}

}
