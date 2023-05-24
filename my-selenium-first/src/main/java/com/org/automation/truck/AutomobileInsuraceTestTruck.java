package com.org.automation.truck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomobileInsuraceTestTruck {

	public static void main(String[] args) throws InterruptedException {
		

	
			System.setProperty("webDreiver.chrome.driver", "C:chromedriver\\chromedriver.exe");
			

			
			WebDriver driver = new ChromeDriver();


			driver.get("http://sampleapp.tricentis.com/101/app.php");
			driver.manage().window().maximize();

			VehicalDataTestTruck.testVehicleData(driver);
			
			InsurantDataTestTruck.testInsurantData(driver);	
			 
			ProductDataTestTruck.testProductData(driver);
			
			SelectPriceOptionTruck.testSelectPriceOption(driver);
			
			SendQuoteTruck.testSendQuote(driver);
			
			Thread.sleep(50000);

	}

}
