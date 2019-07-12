package seleniumRC;

import com.thoughtworks.selenium.DefaultSelenium;

public class Facebook_Login {

	public static void main(String[] args) throws Exception {
		DefaultSelenium selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://facebook.com");
		selenium.start();
		selenium.open("/");
		Thread.sleep(8000);
		selenium.windowMaximize();
		selenium.click("u_0_2");
		
		selenium.type("email", "manishmishralive");
		selenium.type("pass","manish@#1995");
		selenium.click("u_0_3");
	}

}
