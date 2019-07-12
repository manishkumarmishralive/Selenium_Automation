package seleniumRC;

import com.thoughtworks.selenium.DefaultSelenium;

public class Gmail_Login {

	public static void main(String[] args) throws Exception {
		DefaultSelenium selenium =new DefaultSelenium("localhost", 4444, "*firefox", "http://gmail.com");
		selenium.start();
		selenium.open("/");
		 
		selenium.windowMaximize();
		
		selenium.type("identifierId", "manishmishralive");
		selenium.click("css=span.RveJvd snByac");
		Thread.sleep(3000);
		selenium.type("Passwd", "MmAa@#1995");
		Thread.sleep(3000);
		selenium.click("signIn");
		Thread.sleep(3000);
		selenium.click("gb_71");

	}

}
