package com.org.navigate.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDoubleclick {

	public static void main(String[] args) {
		
		
		System.setProperty("webDreiver.chrome.driver","C:chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		
		WebElement n = driver.findElement(By.xpath("//*[@id=\'dblClkBtn']"));
		Actions a = new Actions(driver);
		
		a.moveToElement(n).perform();
		a.doubleClick().perform();
		System.out.println("Page Navigate to : "+driver.getTitle());
		
		driver.quit();

	}

}
