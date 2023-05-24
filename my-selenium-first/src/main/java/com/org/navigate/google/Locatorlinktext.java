package com.org.navigate.google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorlinktext {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDreiver.chrome.driver","C:chromedriver\\chromedriver.exe");
		//create instance of a browser
		//creating a driver object referencing webDriver interface.
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver represents a browser window
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//WebElement element1 = driver.findElement(By.linkText("Email"));
		//element1.click();

		WebElement element2 = driver.findElement(By.partialLinkText("Images"));
		element2.click();
		

		WebElement element3 = driver.findElement(By.name("q"));
		
		element3.sendKeys("Flower");
		element3.sendKeys(Keys.ENTER);
		

}
}
