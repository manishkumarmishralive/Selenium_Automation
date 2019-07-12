/**
 * 
 */
package com.bitfang.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bitfang.pages.Loginpage3;

import helper.BrowserFactory;

/**
 * @author Manish
 *
 */

public class VerifyvalidLogin 
{
  @Test
  public void validUserLogin()
  {
	  //this will launch the browser and specific url
    WebDriver	driver= BrowserFactory.startBrowser("Chrome", "https://www.bitfang.com/");
	 
    //created page object of page factory
    Loginpage3 Login_Page3 =PageFactory.initElements(driver, Loginpage3.class );
    
    //call the method
    Login_Page3.verify_Bitfan_logon("manishmishra10048@gmail.com", "manish@#1995");
    
  }
	
}
