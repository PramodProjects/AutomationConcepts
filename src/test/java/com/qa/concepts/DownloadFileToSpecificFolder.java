package com.qa.concepts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;

public class DownloadFileToSpecificFolder {

	public static void main(String[] args) throws InterruptedException {
		File folder = new File("C:\\Users\\Pramod\\Downloads\\New folder (5)");
		folder.mkdir();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.dir", folder.getAbsolutePath());
		System.out.println(folder.getAbsolutePath());
		/*
		 * When set to 0, Firefox saves all downloaded files to the user's desktop. When
		 * set to 1, these downloads go to the Downloads folder. When set to 2, go to
		 * the location specified.
		 */
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"image/jpeg, application/pdf, application/octet-stream, text/plain");
		profile.setPreference("pdfjs.disabled", true);
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		System.setProperty("webdriver.gecko.driver", "./drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("some-file.txt")).click();
		Thread.sleep(2000);
		File listOfFiles[] = folder.listFiles();
		// make sure the directory is not empty
		Assert.assertTrue(listOfFiles.length > 0);

		for (File file : listOfFiles) {
			// make sure that downloaded file is not empty
			if (file.length() > 0) {
				System.out.println(file.getName() + " is not empty");
			} else {
				System.out.println(file.getName() + " is empty");
			}

		}

	}

}
