import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");  
  
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver();  
  
        // Launch Website  
        driver.navigate().to("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/"); 
        
        Actions actions = new Actions(driver);
        
        WebElement b1 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
        WebElement b2 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
        
        Thread.sleep(5000);
        actions.dragAndDrop(b1, b2).perform();
        

	}

}
