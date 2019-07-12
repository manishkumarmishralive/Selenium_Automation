/**
 * 
 */
package com.bitfang.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bitfang.pages.Loginpage;
import com.bitfang.pages.Loginpage2;

/**
 * @author Manish
 *
 */
public class VerifybitfangLogin2 

{
@Test
	public void validLogin()
	{
	    System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bitfang.com/");
		driver.manage().window().maximize();
		
		Loginpage2 login=new Loginpage2(driver );
		
		login.verifyBitfangLogin("manishmishra10048@gmail.com", "manish@#1995");
		
//		login.Login();
//		
//		login.enterEmaiid("manishmishra10048@gmail.com");
//		
//		login.enterPassword("manish@#1995");
//		
//		login.clickLoginButton();
		
		driver.quit();
	}
	
}
