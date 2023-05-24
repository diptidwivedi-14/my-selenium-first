package com.org.navigate.google;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTakeScreenshot {

	public static void main(String[] args) {
		
		

		System.setProperty("webDreiver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		

		
		WebDriver driver = new ChromeDriver();


		driver.get("https://demoqa.com/");
		
		//driver.manage().window().maximize();
		
	//Take the ScreenShot
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//Copy the file to a location and use try catch block to handle exception
		
		try {
			FileUtils.copyFile(screenshot, new File("C:\\Test\\homepage1.png"));
			
			FileUtils.copyFile(screenshot, new File("C:\\Test\\homepage1.JPEG"));
			
			FileUtils.copyFile(screenshot, new File("C:\\Test\\homepage1.bmp"));
			
			

			

		}
		catch (IOException e) {
			System.out.println(e.getMessage());	
		}
		
		//closing the webdriver
		driver.close();
		
	

	}

}
