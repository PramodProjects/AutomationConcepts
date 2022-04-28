package com.qa.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindandPrintLinks {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://community.ebay.com/t5/Archive-Payments/half-ebay-com/td-p/22703751");
//		List listElements= driver.findElements(By.tagName("a"));
//		System.out.println(listElements.size()); 
//		
//		for (int i = 0; i < listElements.size(); i++) {
//			WebElement element= (WebElement)listElements.get(i);
//			System.out.println(element.getText()); ;
//			
//		}
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://community.ebay.com/t5/Archive-Payments/half-ebay-com/td-p/22703751");
		List<WebElement> listElements= driver.findElements(By.tagName("a"));
		System.out.println(listElements.size());
		for (WebElement webElement : listElements) {
			System.out.println(webElement.getText());
			System.out.println(webElement.getAttribute("href"));
		}
		
		
		
		}

}
