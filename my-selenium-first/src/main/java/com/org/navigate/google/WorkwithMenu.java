package com.org.navigate.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkwithMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webDreiver.chrome.driver","C:chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement n = driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/div"));
		Actions a = new Actions(driver);
		
		a.moveToElement(n).perform();
		
		WebElement m = driver.findElement(By.xpath("//*[@id=\'nav-al-wishlist\']/a[1]/span"));
		a.moveToElement(m).click().perform();
		System.out.println("Page Navigate to : "+driver.getTitle());
		
		

	}

}
