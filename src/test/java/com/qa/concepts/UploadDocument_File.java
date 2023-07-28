package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadDocument_File {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//input[@name = 'filename' and @type = 'file']"));
		//element.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String s = "C:\\Users\\7504996\\OneDrive - TeleTech Holdings, Inc\\Projects\\Automation\\AutomationConcepts\\documents\\test1.pdf";
		//js.executeScript("arguments[0].value='" + s + "'", element);
		js.executeScript("arguments[0].setAttribute('value', '" + s +"')", element);
		//js.executeScript("arguments[0].click();", element);
		
		Thread.sleep(2000);
		//driver.quit();
		

	}

}
