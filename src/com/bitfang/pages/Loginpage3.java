/**
 * 
 */
package com.bitfang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Manish
 *
 */
public class Loginpage3 
{
	
	WebDriver driver;
	
	public Loginpage3(WebDriver ldriver)
	{
	 this.driver=ldriver;	
	}

	@FindBy(xpath="/html/body/div[6]/div[2]/div/div[2]/div[2]/div[2]/div[1]/ul/li[2]/a[2]")
	@CacheLookup
	WebElement login;
	
	@FindBy(how=How.ID,using="Email")
	@CacheLookup
	WebElement email;
	
	@FindBy(how=How.CLASS_NAME, using="password") 
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH, using="/html/body/div[6]/div[6]/div/div/div/div/div[1]/div/form/div[2]/div[3]/input")
	@CacheLookup
	WebElement clickonloginbutton;

	public void verify_Bitfan_logon(String Emailid, String psw)
	{
		login.click();
		email.sendKeys(Emailid);
		password.sendKeys(psw);
		clickonloginbutton.click();
		
	}
}
