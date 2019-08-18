import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//number of frames in webpage
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		//switch command to handle frame
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"singleframe\"]"));
		WebElement iframe1 = driver.findElement(By.xpath("//*[@id=\"singleframe1\"]"));
		WebElement iframe2 = driver.findElement(By.xpath("//*[@id=\"singleframe2\"]"));
		WebElement iframe3 = driver.findElement(By.xpath("//*[@id=\"singleframe3\"]"));
		
		// switching from my parent window to my sub window
		driver.switchTo().frame(iframe);
		
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Edureka");
		
		Thread.sleep(10000);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(iframe1);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(iframe2);

	}

}
