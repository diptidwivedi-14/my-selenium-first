package com.org.navigate.google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorlinktagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webDreiver.chrome.driver","C:chromedriver\\chromedriver.exe");
		//create instance of a browser
		//creating a driver object referencing webDriver interface.
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver represents a browser window
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		

		List<WebElement> lw = (List<WebElement>) driver.findElements(By.tagName("a"));
		//((WebElement) lw).sendKeys("Flower");
		//((WebElement) lw).sendKeys(Keys.ENTER);
		
		String lw1 = driver.getTitle();
		System.out.println("List of the elements");
		System.out.println(lw);
		System.out.println(lw);


	}

}
