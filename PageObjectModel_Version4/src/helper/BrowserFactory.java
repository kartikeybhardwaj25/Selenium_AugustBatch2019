package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver StartBrowser(String browsername,String url) {
		
		if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jars\\geckodriver.exe");
			  driver = new FirefoxDriver();
		}
		else if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");  
			  
		      // Instantiate a ChromeDriver class.      
		      WebDriver driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	

}
