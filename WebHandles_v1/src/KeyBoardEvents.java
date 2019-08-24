import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");  
		  
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver();  
  
        // Launch Website  
        driver.navigate().to("https://www.google.com"); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
WebElement menu = driver.findElement(By.name("q"));
        
        Actions actions = new Actions(driver);
        
        Action keyBoardAction = actions.keyDown(menu,Keys.SHIFT).sendKeys("edureka").keyUp(menu,Keys.SHIFT).contextClick().build();
        
        
        keyBoardAction.perform();

	}

}
