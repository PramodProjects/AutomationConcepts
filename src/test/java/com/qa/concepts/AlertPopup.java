package com.qa.concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
//		// Click Ok button and get text of alert
//		driver.findElement(By.xpath("//button[text() = 'Alert Box']")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();		
//		String text = alert.getText();		
//		System.out.println(text);
//		alert.accept();
//		Thread.sleep(2000);
//		driver.quit();
		
//		
//		// Click cancel button 
//		driver.findElement(By.xpath("//button[text() = 'Confirm Box']")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.dismiss();
//		driver.quit();
		
		
		
//		// Enter text
//		driver.findElement(By.xpath("//button[text() = 'Prompt Box']")).click();	
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.sendKeys("test");
//		Thread.sleep(2000);
//		String s = alert.getText();
//		System.out.println(s);
//		alert.accept();
//		Thread.sleep(2000);
//		driver.quit();
		
		
		
		
	


	}

}
