package com.org.navigate.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutepathCSS1 {
	public static void main(String[] args) {
		
		System.setProperty("webDreiver.chrome.driver","C:chromedriver\\chromedriver.exe");
		
		//create instance of a browser
		//creating a driver object referencing webDriver interface.
		
		WebDriver driver = new ChromeDriver();
		
		//driver represents a browser window
		
		driver.get("https://demoqa.com/text-box");
		
		WebElement username = driver.findElement(By.cssSelector("input"));
		username.sendKeys("Testing name ");
		
		//driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		//WebElement firstname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		//firstname.sendKeys("Software ");
		

		
		
		 
		  
		 
		
		
	}  
	

}

