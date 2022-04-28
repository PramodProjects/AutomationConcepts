package com.qa.concepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testt {

	
@Test(dataProvider = "testData")
public void loginTest(String name, String num) {
	
	
	
	System.out.println(name + num);
	
	
}

@DataProvider
public Object[][] testData(){
	Object[][] loginData = {{"test1", "111"}, {"test2", "222"}, {"test3", "333"}};
	return loginData;
	
}
		
		
	

}
