package com.org.navigate.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.org.automation.util.DateUtil;
import com.org.automation.util.Screenshot;

public class RediffAccount {
	
	
	public static void main(String[] args) {
		
		WebElement webElement = null;


		System.setProperty("webDreiver.chrome.driver", "C:chromedriver\\chromedriver.exe");
		// create instance of a browser
		// creating a driver object referencing webDriver interface.

		WebDriver driver = new ChromeDriver();

		// driver represents a browser window

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();

		webElement = driver.findElement(By.xpath("//input"));
		webElement.sendKeys("Testing name ");

		webElement = driver.findElement(By.xpath("//input[@onclick='javascript:UncheckAllOptions();']"));
		webElement.sendKeys("diptidwivedi141516171");

		webElement = driver.findElement(By.id("newpasswd"));
		webElement.sendKeys("Abcd@1234");

		webElement = driver.findElement(By.id("newpasswd1"));
		webElement.sendKeys("Abcd@1234");

		webElement = driver.findElement(By.xpath("//*[@id=\'div_altemail\']/table/tbody/tr[1]/td[3]/input"));
		webElement.sendKeys("diptiatul14@gmail.com");

		webElement = driver.findElement(By.id("mobno"));
		webElement.sendKeys("1234567890 ");

		Select day = new Select(driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[22]/td[3]/select[1]")));
		day.selectByValue("01");

		Select month = new Select(driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[22]/td[3]/select[2]")));
		month.selectByVisibleText("JAN");

		Select year = new Select(driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[22]/td[3]/select[3]")));
		year.selectByValue("2001");

		// Radio Button

		webElement = driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[24]/td[3]/input[1]"));
		webElement.click();

		webElement = driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[24]/td[3]/input[2]"));
		webElement.click();

		Select country = new Select(driver.findElement(By.xpath("//*[@id=\'country\']")));
		country.selectByVisibleText("India");

		Select city = new Select(driver.findElement(By.xpath("//*[@id=\'div_city\']/table/tbody/tr[1]/td[3]/select\r\n")));
		city.selectByVisibleText("Mumbai");

		//Screenshot.takeScreenshots(driver, DateUtil.getScreenshotPathName("RediffAccount"));
		
		driver.findElement(By.id("Register")).click();
		driver.close();
	
	}
}
		


	
