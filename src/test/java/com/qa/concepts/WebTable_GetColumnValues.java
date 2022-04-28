package com.qa.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_GetColumnValues {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://cosmocode.io/automation-practice-webtable/");
//		// driver.findElement(By.xpath("//strong[text() =
//		// 'Afghanistan']//parent::td//preceding-sibling::td//input[@type =
//		// 'checkbox']")).click();
//		List<WebElement> listRows = driver.findElements(By.xpath("//table[@id = 'countries']//tr"));
//		System.out.println(listRows.size());
//		for (int i = 0; i < listRows.size(); i++) {
//			int j = i + 1;
//			// WebElement row = listRows.get(i);
//			String columnValues = driver.findElement(By.xpath("//table[@id = 'countries']//tr[" + j + "]//td[2]"))
//					.getText();
//			System.out.println(columnValues);
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://cosmocode.io/automation-practice-webtable/");
		// driver.findElement(By.xpath("//strong[text() =
		// 'Afghanistan']//parent::td//preceding-sibling::td//input[@type =
		// 'checkbox']")).click();
		List<WebElement> listRows = driver.findElements(By.xpath("//table[@id = 'countries']//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id = 'countries']//tr[1]//td"));
		for (int i = 0; i < columns.size(); i++) {
			String columnName = columns.get(i).getText();
			if (columnName.equals("Country")) {
				int j = i+1;
				for (int k = 0; k < listRows.size(); k++) {
					int m= k+1;
					String columnValue =driver.findElement(By.xpath("//table[@id = 'countries']//tr["+m +"]//td["+j+"]")).getText();
					System.out.println(columnValue);
					
				}
				break;
				
			}
			
		}
		
//		List<WebElement> elements = driver.findElements(By.xpath("//table[@id = 'countries']//td[2]"));
//		for (WebElement webElement : elements) {
//			System.out.println(webElement.getText());
//		}
//		
		

	}

}
