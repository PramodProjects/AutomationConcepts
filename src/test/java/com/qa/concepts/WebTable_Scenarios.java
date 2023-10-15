package com.qa.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_Scenarios {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Get column count
		List<WebElement> headerElements = driver.findElements(By.xpath("//table[@id = 'customers']//th"));
		System.out.println("Column count - " + headerElements.size());

		// Get header names
		System.out.println("Header names========");
		for (WebElement element : headerElements) {
			System.out.println(element.getText());
		}

		// Verify column name present in header
		System.out.println("Verify column name present in header========");
		for (WebElement element : headerElements) {
			String columnName = element.getText();
			if (columnName.equals("Country")) {
				System.out.println("Column name present");
			}

		}

		// Get all row count
		List<WebElement> rowElements = driver.findElements(By.xpath("//table[@id = 'customers']//tr"));
		System.out.println("Row count - " + rowElements.size());

		// Get 2nd row values
		List<WebElement> specificRowElements = driver.findElements(By.xpath("//table[@id = 'customers']//tr[2]//td"));
		System.out.println("Print specific row values========");
		for (WebElement element : specificRowElements) {
			String columnName = element.getText();
			System.out.println(columnName);
		}

		// Print values of row based on cell value
		List<WebElement> olaRowElements = driver
				.findElements(By.xpath("//table[@id = 'customers']//td[text() = 'Ola']//parent::tr//td"));
		System.out.println("Row values based on cell value========");
		for (WebElement element : olaRowElements) {
			String cellName = element.getText();
			System.out.println(cellName);
		}

		// Print all cell values in the table
		List<WebElement> cellElements = driver.findElements(By.xpath("//table[@id = 'customers']//td"));
		System.out.println("All cell values========");
		for (WebElement element : cellElements) {
			String columnName = element.getText();
			System.out.println(columnName);
		}

		// Print specific column values
		List<WebElement> countryElements = driver.findElements(By.xpath("//table[@id = 'customers']//td[4]"));
		System.out.println("Specific column values========");
		for (WebElement element : countryElements) {
			String columnName = element.getText();
			System.out.println(columnName);
		}

		// Select check box based on value
		System.out.println("Select check box before Ola========");
		WebElement checkBox = driver
				.findElement(By.xpath("//table[@id = 'customers']//td[text() = 'Ola']//preceding-sibling::td//input"));
		checkBox.click();

		// Click link based on value
		System.out.println("Click link after Ola========");
		WebElement link = driver
				.findElement(By.xpath("//table[@id = 'customers']//td[text() = 'Ola']//following-sibling::td[3]//a"));
		link.click();

	}

}
