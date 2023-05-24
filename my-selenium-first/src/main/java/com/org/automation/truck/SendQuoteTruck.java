package com.org.automation.truck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendQuoteTruck {

		public static void testSendQuote (WebDriver driver) {
			
			boolean isPrevInd = false;
			WebElement webElement =null;
			
			//<----- Send Quoten:----->
			webElement = driver.findElement(By.xpath("//*[@id=\'sendquote\']"));
			webElement.click();
			
			webElement = driver.findElement(By.id("email"));
			webElement.sendKeys("Abc@123.gmail.com");

			webElement = driver.findElement(By.id("phone"));
			webElement.sendKeys("1234567890");
			
			webElement = driver.findElement(By.id("username"));
			webElement.sendKeys("Xyz123");
			
			webElement = driver.findElement(By.id("password"));
			webElement.sendKeys("Xyz!123");
			
			webElement = driver.findElement(By.id("confirmpassword"));
			webElement.sendKeys("Xyz!123");
			
			webElement = driver.findElement(By.id("Comments"));
			webElement.sendKeys("No Comments");
			
			if(isPrevInd) {
				webElement = driver.findElement(By.xpath("//*[@id=\'prevselectpriceoption\']"));
				webElement.click();
		
			}else {  

				webElement = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[7]/button[2]"));
				webElement.click();
			}


	}

}
