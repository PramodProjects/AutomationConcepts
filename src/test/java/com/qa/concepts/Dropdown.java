package com.qa.concepts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(new URL("http://127.0.0.1:9515"));

//		// Select value using index
//		WebElement element = driver.findElement(By.id("dropdown1"));
//		Select dropdown = new Select(element);
//		Thread.sleep(2000);
//		dropdown.selectByIndex(2);

//		// Select value using visible text
//		WebElement element = driver.findElement(By.id("dropdown1"));
//		Select dropdown = new Select(element);
//		Thread.sleep(2000);
//		dropdown.selectByVisibleText("Loadrunner");

//		// Select value using slectByValue
//		WebElement element = driver.findElement(By.id("dropdown1"));
//		Select dropdown = new Select(element);
//		dropdown.selectByValue("3");

		
		
		
		
		
//		// get total number of values and print and select
//		WebElement element = driver.findElement(By.id("dropdown1"));
//		Select dropdown = new Select(element);
//		List<WebElement> elements = dropdown.getOptions();
//		System.out.println(elements.size());
//		for (int i = 0; i < elements.size(); i++) {
//			String s = elements.get(i).getText();
//			System.out.println(s);
//			if (s.equals("Appium")) {
//				elements.get(i).click();
//			}
//		}
//
//		for (WebElement webElement : elements) {
//			String s = webElement.getText();
//			System.out.println(s);
//			if (s.equals("Appium")) {
//				webElement.click();
//			}
//
//		}
		
		
		
		
//		// use sendkey to select dropdown value 
//		Thread.sleep(2000);
//		driver.findElement(By.id("dropdown1")).sendKeys("Appium");
		
		
		
		// Deselect value
		WebElement element  = driver.findElement(By.xpath("(//select)[6]"));
		Select dropdown = new Select(element);
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Appium");
		dropdown.deselectByVisibleText("Appium");
		
		
		
	}

}
