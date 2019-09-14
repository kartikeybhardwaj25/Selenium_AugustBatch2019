package edurekaTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
	
  @Test
  public void testEasy() throws InterruptedException {
	  driver.get("https://www.edureka.co/");
	  String title = driver.getTitle();
	  Assert.assertTrue(title.contains("Instructor Led"));
	  Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
