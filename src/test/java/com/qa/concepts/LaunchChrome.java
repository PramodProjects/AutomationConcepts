package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LaunchChrome {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://google.com");
//		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
//		driver.findElement(By.name("q")).sendKeys("test");
		

		// Open link in new tab
		String tab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.xpath("//a[text() = 'Sign in']")).sendKeys(tab);
		
	}

}
