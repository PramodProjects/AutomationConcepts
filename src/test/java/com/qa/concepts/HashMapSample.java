package com.qa.concepts;

import java.util.HashMap;

public class HashMapSample {

	public static void main(String[] args) {
		String expected = "JAN";
		String actual = months().get("January");
		System.out.println(actual);
		if(expected.equals(actual)) {
			System.out.println("matched");
		}
		else {
			System.out.println("not matched");
		}

	}
	
	public static HashMap<String, String> months() {
		HashMap<String, String> month = new HashMap<String, String>();
		month.put("January", "JAN");
		month.put("February", "FEB");
		return month;
		
	}

}
