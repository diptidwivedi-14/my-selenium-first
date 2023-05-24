package com.org.navigate.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webDreiver.chrome.driver","C:chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		
		Actions builder = new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		builder.dragAndDrop(from, to).perform();
		
		String textTo = to.getText();
		
		if(textTo.equals("Dropped!")) {
			System.out.println("PASS : File is dropped ");
		}
		else {
			System.out.println("FAIL : File couldn't be dropped ");

		}
	}
}
