package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ColorPositionHieght {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		WebElement element = driver.findElement(By.id("color"));

		// Find position of button (x,y)
		Point location = element.getLocation();
		System.out.println(location);
		int x = element.getLocation().getX();
		System.out.println(x);
		int y = element.getLocation().getY();
		System.out.println(y);
		int a = element.getRect().getX();
		System.out.println(a);
		int b = element.getRect().getY();
		System.out.println(y);

		// Find size hieght width
		Dimension dimension = element.getSize();
		System.out.println(dimension);
		int i = element.getSize().getHeight();
		System.out.println(i);
		int j = element.getSize().getWidth();
		System.out.println(j);
		int m = element.getRect().getHeight();
		System.out.println(m);
		int n = element.getRect().getWidth();
		System.out.println(n);

		// get background color code
		String color = element.getCssValue("background-color");
		String elementColor = Color.fromString(color).asHex();
		System.out.println(elementColor);

		// get text color code
		String clr = element.getCssValue("color");
		String elementClr = Color.fromString(clr).asHex();
		System.out.println(elementClr);

		// get text font type
		String clrType = element.getCssValue("font-family");
		System.out.println(clrType);
		
		// get text font size
		String clrSize = element.getCssValue("font-size");
		System.out.println(clrSize);
		
		// get text font bold
		String clrBold = element.getCssValue("font-weight");
		System.out.println(clrBold);

		driver.quit();

	}

}
