package com.qa.concepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
//import java.util.function.Function;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

//import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluetWait {

	public static void main(String[] args) throws InterruptedException {

//		// Logic 1
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		// get text  - using wait element 
//		driver.get("http://www.leafground.com/pages/appear.html");
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//			    .withTimeout(Duration.ofSeconds(20))
//			    .pollingEvery(Duration.ofSeconds(5))
//			    .ignoring(NoSuchElementException.class);
//
//			WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
//			{            
//				public WebElement apply(WebDriver driver) {
//			    return driver.findElement(By.xpath("//button[@id= 'btn']"));
//			}
//			});
//			
//		//WebElement element = driver.findElement(By.xpath("//button[@id= 'btn']"));
//		System.out.println(foo.getText());

		// Logic 2
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Loader.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("loader")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(ElementNotInteractableException.class);

		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text() = 'Close']")));
		element.click();

	}

}
