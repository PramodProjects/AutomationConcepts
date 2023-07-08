package com.qa.concepts;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertions {

	public static void main(String[] args) {
//		Assert.assertEquals(true, false);
//		System.out.println("assert1");
//		Assert.assertEquals(true, false);
//		System.out.println("assert2");
		
		
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertEquals(true, false);
		System.out.println("assert1");
		sAssert.assertEquals(true, false);
		System.out.println("assert2");
		sAssert.assertEquals(true, false);
		System.out.println("assert3");
		sAssert.assertAll();
	

	}

}
