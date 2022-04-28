package com.qa.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchEdge {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.edge.driver", "./drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://google.com");
		

	}

}
