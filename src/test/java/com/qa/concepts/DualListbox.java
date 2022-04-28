package com.qa.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DualListbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/bootstrap-dual-list-box-demo.html");
		
		List<WebElement> firstList = driver.findElements(By.xpath("(//ul[@class = 'list-group'])[1]//li"));
		for (int i = 0; i < firstList.size(); i++) {
			String s = firstList.get(i).getText();
			System.out.println(s);
			if(s.equals("bootstrap-duallist")) {
				firstList.get(i).click();
			}
			
		}
		driver.findElement(By.xpath("//span[@class= 'glyphicon glyphicon-chevron-right']")).click();
		
		List<WebElement> secondList = driver.findElements(By.xpath("(//ul[@class = 'list-group'])[2]//li"));
		for (WebElement webElement : secondList) {
			String m = webElement.getText();
			if(m.equals("bootstrap-duallist")) {
				webElement.click();
				System.out.println("element moved to second listbox");
			}
		}
		driver.quit();
		
	}

}
