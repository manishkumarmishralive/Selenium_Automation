package testNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleParameter {
WebDriver driver;
@Test
@Parameters({"browser", "url", "userID", " password " })
public void lauchbrowser(String browserName, String url, String userID, String password)
{
	if(browserName.equalsIgnoreCase("Firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();	
	//driver.manage().window().maximize();
    }
    else if(browserName.equalsIgnoreCase("InetrnetExplorer"))
{
    	System.setProperty("webdriver.ie.driver", "D:\\Library\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
}
//}
//@Test
//@Parameters({"url", "userID", " password " })
//public void enterURL(String url, String userID, String password){ 
driver.get(url);
//driver.findElement(By.id("identifierId")).clear();
driver.findElement(By.id("identifierId")).sendKeys(userID);
driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
//driver.findElement(By.className("whsOnd zHQkBf")).clear();
driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);
driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
driver.quit();
}

}