package com.qa.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSort {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement element = driver.findElement(By.id("dropdown1"));
		Select dropdown = new Select(element);
		List<WebElement> elements = dropdown.getOptions();
		System.out.println(elements.size());
		
		List<String> beforeSort = new ArrayList<String>();
		
		for (WebElement webElement : elements) {
			beforeSort.add(webElement.getText());
		}
		System.out.println(beforeSort);
		
		List<String> afterSort = new ArrayList<String>();
		afterSort.addAll(beforeSort);
		Collections.sort(afterSort);
		System.out.println(afterSort);
		
		if(beforeSort.equals(afterSort)) {
			System.out.println("Dropdown values are sorted");
		}
		else
		{
			System.out.println("Dropdown vlaues are not sorted");
		}
		
		// reverse order		
		Collections.reverse(beforeSort);
		System.out.println(beforeSort);
		driver.quit();
		
		

	}

}
