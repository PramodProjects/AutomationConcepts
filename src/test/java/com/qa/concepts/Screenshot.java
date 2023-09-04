package com.qa.concepts;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException, HeadlessException, AWTException {

		// get screenshot of full page
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./test.jpg"));

		// get screenshot of section or element
		WebElement element = driver.findElement(By.xpath("//a[text() = 'Sign in']"));
		File src1 = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("./test1.jpg"));

		// Take screenshot of alert
		WebElement element1 = driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']"));
		// Trigger the alert
		element1.click();
		Thread.sleep(2000);
		BufferedImage image = new Robot()
				.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "jpg", new File("./alert.jpg"));

	}

}
