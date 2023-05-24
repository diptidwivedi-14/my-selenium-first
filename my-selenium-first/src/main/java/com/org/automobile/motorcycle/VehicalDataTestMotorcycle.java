package com.org.automobile.motorcycle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VehicalDataTestMotorcycle {

	public static void testVehicleData (WebDriver driver) {
		
		WebElement webElement =null;
		
		//<----- MOTORCYCLE:----->
		
		webElement = driver.findElement(By.xpath("//*[@id=\'nav_motorcycle\']"));
		webElement.click();

		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		
		//<------Enter Vehicle Data:---->

		webElement = driver.findElement(By.xpath("//*[@id=\'entervehicledata\']"));
		webElement.click();

		Select vehicleType = new Select(driver.findElement(By.xpath("//*[@id=\'make\']")));
		vehicleType.selectByVisibleText("Honda");
		
		Select model = new Select(driver.findElement(By.xpath("//*[@id=\'model\']")));
		model.selectByVisibleText("Motorcycle");
		
		webElement = driver.findElement(By.xpath("//*[@id=\'cylindercapacity\']"));
		webElement.sendKeys("112");
		
		webElement = driver.findElement(By.xpath("//*[@id=\'engineperformance\']"));
		webElement.sendKeys("123");
		
		webElement = driver.findElement(By.xpath("//*[@id=\'dateofmanufacture\']"));
		webElement.sendKeys("12/10/2021");

	//	webElement = driver.findElement(By.xpath("//*[@id=\'opendateofmanufacturecalender\']/i"));
	//	webElement.click();

		Select noOfSeats = new Select(driver.findElement(By.xpath("//*[@id=\'numberofseatsmotorcycle\']")));
		noOfSeats.selectByVisibleText("2");
		
		webElement = driver.findElement(By.xpath("//*[@id=\'listprice\']"));
		webElement.sendKeys("10000");

		webElement = driver.findElement(By.xpath("//*[@id=\'annualmileage\']"));
		webElement.sendKeys("100");

		webElement = driver.findElement(By.xpath("//*[@id=\'nextenterinsurantdata\']"));
		webElement.click();  


	}
}
