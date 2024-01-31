package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P001FbTest {
	public static void main(String[]args)throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = new DriverConnection().getConnection(url);
	
		WebElement ele = driver.findElement(By.linkText("Create new account"));
		ele.click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Java");
		driver.findElement(By.name("lastname")).sendKeys("Selenium");
		driver.findElement(By.name("reg_email__")).sendKeys("8921563200");
		driver.findElement(By.name("reg_passwd__")).sendKeys("selenium@123");
		
		
		//date of birth with drop down button
		WebElement dates= driver.findElement(By.id("day"));
		Select date = new Select(dates);
		date.selectByIndex(24);
		
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
		month.selectByValue("9");
		
		WebElement years = driver.findElement(By.id("year"));
		Select year = new Select(years);
		year.selectByVisibleText("1999");
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		for(WebElement g:gender) {
			String name = g.getText();
			System.out.println(name);

		}
		gender.get(1).click();
		
		//driver.findElement(By.name("websubmit")).click();
		WebElement signupButtonElement = driver.findElement(By.name("websubmit"));
		signupButtonElement.click();
		Thread.sleep(2000);
		
	}
}
