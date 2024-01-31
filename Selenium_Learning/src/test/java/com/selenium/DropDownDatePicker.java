package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownDatePicker {
	public static void main(String[] args) throws InterruptedException {
//		String url = "https://www.globalsqa.com/demo-site/datepicker/";
//		WebDriver driver = new DriverConnection().getConnection(url);
//
//		driver.findElement(By.xpath("//*[@id=\"DropDown DatePicker\"]")).click();
//		
//	  WebElement iframe = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/p[1]/iframe[1]"));
//		//WebElement iframe = driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[2]/p/iframe"));	
//		
//		
//		System.out.println("frame fetched");
//		driver.switchTo().frame(iframe);
//		System.out.println("switched to frame");
//		driver.findElement(By.id("datepicker")).click();
//
//		Thread.sleep(2000);
		
		//WebElement iframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		
		
		String url = "https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = new DriverConnection().getConnection(url);
//		WebElement drop = driver.findElement(By.xpath("//ul[@class='resp-tabs-list ']/li[2]"));
//		drop.click();
		 driver.findElement(By.id("DropDown DatePicker")).click();
		   Thread.sleep(2000);
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[2]/p/iframe"));
		System.out.println("frame fetched");
		driver.switchTo().frame(iframe);
		System.out.println("switched to frame");
		Thread.sleep(2000);
		WebElement datepick = driver.findElement(By.id("datepicker"));
		datepick.click();
		Thread.sleep(2000);
		
		
		
//	//	WebElement months= driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]"));
//	WebElement months = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[1]"));
//		Select month = new Select(months);
//		month.selectByIndex(3);
		
		WebElement years = driver.findElement(By.className("ui-datepicker-year"));
		Select year = new Select(years);
		year.selectByVisibleText("2014");

		WebElement months = driver.findElement(By.className("ui-datepicker-month"));
		Select month = new Select(months);
		month.selectByIndex(3);
		
		
		
		
	//	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[3]/a")).click();
		
		
//		String currentYear = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")).getText();
//		int y1 = Integer.parseInt(Year);
//		int y2 = Integer.parseInt(currentYear);
//		//while(!Year.equals(driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")).getText())) {
//			while(!Year.equals(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[2]")).getText())) {	
//			if(y1>y2) {
//				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
//				
//			}
//			else {
//				driver.findElement(By.xpath("//a[@data-handler='prev']/span)]")).click();
//			}
//		//	while(!Month.equals(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).getText())) {
//			while(!Month.equals(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[1]")).getText())) {
//				if(y1>y2) {
//					driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
//				}
//				else {
//					driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
//				}
//			}
//			
	
			
			
			
			
			
			
//		String myDate = "30";
//		String myMonth = "April";
//		String myYear = "1997";
//		String currentYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year")).getText();
//		int y1 = Integer.parseInt(myYear);
//		int y2 = Integer.parseInt(currentYear);
//		while(!myYear.equals(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).getText())) {
//			if(y1>y2) {
//				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
//				
//			}
//			else {
//				driver.findElement(By.xpath("//a[@data-handler='prev']/span)]")).click();
//			}
//		}
//		while(!myMonth.equals(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).getText())) {
//			if(y1>y2) {
//				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
//			}
//			else {
//				driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
//			}
//		}
//		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
//		for(WebElement date : dates) {
//			String d = date.getText();
//			System.out.println(d+" / "+myMonth+" / "+myYear);
//			if(d.equals(myDate)) {
//				date.click();
//			}
		
		
		
		
		
		
		
			
			
		
		//WebElement datepick = driver.findElement(By.xpath("//*[@id='datepicker']"));
//		datepick.click();
//		Thread.sleep(2000);
//		String myDate = "30";
//		String myMonth = "April";
//		String myYear = "1997";
//		String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//		int y1 = Integer.parseInt(myYear);
//		int y2 = Integer.parseInt(currentYear);
//		while(!myYear.equals(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText())) {
//			if(y1>y2) {
//				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
//				
//			}
//			else {
//				driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
//			}
//		}
//		while(!myMonth.equals(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText())) {
//			if(y1>y2) {
//				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
//			}
//			else {
//				driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
//			}
//		}
//		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
//		for(WebElement date : dates) {
//			String d = date.getText();
//			System.out.println(d+" / "+myMonth+" / "+myYear);
//			if(d.equals(myDate)) {
//				date.click();
//			}
			
			
			
	}
}

