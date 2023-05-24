package com.org.automobile.camper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomobileInsuraceTestCamper {

	public static void main(String[] args) throws InterruptedException {
		

	
			System.setProperty("webDreiver.chrome.driver", "C:chromedriver\\chromedriver.exe");
			

			
			WebDriver driver = new ChromeDriver();


			driver.get("http://sampleapp.tricentis.com/101/app.php");
			driver.manage().window().maximize();

			VehicalDataTestCamper.testVehicleData(driver);
			
			InsurantDataTestCamper.testInsurantData(driver);	
			 
			ProductDataTestCamper.testProductData(driver);
			
			SelectPriceOptionCamper.testSelectPriceOption(driver);
			
			SendQuoteCamper.testSendQuote(driver);
			
			Thread.sleep(50000);

	}

}
