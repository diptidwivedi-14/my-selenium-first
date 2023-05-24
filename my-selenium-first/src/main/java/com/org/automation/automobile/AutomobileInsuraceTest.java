package com.org.automation.automobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.org.automation.util.DateUtil;
import com.org.automation.util.Screenshot;

public class AutomobileInsuraceTest {

	public static void main(String[] args) throws InterruptedException {
		

	
			System.setProperty("webDreiver.chrome.driver", "C:chromedriver\\chromedriver.exe");
			

			
			WebDriver driver = new ChromeDriver();


			driver.get("http://sampleapp.tricentis.com/101/app.php");
			driver.manage().window().maximize();

			VehicalDataTest.testVehicleData(driver);
			
			
			
			InsurantDataTest.testInsurantData(driver);	
			 
			ProductDataTest.testProductData(driver);
			
			SelectPriceOption.testSelectPriceOption(driver);
			
			SendQuote.testSendQuote(driver);
			
			Thread.sleep(50000);

	}

}
