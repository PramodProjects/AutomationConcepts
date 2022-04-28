package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ExtraSpecialLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(new ByAll(By.name("name"), By.id("id"), By.className("className"))).click();
		driver.findElement(new ByIdOrName("idOrName")).click();
		driver.findElement(new ByChained(By.name("name"), By.id("id"), By.className("className"))).click();

	}

}
