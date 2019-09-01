package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {
	WebDriver driver;
	
	//constructor
	public LoginPageNew(WebDriver driver1) {
		this.driver = driver1;
	}
	
	@FindBy(id="email")
	@CacheLookup
	WebElement username;
	
	@FindBy(how = How.ID,using="passwd")
	@CacheLookup
	WebElement password;
	
	@FindBy(how = How.XPATH, using="//*[@id=\"SubmitLogin\"]") 
	@CacheLookup
	WebElement Submit_button;
	
	public void login_shopping(String uid,String pass) {
		username.sendKeys(uid);
		password.sendKeys(pass);
		Submit_button.click();
	}

}
