package com.qa.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_GetAllColumnValues {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'table1']//tbody//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id = 'table1']//tbody//tr[1]//td"));

		for (int i = 1; i <= rows.size(); i++) {
			for (int j = 1; j <= columns.size(); j++) {
				String s = driver.findElement(By.xpath("//table[@id = 'table1']//tbody//tr[" + i + "]//td[" + j + "]"))
						.getText();
				System.out.print(s + " || ");

			}

			System.out.println();

		}

	}

}
