package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashBoard {

WebDriver driver;
	
	By menu = By.xpath("//*[@id=\"pt1:_UISmmLink::icon\"]");
	
	public dashBoard(WebDriver driver1) {
		this.driver = driver1;
	}
	
	public void menuoption() {
		driver.findElement(menu).click();
	}
	
}
