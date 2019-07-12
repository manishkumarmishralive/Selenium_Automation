/**
 * 
 */
package com.bitfang.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Manish
 *This class will store all classes and methods of login page
 */
public class Loginpage2 
{
WebDriver driver;

    By Login=By.xpath("/html/body/div[6]/div[2]/div/div[2]/div[2]/div[2]/div[1]/ul/li[2]/a[2]");
    
	By emialid=By.id("Email");
	
	
	By password=By.name("Password");
	
	By clickloginbutton=By.xpath("/html/body/div[6]/div[6]/div/div/div/div/div[1]/div/form/div[2]/div[3]/input");
	
	public Loginpage2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyBitfangLogin(String emailid, String pass)
	{
		driver.findElement(Login).click();
		driver.findElement(emialid).sendKeys(emailid);	
		driver.findElement(password).sendKeys(pass);
		driver.findElement(clickloginbutton).click();
	}
	
	public void Login()
	{
	driver.findElement(Login).click();	
	}
	
	public void enterEmaiid(String email)
	{
		driver.findElement(emialid).sendKeys(email);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(clickloginbutton).click();
		
	}
}


