package com.org.automobile.motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendQuoteMotorcycle {

		public static void testSendQuote (WebDriver driver) {
			
			boolean isPrevInd = false;
			WebElement webElement =null;
			
			//<----- Send Quoten:----->
			webElement = driver.findElement(By.xpath("//*[@id=\'sendquote\']"));
			webElement.click();
			
			webElement = driver.findElement(By.xpath("//*[@id=\'email\']"));
			webElement.sendKeys("Abc@123.gmail.com");

			webElement = driver.findElement(By.xpath("//*[@id=\'phone\']"));
			webElement.sendKeys("1234567890");
			
			webElement = driver.findElement(By.xpath("//*[@id=\'username\']"));
			webElement.sendKeys("Xyz123");
			
			webElement = driver.findElement(By.xpath("//*[@id=\'password\']"));
			webElement.sendKeys("Xyz!123");
			
			webElement = driver.findElement(By.xpath("//*[@id=\'confirmpassword\']"));
			webElement.sendKeys("Xyz!123");
			
			webElement = driver.findElement(By.xpath("//*[@id=\'Comments\']"));
			webElement.sendKeys("Hello..!!!");
			
			if(isPrevInd) {
				webElement = driver.findElement(By.xpath("//*[@id=\'prevselectpriceoption\']"));
				webElement.click();
		
			}else {  

				webElement = driver.findElement(By.xpath("//*[@id=\'sendemail\']"));
				webElement.click();
			}


	}

}
