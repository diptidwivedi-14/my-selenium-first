package com.org.automobile.camper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InsurantDataTestCamper {



public static void testInsurantData (WebDriver driver) {
		
		boolean isPrevInd = false;
		WebElement webElement =null;
		
		//<-----Enter Insurant Data:----->
		
		webElement = driver.findElement(By.xpath("//*[@id=\'enterinsurantdata\']"));
		webElement.click();

		webElement = driver.findElement(By.xpath("//*[@id=\'firstname\']"));
		webElement.sendKeys("ABC");

		webElement= driver.findElement(By.xpath("//*[@id=\'lastname\']"));
		webElement.sendKeys("XYZ");
		
		webElement = driver.findElement(By.xpath("//*[@id=\'opendateofbirthcalender\']/i"));
		webElement.click();
			
		webElement = driver.findElement(By.xpath("//*[@id=\'birthdate\']"));
		webElement.sendKeys("12/20/1990");
		
	
		//<-------Gender------->


			try {
			
			webElement = driver.findElement(By.xpath("//*[@id=\'insurance-form\']/div/section[2]/div[4]/p"));
			webElement.click(); 
			
			webElement = driver.findElement(By.xpath("//*[@id=\'insurance-form\']/div/section[2]/div[4]/p/label[1]/span"));
			webElement.click();

			webElement = driver.findElement(By.xpath("//*[@id=\'insurance-form\']/div/section[2]/div[4]/p/label[2]/span"));
			//	webElement.click();
		} catch (Exception e) {
			System.out.println("Exception Occured...");
		} 
			
		
		
		webElement = driver.findElement(By.xpath("//*[@id=\'streetaddress\']"));
		webElement.sendKeys("wagholi");

		Select Country = new Select(driver.findElement(By.xpath("//*[@id=\'country\']")));
		Country.selectByVisibleText("India");

		webElement = driver.findElement(By.xpath("//*[@id=\'zipcode\']"));
		webElement.sendKeys("1234");

		 webElement= driver.findElement(By.xpath("//*[@id=\'city\']"));
		 webElement.sendKeys("Pune");

		 webElement = driver.findElement(By.xpath("//*[@id=\'occupation\']"));
		 webElement.sendKeys("Farmer"); 
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\'insurance-form\']/div/section[2]/div[10]/p/label[1]/span"));
		checkbox.click();
		
	/*	WebElement checkbox1 = driver.findElement(By.xpath(""));
		checkbox1.click();  */
		
		 webElement = driver.findElement(By.xpath("//*[@id=\'website\']"));
		 webElement.sendKeys("http://sampleapp.tricentis.com/101/"); 
		
		
		
	
		if(isPrevInd) {
			webElement = driver.findElement(By.xpath("//*[@id=\'preventervehicledata\']"));
			webElement.click();
			
		}else {


			webElement = driver.findElement(By.xpath("//*[@id=\'nextenterproductdata\']"));
			webElement.click();
		}              
		
		

		

	}
}
