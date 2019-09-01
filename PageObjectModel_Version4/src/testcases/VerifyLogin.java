package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobject.SignInPage;
import pageobject.dashBoard;

public class VerifyLogin {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");  
	  
      // Instantiate a ChromeDriver class.      
      WebDriver driver=new ChromeDriver();
      
      driver.manage().window().maximize();
      driver.get("https://ucf3-zcpo-fa-ext.oracledemos.com/");
      
      SignInPage loginOracle = new SignInPage(driver);
     // loginOracle.typeusername("V2Test");
      //loginOracle.typepassword("V2Test123");
      //loginOracle.ClickSignOn();
      
      loginOracle.VerifyLogin("V2Test", "V2Test123");
      
      dashBoard dash = new dashBoard(driver);
      dash.menuoption();
      
      Thread.sleep(5000);
      driver.quit();
      
     
	  
  }
}
