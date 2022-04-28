package com.qa.concepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks_Sequential {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for (WebElement element : elements) {
			String link = element.getAttribute("href");
			URL url = new URL(link);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.connect();
			int responseCode = connection.getResponseCode();
			String responseMessage = connection.getResponseMessage();
//			System.out.println(responseCode);
//			System.out.println(responseMessage);
			if(responseCode>=400) {
				System.out.println("Broken link - " + link);
			}
			else {
				System.out.println("Working link - " + link);
			}
			
		}

	}

}
