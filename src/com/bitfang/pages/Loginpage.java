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
public class Loginpage 
{
WebDriver driver;

    By Login=By.xpath("/html/body/div[6]/div[2]/div/div[2]/div[2]/div[2]/div[1]/ul/li[2]/a[2]");
    
	By emialid=By.id("Email");
	
	
	By password=By.name("Password");
	
	By clickloginbutton=By.xpath("/html/body/div[6]/div[6]/div/div/div/div/div[1]/div/form/div[2]/div[3]/input");
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Login()
	{
	driver.findElement(Login).click();	
	}
	
	public void enterEmaiid()
	{
		driver.findElement(emialid).sendKeys("manishmishra10048@gmail.com");
	}
	
	public void enterPassword()
	{
		driver.findElement(password).sendKeys("manish@#1995");
	}
	
	public void clickLoginButton()
	{
		driver.findElement(clickloginbutton).click();
		
	}
}


