package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
   
public class Dependency2 {
	
    WebDriver driver;
    
    @BeforeClass
    public void browserStart()
	    {
    	System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	    driver=new ChromeDriver();
		System.out.println("==========Browser Started===============");
	    }
    
    
	@Test
	public void startApp()
	    {
		//System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	   // driver=new ChromeDriver();
	    driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    String currentUrl=driver.getCurrentUrl();
	    Assert.assertTrue(currentUrl.contains("demo-6x.orangehrmlive.com"));
	    System.out.println("Application loaded");
	    }
	
	
	@Test(dependsOnMethods="startApp")
	public void loginApp() throws Exception
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Mukesh");
		driver.findElement(By.id("txtPassword")).sendKeys("");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		boolean status=driver.findElement(By.id("account-job")).isDisplayed();
		Assert.assertTrue(status);
	    System.out.println("Login successfully");	
	}
	
	
	@Test(dependsOnMethods="loginApp")
	public void logoutApp()
	{
	driver.findElement(By.id("account-name")).click();
	driver.findElement(By.id("logoutLink")).click();
	Assert.assertTrue(driver.findElement(By.id("txtUsername")).isDisplayed());
	System.out.println("Logout successfuly");
	
	}
	@AfterClass
	public void closeApp()
	{
		driver.quit();
		System.out.println("==========Browser close===============");
	}
	}
	

