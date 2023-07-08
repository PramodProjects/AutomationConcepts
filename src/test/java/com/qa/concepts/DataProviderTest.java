package com.qa.concepts;


import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
	
	@Test(dataProvider = "testData")
	public void loginTest(String name, String num, String num2) {
		
		System.out.println(name + num + num2);
		
		
	}

	@DataProvider
	public Object[][] testData(){
		Object[][] loginData = {{"test1", "111", "123"}, {"test2", "222", "789"}, {"test3", "333", "908"}};
		return loginData;
		
	}

}
