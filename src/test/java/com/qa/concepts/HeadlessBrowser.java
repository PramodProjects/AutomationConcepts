package com.qa.concepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessBrowser {

	public static void main(String[] args) throws IOException {
		
//		// Headless browser using Chrome browser
//		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.setHeadless(true);		
//		WebDriver driver = new ChromeDriver(options);
//		driver.get("https://www.google.com/");		
//		String s = driver.getTitle();
//		System.out.println(s);
		
		
		
		
		
//		// Headless browser using Firefox
//		System.setProperty("webdriver.gecko.driver", "./drivers\\geckodriver.exe");
//		FirefoxOptions options = new FirefoxOptions();
//		options.setHeadless(true);
//		WebDriver driver = new FirefoxDriver(options);
//		driver.get("https://www.google.com/");		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File ("./test.jpg"));		
//		String s = driver.getTitle();
//     	System.out.println(s);
		
		
		
//		// HEadless browser using HTMLUnit driver (capture screenshot is not working for HTMLUnitDriver)
//		HtmlUnitDriver driver = new HtmlUnitDriver();
//		driver.get("https://www.google.com/");	
//		String s = driver.getTitle();
//     	System.out.println(s);
		
		
		
		// Using PhantomJS
		System.setProperty("phantomjs.binary.path", "./drivers\\PhantomJS.exe");
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://www.google.com/");		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("./test.jpg"));		
		String s = driver.getTitle();
     	System.out.println(s);
		
	

	}

}
