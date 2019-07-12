package dataDrivenTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenFW.Xls_Reader1;

public class WebTableHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[4]/td[2]
		//*[@id="customers"]/tbody/tr[5]/td[2]
		
		String beforeXpath_company_Name="//*[@id='customers']/tbody/tr[";
		String afterXpath_company_Name="]/td[1]";
		
		String beforeXpath_contact="//*[@id='customers']/tbody/tr[";
		String afterXpath_contact="]/td[2]";
		
	    List<WebElement>	rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
	    System.out.println("Total no of rows are "+(rows.size()-1));
	    int rowCount=rows.size();
	    
	    
	    Xls_Reader1 reader=new Xls_Reader1("D:\\Workspacedate13month4_Selenium\\Selenium_Auromation\\src\\tsetData\\HalfEbay.xlsx");
		//reader.addSheet("TableData");
	    if(!reader.isSheetExist("TableData")){
	    	reader.addSheet("TableData");
	    	reader.addColumn("TableData", "CompanyName");
			reader.addColumn("TableData", "Contact");
	    }
		
	    
		for(int rowNum=2; rowNum<=rowCount; rowNum++){
			
		System.out.println("=======");	
		String actualXpath=beforeXpath_company_Name+rowNum+afterXpath_company_Name;
		String companyName=driver.findElement(By.xpath(actualXpath)).getText();
		System.out.println(companyName);
		
		reader.setCellData("TableData", "CompanyName", rowNum, companyName);
		
		//System.out.println("contact=======");
		String actualXpath1=beforeXpath_contact+rowNum+afterXpath_contact;
		String contact=driver.findElement(By.xpath(actualXpath1)).getText();
		System.out.println(contact);
		
		reader.setCellData("TableData", "Contact", rowNum, contact);
		}
        driver.quit();
	}

}
