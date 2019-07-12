package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_SignUp {
public WebDriver driver;

public void openURL(){
	driver =new FirefoxDriver();
	driver.get("http://facebook.com");
	driver.manage().window().maximize();
}

public void signUP(){
	driver.findElement(By.id("u_0_j")).sendKeys("Maneesh");
	driver.findElement(By.id("u_0_l")).sendKeys("Mishra");
	driver.findElement(By.id("u_0_o")).sendKeys("7351093186");
	driver.findElement(By.id("u_0_v")).sendKeys("manish@#1995");
	new Select(driver.findElement(By.id("day"))).selectByVisibleText("15");
	new Select(driver.findElement(By.id("month"))).selectByVisibleText("Jan");
	new Select(driver.findElement(By.id("year"))).selectByVisibleText("1995");
	driver.findElement(By.id("u_0_a")).click();
	driver.findElement(By.id("u_0_11")).click();
	
}
	public static void main(String[] args) {
		FB_SignUp fb=new FB_SignUp();
		fb.openURL();
		fb.signUP();

	}

}
