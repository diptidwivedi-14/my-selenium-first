package com.org.automation.truck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectPriceOptionTruck {

		public static void testSelectPriceOption (WebDriver driver) {
			WebElement webElement =null;
			boolean isPrevInd = false;

			//<----- Select Price Option:----->
			
			webElement = driver.findElement(By.xpath("//*[@id=\'selectpriceoption\']"));
			webElement.click(); 
			
			webElement = driver.findElement(By.xpath("//*[@id=\'priceTable\']/tfoot/tr/th[2]/label[1]/span")); //Silver
			//webElement.click();

			webElement = driver.findElement(By.xpath("//*[@id=\'priceTable\']/tfoot/tr/th[2]/label[2]/span")); //Gold
			//webElement.click();
			
			webElement = driver.findElement(By.xpath("//*[@id=\'priceTable\']/tfoot/tr/th[2]/label[3]/span"));  //Platinum
			webElement.click();
			
			webElement = driver.findElement(By.xpath("//*[@id=\'priceTable\']/tfoot/tr/th[2]/label[4]/span"));  //Ultimate
			//webElement.click();
		

			if(isPrevInd) {
				webElement = driver.findElement(By.xpath("//*[@id=\'preventerproductdata\']"));
				webElement.click();
				
			}else {


				webElement = driver.findElement(By.xpath("//*[@id=\'nextsendquote\']"));
				webElement.click();
			}

	}

}
