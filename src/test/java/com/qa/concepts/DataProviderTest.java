package com.qa.concepts;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
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
