package com.qa.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownBootstrap {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");

		driver.findElement(By.id("btndropdown")).click();

		List<WebElement> elements = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		for (WebElement webElement : elements) {
			String s = webElement.getAttribute("value");
			if (s.equals("HTML") && !webElement.isSelected()) {
				webElement.click();
				break;
			}
		}
	}

}
