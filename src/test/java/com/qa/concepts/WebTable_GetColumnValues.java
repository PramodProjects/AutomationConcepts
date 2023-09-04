package com.qa.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_GetColumnValues {

	public static void main(String[] args) throws InterruptedException {
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
		driver.get("http://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'table1']//tbody//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id = 'table1']//tr//th"));

		for (int i = 0; i < columns.size(); i++) {

			String email = columns.get(i).getText();
			if (email.equals("Email")) {
				int j = i+1;
				for (int k = 1; k <= rows.size(); k++) {
					String emails = driver
							.findElement(By.xpath("//table[@id = 'table1']//tr[" + k + "]//td[" + j + "]")).getText();
					System.out.println(emails);

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
