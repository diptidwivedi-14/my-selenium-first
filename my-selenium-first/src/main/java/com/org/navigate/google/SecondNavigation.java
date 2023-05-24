package com.org.navigate.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondNavigation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDreiver.chrome.driver","C:chromedriver\\chromedriver.exe");
		//create instance of a browser
		//creating a driver object referencing webDriver interface.
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver represents a browser window
		
		driver.get("https://www.seedinfotech.com");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.className("hfe-search-form__input"));
		
		element.sendKeys("Full stack developer");
		element.sendKeys(Keys.ENTER);
		
		//WebElement element1 = driver.findElement(By.id("clear-with-button"));
		//element1.sendKeys(" SQL developer");
		//element1.sendKeys(Keys.ENTER);
		
		//WebElement element2 = driver.findElement(By.className("elementor-button-link elementor-button elementor-size-sm"));
		//element2.click();

		
		
		
	}
}
