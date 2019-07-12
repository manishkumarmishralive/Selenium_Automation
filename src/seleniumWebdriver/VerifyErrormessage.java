package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyErrormessage {
    public WebDriver driver;
    
	public static void main(String[] args) throws Exception {
		 
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		String Actual_Error=driver.findElement(By.xpath("//div[@id='view_container']/div/div/div[2]"
				+ "/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]/div")).getText();
		Thread.sleep(3000);
		
		//Type 1
		String Expected_Error="Enter an email or phone number";
		Assert.assertEquals(Actual_Error, Expected_Error);
		
		//Type 2
		Assert.assertTrue(Actual_Error.contains("Enter an email or phone number"));
		System.out.println("Test completed ");

	}

}
