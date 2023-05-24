package com.org.navigate.google;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,max;
		
		
		System.setProperty("webDreiver.chrome.driver","C:chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.crictracker.com/ipl-points-table/?ref=hm");
		driver.manage().window().maximize();
		
		WebElement baseTable = driver.findElement(By.tagName("table"));
		System.out.println("Table size " +baseTable.getSize());
		
		WebElement tableRow = baseTable.findElement(By.xpath("//*[@id='__next']/main/div/div[2]/div/div[4]/div[1]/table/thead\r\n"));
		System.out.println("Row contains " +tableRow.getText());
		
	
		//Number of Columns:-
	
		WebElement togetcol = driver.findElement(By.xpath("//*[@id='__next']/main/div/div[2]/div/div[4]/div[1]/table/tbody/tr[1]"));
		List<WebElement> TotalrowsList = togetcol.findElements(By.tagName("td"));
		System.out.println("Row number of Rows in the table are :"+ TotalrowsList.size());
		
		WebElement cell33 = driver.findElement(By.xpath("//*[@id='__next']/main/div/div[2]/div/div[4]/div[1]/table/tbody/tr[3]/td[3]"));
		System.out.println(cell33.getText());
		
		//WebElement cell38 = driver.findElement(By.xpath("//*[@id='__next']/main/div/div[2]/div/div[4]/div[1]/table/tbody/tr[1]/td[8]"));
		WebElement cell38 = driver.findElement(By.xpath("//*[@id='__next']/main/div/div[2]/div/div[4]/div[1]/table/tbody/tr[19]/td[8]"));
		System.out.println("before max :");

		System.out.println(cell38.getText());
		
		String p = (cell38.getText());
		max = Integer.parseInt(p);
		String j = null;
		for(i=1;i<=10;i++) {
			
			if(max < Integer.parseInt(driver.findElement(By.xpath("//*[@id='__next']/main/div/div[2]/div/div[4]/div[1]/table/tbody/tr['i+1']/td[8]")).getText()));
			
				max = Integer.parseInt(driver.findElement(By.xpath("//*[@id='__next']/main/div/div[2]/div/div[4]/div[1]/table/tbody/tr['i+1']/td[8]")).getText());
					
				System.out.println("i = " + i);
				System.out.println("In Loop max :" +max);
				
		}
		System.out.println("Maximum Points = " + max);		
	}
}

