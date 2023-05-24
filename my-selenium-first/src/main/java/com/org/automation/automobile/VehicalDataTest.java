package com.org.automation.automobile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VehicalDataTest {

	public static void testVehicleData (WebDriver driver) {
		
		WebElement webElement =null;
		
		//<----- AUTOMOBILE:----->
		
		webElement = driver.findElement(By.xpath("//*[@id=\'nav_automobile\']"));
		webElement.click();

		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		
		//<------Enter Vehicle Data:---->

		webElement = driver.findElement(By.xpath("//*[@id=\'entervehicledata\']"));
		webElement.click();

		Select vehicleType = new Select(driver.findElement(By.xpath("//*[@id=\'make\']")));
		vehicleType.selectByVisibleText("BMW");

		webElement = driver.findElement(By.xpath("//*[@id=\'engineperformance\']"));
		webElement.sendKeys("123");

		webElement = driver.findElement(By.xpath("//*[@id=\'dateofmanufacture\']"));
		webElement.sendKeys("12/10/2022");

		webElement = driver.findElement(By.xpath("//*[@id=\'opendateofmanufacturecalender\']"));
		webElement.click();

		Select noOfSeats = new Select(driver.findElement(By.xpath("//*[@id=\'numberofseats\']")));
		noOfSeats.selectByVisibleText("4");

		Select fuelType = new Select(driver.findElement(By.xpath("//*[@id=\'fuel\']")));
		fuelType.selectByVisibleText("Electric Power");

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
