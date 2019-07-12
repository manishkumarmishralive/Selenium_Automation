package dataDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenFW.Xls_Reader1;

public class ParameterizedTestcase {

	public static void main(String[] args) {
		
		 //WebDriver code
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&AppName="
				+ "LithiumT-7567-42e3-a620-0b7cf8ee50ee&ru=https%3A%2F%2Fauth.ebay."
				+ "com%2Foauth2%2Fconsents%3Fclient_id%3DLithiumT-7567-42e3-a620-0b7cf8ee50ee%26redirect_"
				+ "uri%3DLithium_Technol-LithiumT-7567-4-khvro%26scope%26state%3Dhttps%253A"
				+ "%252F%252Fcommunity.ebay.com%252F%26response_type%3Dcode%26hd%26consentGiv"
				+ "en%3Dfalse&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D"
				+ "0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26AppName%3DLithiumT-7567-42e3-a620-0b7"
				+ "cf8ee50ee%26ru%3Dhttps%253A%252F%252Fauth.ebay.com%252Foauth2%252Fconsents%253Fclien"
				+ "t_id%253DLithiumT-7567-42e3-a620-0b7cf8ee50ee%2526redirect_uri%253DLithium_Technol-Lithi"
				+ "umT-7567-4-khvro%2526scope%2526state%253Dhttps%25253A%25252F%25252Fcommunity.ebay.com%2"
				+ "5252F%2526response_type%253Dcode%2526hd%2526consentGiven%253Dfalse");

			//Data driven approach---used to create data driven framework
			//Get test data from excel
					Xls_Reader1 reader=new Xls_Reader1("D:\\Workspacedate13month4_Selenium\\Selenium_Auromation"
							+ "\\src\\tsetData\\HalfEbay.xlsx");
					
					reader.addColumn("RegTestData", "Status");
			
		//Parameterization:
		int rowCount=reader.getRowCount("RegTestData");
        for(int rowNum=2; rowNum<=rowCount; rowNum++)
        {
        	System.out.println("===========");
	     String firstName=reader.getCellData("RegTestData", "firstName", rowNum );
	     System.out.println(firstName);
           
	     String	lastName=reader.getCellData("RegTestData", "lastName", rowNum);
		 System.out.println(lastName);
		    
		 String	email=reader.getCellData("RegTestData", "email", rowNum);
		 System.out.println(email);
		    
		 String	password=reader.getCellData("RegTestData", "password", rowNum);
		 System.out.println(password);
		 
		 //Enter Data
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id='firstname']")).clear();
			driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstName);
			driver.findElement(By.xpath("//*[@id='lastname']")).clear();
			driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastName);
			driver.findElement(By.xpath("//*[@id='email']")).clear();
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys(email);
			driver.findElement(By.xpath("//*[@id='PASSWORD']")).clear();
			driver.findElement(By.xpath("//*[@id='PASSWORD']")).sendKeys(password);
			
			reader.setCellData("RegTestData", "Status", rowNum, "Pass");//Write the data into a cell
        }
        driver.quit();
	}
}
