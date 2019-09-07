package DataDrivenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTours_UsingExcel {
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
  public Object[][] passData(){
	  Object[][] data = new String[4][2];
	  
	  data[0][0] = "admin1";
	  data[0][1] = "admin@123";
	  
	  data[1][0] = "admin2";
	  data[1][1] = "admin@123";
	  
	  data[2][0] = "admin3";
	  data[2][1] = "admin@123";
	  
	  data[3][0] = "admin4";
	  data[3][1] = "admin@123";
	  
	  return data;
	  
  }
  
  @AfterMethod
  public void teardown() {
	  driver.quit();
  }
}
