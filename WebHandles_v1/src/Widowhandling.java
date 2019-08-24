import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Widowhandling {

	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");  
  
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver();  
  
        // Launch Website  
        driver.navigate().to("http://demo.automationtesting.in/Windows.html"); 
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        System.out.println("Title of main window: "+driver.getTitle());
        
        
        
        WebElement tabbedWindow = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
        tabbedWindow.click();
        Thread.sleep(5000);
        
       Set<String> windowIds = driver.getWindowHandles();
       
      Iterator<String> Iter = windowIds.iterator();
      
      String mainWindow =Iter.next();
      String childWindow =Iter.next();
      
      driver.switchTo().window(childWindow);
        
        System.out.println("Title of child window: "+driver.getTitle());
        
        driver.close();
        Thread.sleep(5000);
        driver.switchTo().window(mainWindow);
        
        System.out.println("Title of main window: "+driver.getTitle());

	}

}
