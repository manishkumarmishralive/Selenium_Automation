package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {
WebDriver driver;

@Test
@Parameters("Browser")
public void verifyPageTitle(String browserName){
	if(browserName.equalsIgnoreCase("firefox")){
		
		driver=new FirefoxDriver();
		}
	else if(browserName.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("ie")){
		System.setProperty("webdriver.ie.driver", "D:\\Library\\IEDriverServer.exe");
	driver=new InternetExplorerDriver();
	
	}
	driver.manage().window().maximize();
	driver.get("http://spicejet.com");
	System.out.println(driver.getTitle());
	//driver.quit();
	}	
}

