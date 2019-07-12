package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url)
	{
		if(browserName.equals("forefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("chrome"))
		{
			driver =new ChromeDriver();
		}
		else if(browserName.equals("IE"))
		{
			driver =new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

	public static void main(String[] args) 
	{
		

	}

}
