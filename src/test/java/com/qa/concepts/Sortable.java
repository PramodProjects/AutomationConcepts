package com.qa.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@id= 'sortable']//li"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(elements.get(5), elements.get(2)).build().perform();

	}

}
