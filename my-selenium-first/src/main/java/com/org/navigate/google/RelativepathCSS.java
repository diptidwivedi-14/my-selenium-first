package com.org.navigate.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativepathCSS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webDreiver.chrome.driver","C:chromedriver\\chromedriver.exe");
		//create instance of a browser
		//creating a driver object referencing webDriver interface.
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//driver represents a browser window
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		

		WebElement username = driver.findElement(By.cssSelector("input"));
		username.sendKeys("Testing name ");
		
		WebElement useremail = driver.findElement(By.id("userEmail"));
		useremail.sendKeys("Abc12@gmail.com "); 
		
		
		WebElement usereadd1 = driver.findElement(By.xpath("//textarea"));
		usereadd1.sendKeys("Wagholi,Pune"); 
		
		 WebElement usereadd2 = driver.findElement(By.id("permanentAddress"));
		 usereadd2.sendKeys("Pune"); 
		
		//WebElement usereadd3 = driver.findElement(By.xpath("//permanentAddress"));
		//usereadd3.sendKeys("Wagholi"); 
				
		 driver.findElement(By.name("submit")).click();
		
		
		driver.close();
		
				

	}
}
