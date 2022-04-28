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

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'table_id']//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id = 'table_id']//tr//th"));
		
		// Get the count of number of columns
		System.out.println(columns.size());
		
		// Get the count of number of rows
		System.out.println(rows.size());
		
		// Get the progress value of 'Learn to interact with Elements'
		List<WebElement> elements = driver.findElements(By.xpath("//table[@id = 'table_id']//tr//td"));
		String cValue = "Learn to interact with Elements";
		for (WebElement webElement : elements) {
			if(webElement.getText().equals(cValue)){
				String s = driver.findElement(By.xpath("//table[@id = 'table_id']//tr//td[text() = '"+cValue+"']//following-sibling::td[1]")).getText();
				System.out.println(s);
			}
		}
		
		// Check the vital task for the least completed progress.
        List<WebElement> elementsColumn = driver.findElements(By.xpath("//table[@id = 'table_id']//td[2]"));
        List<Integer> listInteger = new ArrayList<Integer>();
		for (WebElement webElement : elementsColumn) {
			String m =webElement.getText();
			
			Integer num  = Integer.valueOf(m.split("%")[0]);			
			listInteger.add(num);		
			
		}
		Collections.sort(listInteger);
		System.out.println(listInteger);
		System.out.println(listInteger.get(0));
		String n = listInteger.get(0).toString().concat("%");
		System.out.println(n);
		driver.findElement(By.xpath("//table[@id = 'table_id']//td[text() = '"+n+"']//following-sibling::td[1]//input")).click();
		//driver.findElement(By.xpath("//table[@id = 'table_id']//td[text() = '30%']//following-sibling::td[1]//input")).click();


	}

}
