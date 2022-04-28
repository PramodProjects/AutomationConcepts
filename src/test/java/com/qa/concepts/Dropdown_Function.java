package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Function {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement element1 = driver.findElement(By.xpath("//select[@id = 'dropdown1']"));
		WebElement element2 = driver.findElement(By.xpath("//select[@name = 'dropdown2']"));
		// Select select = new Select(element1);
		// select.selectByVisibleText("Selenium");
		// dropdown(element1, "Selenium");
		dropdown(element1, "Selenium", DropdownEnum.BYVISIBLE.toString());

	}

	public static void dropdown(WebElement element, String value, String type) {
		Select select = new Select(element);
		switch (type) {
		case "byVisible":
			select.selectByVisibleText(value);
			break;
		case "byValue":
			select.selectByValue(value);
			break;
		case "byIndex":
			select.selectByIndex(Integer.parseInt(value));
			break;

		default:
			System.out.println("enter proper value");
			break;

		}

	}
	
	
	public enum DropdownEnum {
		INDEX{
			public String toString() {
				return "index";
			}
		},
		
		BYVALUE{
			public String toString() {
				return "byValue";
			}
			
		},
		BYVISIBLE{
			public String toString() {
				return "byVisible";
			}
			
		}
		
	}

}



