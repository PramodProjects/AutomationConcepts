package com.qa.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperations {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html");

//		// Mouse hover
//		WebElement element = driver.findElement(By.xpath("//a[text() = 'TestLeaf Courses']"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).build().perform();
//		Thread.sleep(2000);
//		List<WebElement> elements = driver.findElements(By.xpath("//a[@class = 'listener']"));
//		
//		for (WebElement webElement : elements) {
//			System.out.println(webElement.getText());
//		}
//		driver.findElement(By.xpath("//a[text() = 'Selenium']")).click();
//		
//		
//		Thread.sleep(2000);
//		driver.quit();

		
		
		
//		// drag and drop
//		driver.get("http://www.leafground.com/pages/drop.html");
//		Actions actions = new Actions(driver);
//		WebElement element1 = driver.findElement(By.xpath("//p[text() = 'Drag me to my target']"));
//		WebElement element2 = driver.findElement(By.xpath("//div[@id = 'droppable']"));
//		Thread.sleep(2000);
//		//actions.clickAndHold(element1).dragAndDrop(element1, element2).build().perform();		
//		//actions.clickAndHold(element1).moveToElement(element2).release().build().perform();
//		actions.dragAndDrop(element1, element2).build().perform();		
//		Thread.sleep(2000);
//		driver.quit();

		
		
		
//		//Drag element around
//		driver.get("http://www.leafground.com/pages/drag.html");
//		Actions actions = new Actions(driver);
//		WebElement element = driver.findElement(By.xpath("//div[@id = 'draggable']"));
//		Thread.sleep(2000);
//		//actions.clickAndHold(element).moveToElement(element, 296, 128).build().perform();
//		//actions.dragAndDropBy(element, 296, 128).build().perform();
//		actions.clickAndHold(element).moveByOffset(294, 128).build().perform();

		
		
//		//right click
//		driver.get("http://www.leafground.com/pages/drag.html");
//		Actions actions = new Actions(driver);
//		WebElement element = driver.findElement(By.xpath("//div[@id = 'draggable']"));
//		Thread.sleep(2000);
//		actions.contextClick(element).build().perform();

		
		
//		// double click
//		driver.get("http://www.leafground.com/pages/drag.html");
//		Actions actions = new Actions(driver);
//		WebElement element = driver.findElement(By.xpath("//div[@id = 'draggable']"));
//		Thread.sleep(2000);
//		actions.doubleClick(element).build().perform();

		
		
		
//		// Slider
//		driver.get("https://jqueryui.com/slider/");
//		driver.switchTo().frame(0);
//		WebElement element = driver.findElement(By.id("slider"));
//		Actions actions = new Actions(driver);
//		actions.dragAndDropBy(element, 300, 0).build().perform();

		
		
		
//		// Resizable
//		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/resizable/");
//		driver.switchTo().frame(0);
//		WebElement element = driver.findElement(By.xpath("//div[@id = 'resizable']//div[3]"));
//		Actions actions = new Actions(driver);
//		Thread.sleep(2000);
//		actions.dragAndDropBy(element, 50, 50).build().perform();
//		Thread.sleep(2000);

//		// driver.quit();

	}

}
