package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
//		//switch to frame using index
//		Thread.sleep(2000);
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//body[contains(text() , 'I am inside a frame')]//button[text() = 'Click Me']"))
//				.click();
//		Thread.sleep(2000);
//		driver.quit();
		
		
		
//		// switch to nested frame using index and name
//		Thread.sleep(2000);
//		//driver.switchTo().frame(1).switchTo().frame("frame2");
//		driver.switchTo().frame(1);
//		driver.switchTo().frame("frame2");
//		driver.findElement(By.xpath("//body[contains(text(), 'I am inside a nested frame')]//button[text() = 'Click Me']")).click();
//		Thread.sleep(2000);
//		driver.quit();
//		
		
		
		
//		//count total number of frames and inside frames
//		Thread.sleep(2000);
//		int i = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(i);
//		driver.switchTo().frame(1);
//		int j = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(j);		
//		driver.quit();
		
		
		
//		// using default content and parent frame
//		Thread.sleep(2000);
//		int i = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(i);
//		driver.switchTo().frame(1);
//		int j = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(j);
//		driver.switchTo().frame("frame2");
//		int k = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(k);		
//		driver.switchTo().parentFrame();
//		int m = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(m);
//		driver.switchTo().defaultContent();
//		int n = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(n);
//		
//		
//		driver.quit();
		
	}

}
