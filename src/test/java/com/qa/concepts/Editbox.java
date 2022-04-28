package com.qa.concepts;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editbox {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.xpath("//img[@alt= 'Edit / Text Fields']")).click();
		driver.findElement(By.id("email")).sendKeys("tt@tt.com");
		driver.findElement(By.xpath("//input[@value = 'Append ']")).sendKeys("test");
		String text1 =driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(text1);
		
		// is displayed
		boolean bool = driver.findElement(By.xpath("//label[text() = 'Confirm that edit field is disabled']//following-sibling::input")).isDisplayed();
		System.out.println(bool);
		
		//is enabled
		boolean flag = driver.findElement(By.xpath("//input[@type = 'text' and @style = 'width:350px;background-color:LightGrey;']")).isEnabled();
		if(flag) {
			System.out.println("Enabled");
		}
		else
		{
			System.out.println("Disabled");
		}
		
		driver.quit();
		
		
	}

}
