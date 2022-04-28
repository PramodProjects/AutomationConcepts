package com.qa.concepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks_Streams {

	public static void main(String[] args)  throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		List<WebElement> listLinks = driver.findElements(By.tagName("a"));
		List<String> links = new ArrayList<String>();
		for (WebElement elements : listLinks) {
			String link = elements.getAttribute("href");
			links.add(link);			
		}
		
		
		links.parallelStream().forEach(e->{
			try {
				checkBrokenLink(e);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
			
		
	}
	
	
	public static void checkBrokenLink(String link) throws IOException   {
		
		URL url = new URL(link);
		HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
		urlConnection.connect();
		if(urlConnection.getResponseCode()>=400)
			System.out.println(link + " - is broken");
		else
			System.out.println(link + " - is working");
		
	}

}
