package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Yatra_comPopUP {
	public WebDriver driver;
  @Test// Test scenario
  public void verifyOnewaySearch() throws Exception {
	 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	 Thread.sleep(2000);
	  
	 driver.findElement(By.partialLinkText("Hyderabad (HYD)")).click();
	 
	 driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.partialLinkText("Bengaluru (BLR)")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
	 Thread.sleep(3000);
	 //driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
	 driver.findElement(By.linkText("24")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("divpaxinfo")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("hrefIncAdt")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("hrefIncChd")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("hrefIncInf")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("btnclosepaxoption")).click();
	 Thread.sleep(2000);
	 new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("USD");
	 Thread.sleep(2000);
	 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	 Thread.sleep(2000);
	  
	  
  }
  @Test //Test scenario
  public void verifypopUP() throws Exception{
	  
	  driver.findElement(By.id("popUpConverter")).click();
	  Thread.sleep(3000);
	  
	  new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency")))
	  .selectByVisibleText("US Dollar(USD)");
	  
	  new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency")))
	  .selectByVisibleText("Indian Rupee(INR)");
	  
	  driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("100");
	  
	  driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
	  
	  driver.findElement(By.id("ButtonCloseWindow")).click();
	  
  }
  @BeforeTest //PRE-condition
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
	  driver.manage().window().maximize();
  
  }

  @AfterTest// post condition
  public void afterTest() {
	  driver.quit();
  }

} 
