package com.qa.concepts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile_Chrome {

	public static void main(String[] args) {

		
		// Chrome
		String location = System.getProperty("user.dir") + "\\downloads\\New folder (5)";
		Map<String, Object> preferences = new HashMap<String, Object>();
		preferences.put("profile.default_content_settings.popups", 0);
		preferences.put("download.default_directory", location);
		

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		driver.get("http://the-internet.herokuapp.com/download");		
		driver.findElement(By.linkText("some-file.txt")).click();


		

	}

}
