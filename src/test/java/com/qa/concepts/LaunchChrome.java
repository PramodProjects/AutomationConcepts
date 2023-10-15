package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LaunchChrome {
	public static void main(String[] args) {
		
		// Logic 1
//		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://google.com");

		// Logic 2
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://google.com");
		
		// Logic 3
//		WebDriver driver = WebDriverManager.chromedriver().create();
//		driver.get("http://google.com");
		
		// Logic 4 - using inbuilt Selenium Driver
		WebDriver driver = new ChromeDriver();
		
		
		// Open link in new tab
		String tab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.xpath("//a[text() = 'Sign in']")).sendKeys(tab);
		
	}

}
