package FluentWait;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitClass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		// Start application
				driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		 
				// Click on timer button to start
				driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
				
				boolean status = driver.findElement(By.xpath("//p[text()='WebDriver']")).isDisplayed();
				
		/*
		 * if(status) { System.out.println("Test case passed"); } else {
		 * System.out.println("Test case failed"); }
		 */
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
						.withTimeout(30,SECONDS)
						.pollingEvery(5,SECONDS)
						.ignoring(NoSuchElementException.class);
		
}

}