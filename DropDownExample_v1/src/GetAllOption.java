import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jars\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.facebook.com/");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Select oSelect = new Select(driver.findElement(By.id("year")));
		  
		 List<WebElement> elementCount = oSelect.getOptions();
		 
		 System.out.println(elementCount.size());
		 
		 
		 int iSize = elementCount.size();
		 
		 //Print all options
		 
		 for(int i=0;i<iSize;i++) {
			 String sValue = elementCount.get(i).getText();
			 //System.out.println(sValue);
			 
			 if (sValue.equals("2008")) {
				 
				 System.out.println(i);
				 oSelect.selectByIndex(i);
				 break;
			 }
			 
			 
			 
			 
			 
			 
		 }
		  

	}

}
