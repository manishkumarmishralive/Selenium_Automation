
package testNG2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GooglrTitletest 
{
WebDriver driver;
	
@BeforeMethod
public void setUp()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.dell.com/en-in?~ck=mn");	
}
@Test
public void googleTitleTest()
{
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Dell Official Site | Dell India", "Title is not matched");
}
@Test
public void googleLogoTest()
{
boolean b=driver.findElement(By.xpath("//*[@id='navbar-brand']/a/i")).isDisplayed();
//Assert.assertTrue(b);
Assert.assertEquals(b, true);
}
@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
