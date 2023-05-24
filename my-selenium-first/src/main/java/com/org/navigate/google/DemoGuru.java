package com.org.navigate.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.org.automation.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoGuru {

	public static void main(String[] args) {

		WebElement webElement = null;

	//	System.setProperty("webDreiver.gecho.driver", "C:gechodriver\\gechodriver.exe");
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");

		driver.manage().window().maximize();

		webElement = driver.findElement(By.xpath("//*[@id=\'firstName\']"));
		webElement.sendKeys("Dipti");

		webElement = driver.findElement(By.xpath("//*[@id=\'lastName\']"));
		webElement.sendKeys("Dwivedi");

		webElement = driver.findElement(By.xpath("//*[@id=\'userEmail\']"));
		webElement.sendKeys("diptiatul4@gmail.com");

		webElement = driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[1]/label"));
		// webElement.click();

		webElement = driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[2]/label"));
		webElement.click();

		webElement = driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[3]/label"));
		// webElement.click();

		webElement = driver.findElement(By.xpath("//*[@id=\'userNumber\']"));
		webElement.sendKeys("1234567890");
		
		//Select DOB field then select date of month dropdown and assign to variable then select month by index
		webElement = driver.findElement(By.id("dateOfBirthInput"));
		webElement.click();
		
		Select MonthSelec = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		MonthSelec.selectByVisibleText("July");

//Select year and assign to variable, then select year by index
		Select  YearSelect =  new Select(driver.findElement(By.className("react-datepicker__year-select")));
        YearSelect.selectByValue("1995");

//Select the specific day you want by classname
        webElement = driver.findElement(By.className("react-datepicker__day--014"));
        webElement .click();

		webElement = driver.findElement(By.id("subjects-label"));
		webElement.click();
		
		webElement = driver.findElement(By.id("subjectsInput"));
	    webElement.sendKeys("Software Testing");
	    
/*	    driver.findElement(By.cssSelector("label['Hobbies']"));
	    webElement.click();

	  //Selecting the first checkbox
	    driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
	    webElement.click();

	    //Selecting the second checkbox
	    driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
	    webElement.click();
	    		
	    //Selecting the last check box
	    driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
	    webElement.click();           */
	   	
	}

}
