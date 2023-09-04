package com.qa.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_PrintRowAndColumnNumberOfValue {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rows = driver.findElements(By.xpath("//table[@id = 'customers']//tr")).size();
		int columns = driver.findElements(By.xpath("(//table[@id = 'customers']//tr)[1]//th")).size();
		for (int i = 2; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				String str = driver.findElement(By.xpath("(//table[@id = 'customers']//tr)["+i+"]//td["+j+"]")).getText();
				if(str.equals("Roland Mendel")) {
					System.out.println(str) ;
					System.out.println("Row Number = " + (i-1));
					System.out.println("Column Number = " + j);
					break;
				}
				
			}
			
		}

	}

}