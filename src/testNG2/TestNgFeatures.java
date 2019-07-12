/**
 * 
 */
package testNG2;

import org.testng.annotations.Test;

/**
 * @author Manish
 *
 */
public class TestNgFeatures {
	
	@Test
     public void loginPage()
     {
		System.out.println("Login successfully");
		int i=9/0;
     }
	@Test(dependsOnMethods="loginPage")
    public void homePage()
    {
		System.out.println("Home page open successfully");
    }
	@Test(dependsOnMethods="loginPage")
    public void searchPage()
    {
		System.out.println("Search page open successfully");
    }
	@Test(dependsOnMethods="loginPage")
    public void registationPage()
    {
		System.out.println("registation page test");
    }
}
