package com.qa.concepts;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		
		
//		// Enter value in textbox
//		driver.get("http://www.leafground.com/pages/Edit.html");
//		WebElement element = driver.findElement(By.id("email"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value='pramod@gmail.com'", element);		
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].setAttribute('value', 'temp@gmail.com')", element);
		
		
		
//		//Click Element
//		driver.get("http://www.leafground.com/pages/Button.html");
//		WebElement element = driver.findElement(By.id("home"));	
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", element);
		
		
		
//		// Refresh browser
//		driver.get("http://www.leafground.com/pages/Button.html");
//		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("history.go(0)");
		
		
		
//		// Get page title
//		driver.get("http://www.leafground.com/pages/Button.html");
//		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String s = js.executeScript("return document.title;").toString();
//		System.out.println(s);
		
		
		
//		// Get Inner text of page
//		driver.get("http://www.leafground.com/pages/Button.html");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String m = js.executeScript("return document.documentElement.innerText;").toString();
//		System.out.println(m);
		
		
		
//		// Scroll down  until bottom of page and again top of the page
//		driver.get("https://en.wikipedia.org/wiki/Wikipedia:Contents");
//		Thread.sleep(3000);		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(3000);		
//		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		
		
		
//		// Scroll down until element visible
//		driver.get("https://en.wikipedia.org/wiki/Wikipedia:Contents");
//		Thread.sleep(3000);	
//		WebElement element = driver.findElement(By.xpath("(//a[text() = 'Technology'])[2]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		
//		// Scroll up
//		driver.get("https://en.wikipedia.org/wiki/Wikipedia:Contents");
//		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		// Scroll down
//		js.executeScript("window.scrollBy(0, 700)");
//		Thread.sleep(3000);
//		// Scroll Up
//		js.executeScript("window.scrollBy(0,-700)");
		
		
		
		
//		//If you want to scroll horizontally in the right direction, use the following JavaScript. 
//		((JavascriptExecutor)driver).executeScript(“window.scrollBy(2000,0)”);

		
		
//		//If you want to scroll horizontally in the left direction, use the following JavaScript.
//		((JavascriptExecutor)driver).executeScript(“window.scrollBy(-2000,0)”);
		
		
		
		
		// Scroll down using window keys
		driver.get("https://en.wikipedia.org/wiki/Wikipedia:Contents");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_UP);
		
		

	}

}
