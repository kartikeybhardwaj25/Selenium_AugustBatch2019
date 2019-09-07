package DataDrivenTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.ExcelDataConfig;

public class DemoTours_UsingExcel2 {
	WebDriver driver;
  @Test(dataProvider="MercuryTours")
  public void loginDemoTours(String username,String Password) {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.get("http://www.newtours.demoaut.com/");
	  
	  driver.findElement(By.name("userName")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(Password);
	  
	  driver.findElement(By.name("login")).click();
	  
	
	  
	  System.out.println("Page Title is correct" +driver.getTitle());
	  
	 
	  }
  
  @DataProvider(name="MercuryTours")
  public Object[][] passData() throws IOException{
	  
	  ExcelDataConfig configFile = new ExcelDataConfig("C:\\Users\\kartikey\\eclipse-workspace\\Frameworks\\src\\TestData\\TestData.xlsx");
	  
	  int rows =configFile.getRowCount(0);
	  
	  
	  Object[][] data = new String[rows][2];
	  
	 for(int i=1;i<=rows;i++) {
		 
		 data[i][0]=configFile.getData(0, i, 1);
		 data[i][1]=configFile.getData(0, i, 2);
	 }
	  
	  return data;
	  
  }
  
  @AfterMethod
  public void teardown() {
	  driver.quit();
  }
}
