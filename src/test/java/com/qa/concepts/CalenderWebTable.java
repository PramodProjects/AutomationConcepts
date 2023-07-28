package com.qa.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderWebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Logic 1
		driver.findElement(By.id("datepicker2")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class = 'datepick-month']//tbody//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//div[@class = 'datepick-month']//tbody//tr[1]//td"));
		boolean flag = false;
		for (int i = 1; i <= rows.size(); i++) {
			for (int j = 1; j <= columns.size(); j++) {
				WebElement element = driver
						.findElement(By.xpath("//div[@class = 'datepick-month']//tbody//tr[" + i + "]//td[" + j + "]"));
				String date = element.getText();
				System.out.println(date);
				if (date.equals("17")) {
					element.click();
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}

		// Logic 2
		List<WebElement> elements = driver.findElements(By.xpath("//td//a[starts-with(@class, 'dp16')]"));
		for (WebElement webElement : elements) {
			String date = webElement.getText();
			if (date.equals("19")) {
				webElement.click();
				break;
			}

		}
		driver.quit();

	}

}
