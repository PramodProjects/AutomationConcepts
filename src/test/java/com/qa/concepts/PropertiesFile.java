package com.qa.concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		
		// get property
		Properties prop =new Properties();
		FileInputStream fis = new FileInputStream("./documents\\config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		
//		// set property
//		Properties prop = new Properties();
//		prop.setProperty("123", "pramod");
//		FileOutputStream fos = new FileOutputStream("./documents\\write.properties");
//		prop.store(fos, "added coments");
		
		
		
		
		
		
		
		

	}

}
