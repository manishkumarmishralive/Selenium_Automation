package capturescreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import library.Utility;

public class Facebookscreenshot 
{
	
	@Test
	public void captureScreenshot() throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		
		Utility.capturescreenshot(driver, "Browserstarted");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("manishmishralive");
		
		Utility.capturescreenshot(driver, "TypeUname");
		
		System.out.println("Screenshot taken successfully");
	    driver.quit();
		
		
	}
	
	

}
