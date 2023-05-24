package com.org.automation.automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.org.automation.util.DateUtil;
import com.org.automation.util.Screenshot;

public class ProductDataTest {
	
	
	public static void testProductData (WebDriver driver) {
		boolean isPrevInd = false;
		WebElement webElement =null;
		
		//<-----Enter Product Data:----->
		
		webElement = driver.findElement(By.xpath("//*[@id=\'enterproductdata\']"));
		webElement.click();
		
		webElement = driver.findElement(By.xpath("//*[@id=\'openstartdatecalender\']/i"));
		webElement.click();
		
		webElement = driver.findElement(By.xpath("//*[@id=\'startdate\']"));
		webElement.sendKeys("10/10/2023");

		
		Select InsuranceSum = new Select(driver.findElement(By.xpath("//*[@id=\'insurancesum\']")));
		InsuranceSum.selectByVisibleText("5.000.000,00");

		Select MeritRating = new Select(driver.findElement(By.xpath("//*[@id=\'meritrating\']")));
		MeritRating.selectByVisibleText("Bonus 5");

		Select DamageInsurance = new Select(driver.findElement(By.xpath("//*[@id=\'damageinsurance\']")));
		DamageInsurance.selectByVisibleText("Full Coverage");
		
	
		
			try {
				
			//WebElement euro = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span"));
			//euro.click();
			
			WebElement legal = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[2]/span"));
			legal.click();
			
			
			} catch (Exception e) {
				System.out.println("Exception Occured...");
				
			}  
			
		
		Select CourtesyCar = new Select(driver.findElement(By.xpath("//*[@id=\'courtesycar\']")));
		CourtesyCar.selectByVisibleText("No");
		

		if(isPrevInd) {
			webElement = driver.findElement(By.xpath("//*[@id=\'preventerinsurancedata\']"));
			webElement.click();
			
		}else {


			webElement = driver.findElement(By.xpath("//*[@id=\'nextselectpriceoption']"));
			webElement.click();
		}
		
		
		

	}

}
