package com.qa.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.leafground.com/pages/TextChange.html");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);					
		driver.findElement(By.xpath("//button[text() = 'Click ME!']")).click();
		Alert alert = driver.switchTo().alert();
		String s = alert.getText();
		System.out.println(s);
		driver.quit();


	
		
	}

}
