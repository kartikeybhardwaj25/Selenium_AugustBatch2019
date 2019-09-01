package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	
	WebDriver driver;
	
	By username = By.xpath("//*[@id=\"userid\"]");
	By password = By.xpath("//*[@id=\"password\"]");
	By LoginButton= By.xpath("//*[@id=\"btnActive\"]");
	
	public SignInPage(WebDriver driver1) {
		this.driver = driver1;
	}
	
	public void typeusername(String uid) {
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typepassword(String pswd) {
		driver.findElement(password).sendKeys(pswd);
	}
	
	public void ClickSignOn() {
		driver.findElement(LoginButton).click();
	}
	
	public void VerifyLogin(String uid,String pswd) {
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pswd);
		driver.findElement(LoginButton).click();
		
	}
	
	

}
