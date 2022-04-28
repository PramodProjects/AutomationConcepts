package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");		
		WebElement element = driver.findElement(By.id("home"));
		
		// highlight element with backgroung color 
		highlightElement(driver, element);
		
		// Highlight border of element
		highlightBorder(driver, element);
		//driver.quit();

	}
	
	
	// highlight element with backgroung color
	public static void highlightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String elementColor = element.getCssValue("backgroundColor");
		String changeColor = "rgb(0,200,0)";
		for (int i = 0; i < 100; i++) {
			js.executeScript("arguments[0].style.backgroundColor = '"+changeColor+"'", element);
			js.executeScript("arguments[0].style.backgroundColor = '"+elementColor+"'", element);			
		}
		
		
	}
	
	
	// Highlight border of element
	public static void highlightBorder(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}

}
