package IeBrowserChallanges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\Library\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
        driver.get("http://spicejet.com");
        
	}

}
