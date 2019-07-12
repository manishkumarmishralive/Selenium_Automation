package com.freecrm.qa.configproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadProperties {
	
	 
	
	public static void main(String[] args) throws IOException, Exception{
		WebDriver driver = null ;
		//How to read properties file
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("D:\\Workspacedate13month4_Selenium\\Selenium_Auromation\\"
				+ "src\\com\\freecrm\\qa\\configproperties\\configProperties");
		prop.load(ip);
		System.out.println(prop.getProperty("browser"));
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();	
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		else{
			System.out.println("No browser value is given");
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("SignINbtn_Xpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("userName_Xpath"))).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.xpath(prop.getProperty("password_Xpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("Loginbtn_Xpath"))).click();
	}

}
