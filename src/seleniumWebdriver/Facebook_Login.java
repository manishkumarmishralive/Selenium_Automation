package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Login {
	public WebDriver driver;
	
	public void openURL(){
		driver= new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
	}
	
	public void facebookLogin(){
		driver.findElement(By.id("email")).sendKeys("manishmishralive");
		driver.findElement(By.id("pass")).sendKeys("manish@#1995");
		driver.findElement(By.id("u_0_2")).click();
		
	}

	public static void main(String[] args) {
		Facebook_Login fb=new Facebook_Login();
		fb.openURL();
		fb.facebookLogin();
		

	}

}
