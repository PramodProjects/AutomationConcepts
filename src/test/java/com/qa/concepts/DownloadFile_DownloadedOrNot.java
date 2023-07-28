package com.qa.concepts;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile_DownloadedOrNot {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("some-file.txt")).click();
		String filePath = "C:\\Users\\Pramod\\Downloads\\some-file.txt";
		Thread.sleep(3000);
		File file = new File(filePath);
		if(file.exists()) {
			System.out.println("file downloaded");			
		}
		else {
			System.out.println("file not downloaded");
		}
		
		
		

	}

}
