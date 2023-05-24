package com.org.automobile.camper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VehicalDataTestCamper {

public static void testVehicleData (WebDriver driver) {
		
		WebElement webElement =null;
		
		//<----- CAMPER:----->
		
		webElement = driver.findElement(By.xpath("//*[@id=\'nav_camper\']"));
		webElement.click();

		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		
		//<------Enter Vehicle Data:---->

		webElement = driver.findElement(By.xpath("//*[@id=\'entervehicledata\']"));
		webElement.click();

		Select vehicleType = new Select(driver.findElement(By.xpath("//*[@id=\'make\']")));
		vehicleType.selectByVisibleText("Volvo");

		webElement = driver.findElement(By.xpath("//*[@id=\'engineperformance\']"));
		webElement.sendKeys("112");
		
		webElement = driver.findElement(By.xpath("//*[@id=\'opendateofmanufacturecalender\']/i"));
		webElement.click();

		webElement = driver.findElement(By.xpath("//*[@id=\'dateofmanufacture\']"));
		webElement.sendKeys("12/10/2021");

		
		Select noOfSeats = new Select(driver.findElement(By.xpath("//*[@id=\'numberofseats\']")));
		noOfSeats.selectByVisibleText("2");
		

		try {
		
		webElement = driver.findElement(By.xpath("//*[@id=\'insurance-form\']/div/section[1]/div[5]/p"));
		webElement.click(); 
		
		webElement = driver.findElement(By.xpath("//*[@id=\'insurance-form\']/div/section[1]/div[5]/p/label[1]/span"));
		webElement.click();

		webElement = driver.findElement(By.xpath("//*[@id=\'insurance-form\']/div/section[1]/div[5]/p/label[2]/span"));
		//webElement.click();
		
		} catch (Exception e) {
			System.out.println("Exception Occured...");
		} 
		
		Select fuelType = new Select(driver.findElement(By.xpath("//*[@id=\'fuel\']")));
		fuelType.selectByVisibleText("Petrol");

		webElement = driver.findElement(By.xpath("//*[@id='payload']"));
		webElement.sendKeys("1000");
		
		webElement = driver.findElement(By.xpath("//*[@id=\'totalweight\']"));
		webElement.sendKeys("1000");
		
		webElement = driver.findElement(By.xpath("//*[@id=\'listprice\']"));
		webElement.sendKeys("100000");
		
		webElement = driver.findElement(By.xpath("//*[@id=\'licenseplatenumber\']"));
		webElement.sendKeys("MH12 L1214");
		
		webElement = driver.findElement(By.xpath("//*[@id=\'annualmileage\']"));
		webElement.sendKeys("150");


		webElement = driver.findElement(By.xpath("//*[@id=\'nextenterinsurantdata\']"));
		webElement.click(); 
		
		

	}
}
