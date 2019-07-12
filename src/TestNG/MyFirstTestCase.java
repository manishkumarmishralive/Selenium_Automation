package TestNG;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(TestNG.Listener.class)
public class MyFirstTestCase {
    @Test
	public void googleTitleVerify()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
	}
    
    @Test
	public void titleMatch()
	{
	System.out.println("Test 2 is dummy");
	Assert.assertTrue(false);
	}

}
