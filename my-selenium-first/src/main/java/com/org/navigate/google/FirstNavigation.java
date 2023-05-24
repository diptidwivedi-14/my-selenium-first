package com.org.navigate.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDreiver.chrome.driver","C:chromedriver\\chromedriver.exe");
		//create instance of a browser
		//creating a driver object referencing webDriver interface.
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver represents a browser window
		
		driver.get("https://www.Google.com");
		driver.manage().window().maximize();
		
		String T = driver.getTitle();
		System.out.println("Title of the Page");
		System.out.println(T);
		System.out.println(driver.getCurrentUrl());
		System.out.println("Page source");
		System.out.println(driver.getPageSource());
		
		//WebElement element = driver.findElement(By.name("q"));
		//WebElement element1 = driver.findElement(By.id("fname"));
		
		WebElement element2 = driver.findElement(By.linkText("Gmail"));
		element2.click();
		
		WebElement element3 = driver.findElement(By.linkText("Gmail"));
		element3.click();
		
		//element.sendKeys("Seed Infotech");
		//element.sendKeys(Keys.ENTER);
		
		//driver.close();
		//driver.quit();

		


	

	}

}
