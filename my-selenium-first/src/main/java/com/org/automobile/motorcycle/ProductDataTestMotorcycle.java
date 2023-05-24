package com.org.automobile.motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductDataTestMotorcycle {
	
	
	public static void testProductData (WebDriver driver) {
		boolean isPrevInd = false;
		WebElement webElement =null;
		
		//<-----Enter Product Data:----->
		
		webElement = driver.findElement(By.xpath("//*[@id=\'enterproductdata\']/span"));
		webElement.click();
		

		webElement = driver.findElement(By.xpath("//*[@id=\'startdate\']"));
		webElement.sendKeys("10/10/2023");

		
		
		Select InsuranceSum = new Select(driver.findElement(By.xpath("//*[@id=\'insurancesum\']")));
		InsuranceSum.selectByVisibleText("5.000.000,00");


		Select DamageInsurance = new Select(driver.findElement(By.xpath("//*[@id=\'damageinsurance\']")));
		DamageInsurance.selectByVisibleText("Full Coverage");
		
	
		
			try {
				
			
			WebElement euro = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[1]/span"));
			euro.click();
			
			
			} catch (Exception e) {
				System.out.println("Exception Occured...");
				
			}  
		
		

		if(isPrevInd) {
			webElement = driver.findElement(By.xpath("//*[@id=\'preventerinsurancedata\']"));
			webElement.click();
			
		}else {


			webElement = driver.findElement(By.xpath("//*[@id=\'nextselectpriceoption\']"));
			webElement.click();
		}
		
		
		

	}

}
