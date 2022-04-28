package com.qa.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("test");
		Thread.sleep(1000);
		List<WebElement> elements = driver.findElements(By.xpath(
				"//ul[@class = 'G43f7e']//li//descendant::div[contains (@class , 'wM6W7d')]//span"));

		//List<WebElement> elements = driver.findElements(By.xpath("//div[contains (@class ,'wM6W7d')]//span"));
		for (WebElement webElement : elements) {
			// Thread.sleep(1000);
			System.out.println(webElement.getText());
			String s = webElement.getText();
			if (s.equals("test match")) {
				webElement.click();
				break;
			}

		}

	}

}
