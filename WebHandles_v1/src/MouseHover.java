import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");  
  
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver();  
  
        // Launch Website  
        driver.navigate().to("https://www.amazon.in/"); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        WebElement menu = driver.findElement(By.xpath("//span[text()='Category']"));
        
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        
        WebElement Men_fashion= driver.findElement(By.xpath("//span[text()='TV, Appliances, Electronics']"));
        actions.moveToElement(Men_fashion).perform();
        
        WebElement Clothing= driver.findElement(By.xpath("//span[text()='Televisions']"));
        Clothing.click();
        
        
        driver.getTitle();
        

	}

}
