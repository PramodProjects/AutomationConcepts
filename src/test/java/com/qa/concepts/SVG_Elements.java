package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVG_Elements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("test");;
		driver.findElement(By.xpath("//*[name() = 'svg']//*[local-name() = 'g']//*[local-name() = 'path']")).click();;

	}

}
