package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement element = driver.findElement(By.id("email"));		
		element.sendKeys("test");
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		try {
		element.sendKeys("test");
		}
		catch (StaleElementReferenceException ex)
		{
			element = driver.findElement(By.id("email"));	
			element.sendKeys("test");
		}
		

	}

}
