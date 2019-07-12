package testNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParameterAnnotationsInTestNG {
 WebDriver driver;
 
 @Test
 public void browserlaunch()
 {
	 System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://gmail.com");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 
 }
	@Test
	public void gmailLoginTest1()
	{
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("manishmishralive");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		 driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("MmAa@#1995");
		 driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		
	}
	@Test
	public void logOut()
	{
		driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a/span")).click();
		driver.findElement(By.xpath("//*[@id='gb_71']")).click();
		driver.quit();
	}	
}
