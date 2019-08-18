package com.edureka.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ModalPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium_Jars\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.get("http://uitestpractice.com/Students/Switchto");
		  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/button[4]")).click();
		  
		  
		 String s1= driver.findElement(By.className("modal-title")).getText();
		 
		 System.out.println(s1);
		 
String s2= driver.findElement(By.className("modal-body")).getText();
		 
		 System.out.println(s2);
		  
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[text()='Ok']")).click();
		  

	}

}
