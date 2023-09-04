package com.qa.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();		
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@id = 'sortable']//li//span"));
		System.out.println(elements.size());
		Actions actions = new Actions(driver);
		actions.dragAndDrop(elements.get(4), elements.get(2)).build().perform();
	}

}
