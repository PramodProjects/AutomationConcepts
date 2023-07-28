package com.qa.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFile_Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",  "./drivers\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/pdf");
		//profile.setPreference("browser.download.manager.showWhenStarting",false);	
		profile.setPreference("pdfjs.disabled",true);
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);	
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://the-internet.herokuapp.com/download");		
		driver.findElement(By.linkText("some-file.txt")).click();
		
		
//	
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("browser.download.dir", "C:\\Users\\7504996\\OneDrive - TeleTech Holdings, Inc\\Projects\\Automation\\AutomationConcepts\\documents");
//		profile.setPreference("browser.download.folderList",2);
//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
//		profile.setPreference("browser.download.manager.showWhenStarting", false);
//		profile.setPreference("browser.helperApps.neverAsk.openFile",true);
//		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
//		profile.setPreference("browser.download.manager.useWindow", false);
//		profile.setPreference("browser.download.manager.focusWhenStarting", false);
//		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
//		profile.setPreference("browser.download.manager.closeWhenDone", true);
//		FirefoxOptions options = new FirefoxOptions();
//		options.setProfile(profile);
//		WebDriver driver = new FirefoxDriver(options);
		

		
		
		

	}

}
