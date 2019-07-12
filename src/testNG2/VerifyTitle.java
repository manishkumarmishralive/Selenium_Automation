package testNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {
WebDriver driver;

@Test
@Parameters({"browser","url", "email", "password"})
public void VerifyPageTitle(String browserName, String url, String email, String password) throws Exception{
	if(browserName.equalsIgnoreCase("Firefox"))
	{
		driver=new FirefoxDriver();
		
	}
	else if(browserName.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("InetrnetExplorer"))
	{
		System.setProperty("webdriver.ie.driver", "D:\\Library\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	} 
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.id("identifierId")).sendKeys(email);
	
	driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a/span")).click();
	driver.findElement(By.xpath("//*[@id='gb_71']")).click();

	//System.out.println(driver.getTitle());
	//driver.quit();
}

}
