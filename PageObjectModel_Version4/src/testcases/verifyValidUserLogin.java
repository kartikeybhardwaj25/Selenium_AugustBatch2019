package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import pageobject.LoginPageNew;

public class verifyValidUserLogin {
  @Test
  public void f() {
	  
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");
		 * 
		 * // Instantiate a ChromeDriver class. WebDriver driver=new ChromeDriver();
		 * 
		 * driver.manage().window().maximize(); driver.get(
		 * "http://automationpractice.com/index.php?controller=authentication&back=my-account"
		 * );
		 */
	  WebDriver driver = BrowserFactory.StartBrowser("firefox", "http://automationpractice.com/index.php?controller=authentication&back=my-account");
     
    //init method helps in initializa webelement of page object 
    LoginPageNew LoginPageObject =  PageFactory.initElements(driver, LoginPageNew.class);
    
    LoginPageObject.login_shopping("kartikey.edureka25@gmail.com", "demo123");
     
  }
}
