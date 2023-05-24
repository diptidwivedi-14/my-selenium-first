package com.org.automation.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static void takeScreenshots(WebDriver driver, String filePath) {
		
		System.setProperty("webDreiver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		
		//Take the ScreenShot
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
															//Copy the file to a location and use try catch block to handle exception
		
		try {
			FileUtils.copyFile(screenshot, new File(filePath));
			
		} catch (IOException e) {
			System.out.println(e.getMessage());	
		}
		
		//closing the webdriver
		//driver.close();
		
	

	}

}
