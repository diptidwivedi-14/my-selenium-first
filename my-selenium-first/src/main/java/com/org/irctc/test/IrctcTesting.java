package com.org.irctc.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcTesting {

	public static void main(String[] args) {
		
		WebElement webElement =null;

		System.setProperty("webDreiver.chrome.driver", "C:chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		webElement = driver.findElement(By.xpath("//*[@id=\'slide-menu\']/p-sidebar/div/nav/div/label/button"));
		webElement.click();
		
		//Select Country = new Select(driver.findElement(By.xpath("//*[@id=\'origin\']/span/input]")));
		//Country.selectByVisibleText("PATNA JN - PNBE");
		
	
		
		

	}

}
