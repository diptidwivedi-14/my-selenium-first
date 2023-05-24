package com.org.automobile.motorcycle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomobileInsuraceTestMotorcycle {

	public static void main(String[] args) throws InterruptedException {
		

	
			System.setProperty("webDreiver.chrome.driver", "C:chromedriver\\chromedriver.exe");
			

			
			WebDriver driver = new ChromeDriver();


			driver.get("http://sampleapp.tricentis.com/101/app.php");
			driver.manage().window().maximize();

			VehicalDataTestMotorcycle.testVehicleData(driver);
			
			InsurantDataTestMotorcycle.testInsurantData(driver);	
			 
			ProductDataTestMotorcycle.testProductData(driver);
			
			SelectPriceOptionMotorcycle.testSelectPriceOption(driver);
			
			SendQuoteMotorcycle.testSendQuote(driver);
			
			Thread.sleep(50000);

	}

}
