package com.qa.concepts;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadDocument {

	public static void main(String[] args) {

		
		// Chrome
		String location = System.getProperty("user.dir") + "\\downloads\\";
		HashMap preferences = new HashMap();
		preferences.put("download.default_directory", location);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("pdfbox")).sendKeys("testing");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.xpath("//a[@id = 'pdf-link-to-download']")).click();


		

	}

}
