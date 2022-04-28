package com.qa.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
//		// get text  - using wait element 
//		driver.get("http://www.leafground.com/pages/appear.html");
//		WebElement element = driver.findElement(By.xpath("//button[@id= 'btn']"));
//		ewElementToBeClickable(driver, element);
//		System.out.println(element.getText());
		
		
		// Click - using wait locator
		driver.get("http://www.leafground.com/pages/TextChange.html");
		By locator= By.xpath("//button[text() = 'Click ME!']");	
		ewVisibilityOfElementLocated(driver, locator);
		driver.findElement(By.xpath("//button[text() = 'Click ME!']")).click();
		Alert alert = driver.switchTo().alert();
		String s = alert.getText();
		System.out.println(s);
		driver.quit();

		
		
		
//		// Wait for alert appears
//		driver.get("http://www.leafground.com/pages/alertappear.html");
//		driver.findElement(By.id("alert")).click();
//		ewAlertIsPresent(driver);
//		Alert alert = driver.switchTo().alert();		
//		String s = alert.getText();
//		System.out.println(s);
		
		
		
		
		
//		//Get text of element after disapper another element
//		driver.get("http://www.leafground.com/pages/disapper.html");		
//		//ewElementToBeClickable(driver, driver.findElement(By.xpath("//strong[contains(text() , 'I know you can do it! Button is disappeared!')]")));
//		WebElement element = driver.findElement(By.xpath("//button[@id = 'btn']"));
//		//By locator = By.xpath("//button[@id = 'btn']");
//		ewInvisibilityOf(driver, element);
//		String s = driver.findElement(By.xpath("//strong[contains(text() , 'I know you can do it! Button is disappeared!')]")).getText();
//		System.out.println(s);
//		
		
		

	}
	
	
	public static void ewElementToBeClickable(WebDriver driver, WebElement element) {
		new WebDriverWait(driver, 20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
			
	}
	
	
	public static void ewVisibilityOfElementLocated(WebDriver driver, By locator) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public static void ewAlertIsPresent(WebDriver driver) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.alertIsPresent());
	}
	
	public static void ewInvisibilityOf(WebDriver driver, WebElement element) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOf(element));
	}
	

}
