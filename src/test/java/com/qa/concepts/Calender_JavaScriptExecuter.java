package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_JavaScriptExecuter {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		WebElement element = driver.findElement(By.id("datepicker"));
		String dateValue = "10/19/2021";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].value='" + dateValue + "'", element);
		//js.executeScript("arguments[0].value='10/20/2021'", element);
		
		js.executeScript("arguments[0].setAttribute('value', '"+dateValue+"')", element);

	}

}
