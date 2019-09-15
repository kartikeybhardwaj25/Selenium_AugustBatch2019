import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");
		
		
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		 
		 driver.get("http://google.com");
		 
		 WebElement element = driver.findElement(By.name("q"));
		 
		 element.sendKeys("edureka");
		 
		 element.submit();
		 
		 System.out.println("Page title for htmlUnit headless browser:    " +driver.getTitle());
		 
		 driver.quit();

	}

}
