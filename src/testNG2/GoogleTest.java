/**
 * 
 */
package testNG2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Manish
 *
 */
public class GoogleTest {
WebDriver driver;
//1//4//7
@BeforeMethod
public void setUP()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();// Launch Chrome
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
}
@Test//2
public void googleTitleTest()
{
String title=driver.getTitle();
System.out.println(title);	
}
 @Test//8
 public void googlelogoTest()
 {
boolean b=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
 }
 @Test//5
 public void gmailLinkTest()
 {
	 boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
 }
//3//6//9
@AfterMethod
public void tearDown()
{
	driver.quit();
}

}
