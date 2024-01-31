package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P007Calender {
	public static void main(String[] args) {
		String url = "https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = new DriverConnection().getConnection(url);

		
		WebElement iframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		System.out.println("frame fetched");
		driver.switchTo().frame(iframe);
		System.out.println("switched to frame");
		WebElement datepick = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		datepick.click();
		
		
//		WebElement currentdate = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[3]/td[5]/a"));
//		System.out.println(currentdate.getText());
		
//		//to print month and year
//		String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
//		System.out.println(monthYearVal); //August 2023
//		
//		 String month = monthYearVal.split(" ")[0].trim();
//		 String Year =  monthYearVal.split(" ")[1].trim();
//		 
//		 while(!(month.equals("August") && Year.equals ("2023"))) {
//		 	driver.findElement(By.xpath("//a[@title='Next']")).click();
//		
//		 System.out.println(monthYearVal); //August 2023
//			
//		 month = monthYearVal.split(" ")[0].trim();
//		  Year =  monthYearVal.split(" ")[1].trim();
//		 }
		
		
		
		
		//to select all dates of month
		 List<WebElement> allDates =driver.findElements(By.xpath("//body[1]/div[1]/table[1]/tbody[1]/tr/td/a[1]"));
		 for(WebElement ele:allDates) {
			 System.out.println(ele.getText());
		 }
		
		 
	}
}
