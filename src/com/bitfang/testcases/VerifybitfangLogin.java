 /**
 * 
 */
package com.bitfang.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bitfang.pages.Loginpage;

/**
 * @author Manish
 *
 */
public class VerifybitfangLogin 

{
@Test
	public void validLogin()
	{
	    System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bitfang.com/");
		driver.manage().window().maximize();
		
		Loginpage login=new Loginpage(driver );
		
		login.Login();
		
		login.enterEmaiid();
		
		login.enterPassword();
		
		login.clickLoginButton();
		
		driver.quit();
	}
	
}
