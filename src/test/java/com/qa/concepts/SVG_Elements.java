package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVG_Elements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("test");;
//		driver.findElement(By.xpath("//*[name() = 'svg']//*[local-name() = 'g']//*[local-name() = 'path']")).click();;

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[@class = 'QCzoEc z1asCe MZy1Rb']//*[name() = 'svg']//*[local-name() = 'path']"));
		//driver.findElement(By.xpath("//*[name() = 'svg' and @class = 'gb_Te']")).click();
		actions.contextClick(element).perform();;
	}

}
