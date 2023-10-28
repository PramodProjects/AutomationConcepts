
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
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Testt {

	

// test local1
	@Test(dataProvider = "data")
	public void Test2(String a, String b, String c) {
// test method2
	System.out.println(a + " " + b + " " + c);
	}

	@DataProvider
	public String[][] data(){
		String[][] datavalues = {{"test1", "111", "123"}, {"test2", "222", "789"}, {"test3", "333", "908"}};
		return datavalues;

		// test method3
		}



		
		
	


	// test local3


}
