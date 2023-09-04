package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//input[@type = 'email']"));
		element.sendKeys("test");
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		try {
			element.sendKeys("test");
		} catch (StaleElementReferenceException ex) {
			element = driver.findElement(By.xpath("//input[@type = 'email']"));
			element.sendKeys("test");
		}

	}

}
