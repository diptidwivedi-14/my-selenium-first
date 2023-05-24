package com.org.navigate.google;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NoSuchElementExceptionDemo {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webDreiver.chrome.driver","C:chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Google.com");
		driver.manage().window().maximize();
		
		String T = driver.getTitle();
		System.out.println("Title of the Page");
		System.out.println(T);
		System.out.println(driver.getCurrentUrl());
		System.out.println("Page source");
		System.out.println(driver.getPageSource());
				
		try {
			WebElement element2 = driver.findElement(By.linkText("name"));
			element2.click();
		}
			catch(NoSuchElementException e)
		{
			System.out.println("Handled NoSuchElementException");
		}
		
		WebElement element3 = driver.findElement(By.linkText("Gmail"));
		element3.click();
				
		driver.close();
		driver.quit();	
	}
}
