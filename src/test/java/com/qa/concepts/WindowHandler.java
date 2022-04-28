package com.qa.concepts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		
//		// get window ids and count
//		driver.findElement(By.xpath("//button[text() = 'Open Multiple Windows']")).click();
//		Thread.sleep(2000);
//		Set<String> windows = driver.getWindowHandles();
//		System.out.println(windows.size());
//		Iterator<String> iterator = windows.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());	
//
//		}
//		driver.quit();
		
		
		
		
		//Click on button on new window
		driver.findElement(By.xpath("//button[text() = 'Open Multiple Windows']")).click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		String windowId1 = iterator.next();
		String windowId2 = iterator.next();
		String windowId3 =iterator.next();
		System.out.println(windowId2);		
		driver.switchTo().window(windowId2);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@id = 'home']")).click();
		driver.findElement(By.xpath("//a[text() = 'Verify am I broken?']")).click();
		Thread.sleep(2000);
	
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[contains(text() , 'Do not close me')]")).click();
		driver.findElement(By.xpath("(//a[text() = 'Go to Home Page'])[1]")).click();
		//driver.quit();
		

	}

	

}
