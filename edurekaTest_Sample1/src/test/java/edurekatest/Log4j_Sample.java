package edurekatest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Log4j_Sample {
	
	Logger logger;
  @Test
  public void testLogs() {
	  
	  logger = Logger.getLogger("kartikLogger");
	  logger.debug("Starting of Selenium");
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  logger.debug("Chrome browser opens");
	  driver.get("http://www.google.com");
	  logger.debug("Navigate to google");
  }
}
