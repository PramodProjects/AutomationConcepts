package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_GetAllColumnValues {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		int rows = driver.findElements(By.xpath("//table[@id = 'table_id']//tr")).size();
		int columns = driver.findElements(By.xpath("//table[@id = 'table_id']//tr[2]//td")).size();
		System.out.println(rows);
		System.out.println(columns);
		String s=null;
		for (int i = 2; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				s = driver.findElement(By.xpath("//table[@id = 'table_id']//tr["+i+"]//td["+j+"]")).getText();
				//s = driver.findElement(By.xpath("//table[@id = 'table_id']//tr[2]//td[2]")).getText();
				System.out.print(s + " ||  ") ;
			}
			System.out.println();
			
		}
			
		

	}

}
