package com.qa.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVG_Graph {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://emicalculator.net/");
		List<WebElement> listElements = driver.findElements(By.xpath("//*[name() = 'svg']//*[local-name() = 'g' and @class = 'highcharts-series-group']//*[local-name() = 'rect']"));
		Actions actions = new Actions(driver);
		
		for (WebElement element : listElements) {
			actions.moveToElement(element).build().perform();
			Thread.sleep(500);
			String s = driver.findElement(By.xpath("//*[name() = 'svg']//*[local-name() = 'g' and @class = 'highcharts-label highcharts-tooltip highcharts-color-undefined']//*[local-name() = 'text']")).getText();
			System.out.println(s);			
		}

	}

}
