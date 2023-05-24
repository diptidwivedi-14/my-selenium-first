package com.org.automation.automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendQuote {

		public static void testSendQuote (WebDriver driver) {
			
			boolean isPrevInd = false;
			WebElement webElement =null;
			
			//<----- Send Quoten:----->
			
			webElement = driver.findElement(By.xpath("//*[@id=\'email\']"));
			webElement.sendKeys("Abc@123.gmail.com");
			
			webElement = driver.findElement(By.xpath("//*[@id=\'phone\']"));
			webElement.sendKeys("1234567890");
			
			webElement = driver.findElement(By.xpath("//*[@id=\'username\']"));
			webElement.sendKeys("Abcd4321");
			
			webElement = driver.findElement(By.xpath("//*[@id=\'password\']"));
			webElement.sendKeys("Ab!123");
			
			webElement = driver.findElement(By.xpath("//*[@id=\'confirmpassword\']"));
			webElement.sendKeys("Ab!123");
			
			webElement = driver.findElement(By.xpath("//*[@id=\'Comments\']"));
			webElement.click();
			
			if(isPrevInd) {
				webElement = driver.findElement(By.xpath("//*[@id=\'prevselectpriceoption\']"));
				webElement.click();
		
			}else {  

				webElement = driver.findElement(By.xpath("//*[@id=\'sendemail\']"));
				webElement.click();
			}

	}

}
