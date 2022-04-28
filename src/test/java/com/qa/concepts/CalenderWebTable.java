package com.qa.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Calendar.html");
		driver.findElement(By.id("datepicker")).click();
		
		/*
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//tbody//tr"));
		boolean flag = false;
		for (int i = 1; i <= rows.size(); i++) {
			int columnSize = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//tbody//tr["+i+"]//td//a[contains(@class , 'ui-state-default')]")).size();
			for (int j = 1; j <= columnSize; j++) {
				String  s = driver.findElement(By.xpath("//table[@class = 'ui-datepicker-calendar']//tbody//tr["+i+"]//td[@data-handler = 'selectDay']["+j+"]//a[contains(@class , 'ui-state-default')]")).getText();
				System.out.println(s);
				if (s.equals("7")) {
					driver.findElement(By.xpath("//table[@class = 'ui-datepicker-calendar']//tbody//tr["+i+"]//td[@data-handler = 'selectDay']["+j+"]//a[contains(@class , 'ui-state-default')]")).click();
					flag =true;
					break;
				}
			}
			if(flag) {
				break;
			}
			
		}
		
		
		*/
		
		List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@class, 'ui-state-default')]"));
		System.out.println(elements.size());
		for (WebElement webElement : elements) {
			System.out.println(webElement.getText());
			if(webElement.getText().equals("6")) {
				webElement.click();
				break;
			}
			
			
		}
		driver.quit();
		
		

	}

}
