package com.qa.concepts;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PDFReading {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		URL url = new URL("file:///C:/Users/7504996/Downloads/sommaire-maladies-graves-parachute-2.pdf");
		InputStream is = url.openStream();
		BufferedInputStream fileParse = new BufferedInputStream(is);
		PDDocument doc = PDDocument.load(fileParse);
		String pdfContent = new PDFTextStripper().getText(doc);
		System.out.println(pdfContent);

	}

}
