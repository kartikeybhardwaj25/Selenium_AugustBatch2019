import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class DemoClass {
 
public static void main(String[] args) throws AWTException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.edureka.co");
driver.manage().window().maximize();
driver.findElement(By.linkText("Courses")).click();
Robot robot = new Robot();
Thread.sleep(4000);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(4000);
robot.keyPress(KeyEvent.VK_TAB);
Thread.sleep(4000);
System.out.println("a");
robot.keyPress(KeyEvent.VK_TAB);
Thread.sleep(4000);
System.out.println("b");
robot.keyPress(KeyEvent.VK_TAB);
Thread.sleep(4000);
System.out.println("c");
robot.mouseMove(30,100);
Thread.sleep(4000);
robot.mouseMove(40,150);
Thread.sleep(4000);
robot.mouseMove(50,200);
Thread.sleep(4000);
robot.mouseMove(60,300);
System.out.println("d");
driver.quit();
 
}
 
}