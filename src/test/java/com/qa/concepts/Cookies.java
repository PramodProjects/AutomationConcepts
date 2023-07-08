package com.qa.concepts;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		// Capture cookies from browser
		Set<Cookie> cookies = driver.manage().getCookies();
		
		// Size of cookies
		System.out.println(cookies.size());
		
		// Print cookies from browser
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getDomain() + " : " + cookie.getValue());			
		}
		
		// Add cookies to the browser
		Cookie cookieObj = new  Cookie("prcookie", "12345");
		driver.manage().addCookie(cookieObj);
		
		cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		
		// Delete specific coockie by object
		driver.manage().deleteCookie(cookieObj);
		
		cookies = driver.manage().getCookies();
		
		cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		
		// Delete specific cookie by name
		driver.manage().deleteCookieNamed("prcookie");
		
		cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		
		// Delete all cookies
		driver.manage().deleteAllCookies();
		
		cookies = driver.manage().getCookies();
		System.out.println(cookies.size());

	}

}
