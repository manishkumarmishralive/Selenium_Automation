package testNG2;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGStart 
{
//	@BeforeSuite-write xml suite-1
//	@BeforeTest-login test-3
//	@BeforeClass-test this test-4
	
//	@BeforeMethod-eneter url-2
//	Google title test1
//	@AfterMethod-Logout-11
	
//	@BeforeMethod-eneter url-2
//	Google title test2
//	@AfterMethod-Logout-11
	
//	@BeforeMethod-eneter url-2
//	Google title test3
//	@AfterMethod-Logout-11
	
//	@AfterClass-delete all history-13
//	@AfterTest-Delete all cookies-12
	
	
//Pre condition-Satrting with @Before
	@BeforeSuite
	public void test2()
	{
	System.out.println("@BeforeSuite-write xml suite-1");	
	}
	@BeforeMethod
	public void enterURL(){
		System.out.println("@BeforeMethod-eneter url-2");
	}
	@BeforeTest
	public void login(){
		System.out.println("@BeforeTest-login test-3");
	}
	@BeforeClass
	public void test(){
	System.out.println("@BeforeClass-test this test-4");	
	}
	
	//Test case - Starting with @Test
	@Test
	public void googleTitleTest1()
	{
		System.out.println("Google title test1");
	}
	@Test
	public void googleTitleTest2()
	{
		System.out.println("Google title test2");
	}
	@Test
	public void googleTitleTest3()
	{
		System.out.println("Google title test3");
	}
	
	//Post condition -Starting with @After
	@AfterMethod
	public void logout()
	{
		System.out.println("@AfterMethod-Logout-11");
	}
	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("@AfterTest-Delete all cookies-12");
	}
	@AfterClass
	public void deleteHistory()
	{
		System.out.println("@AfterClass-delete all history-13");
	}
	@AfterSuite
	public void testSuite()
	{
		System.out.println("@AfterSuite-Test all suite method-14");
	}
}
