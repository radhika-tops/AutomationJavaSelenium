package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P009MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.amazon.in/";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		WebElement miniTV = driver.findElement(By.linkText("Amazon miniTV"));
		WebElement sell = driver.findElement(By.linkText("Sell"));
		WebElement BestSellers = driver.findElement(By.linkText("Best Sellers"));
		WebElement TodaysDeal = driver.findElement(By.linkText("Today's Deals"));
		WebElement Mobile = driver.findElement(By.linkText("Mobiles"));
		WebElement NewRelease = driver.findElement(By.linkText("New Releases"));
		WebElement CustomerSer = driver.findElement(By.linkText("Customer Service"));
		WebElement Prime = driver.findElement(By.linkText("Prime"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(miniTV).build().perform();
		action.moveToElement(sell).build().perform();
		action.moveToElement(BestSellers).build().perform();
		action.moveToElement(TodaysDeal).build().perform();
		action.moveToElement(Mobile).build().perform();
		action.moveToElement(NewRelease).build().perform();
		action.moveToElement(CustomerSer).build().perform();
		action.moveToElement(Prime).build().perform();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
