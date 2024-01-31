package com.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P012ScrollDownEvent {
			

			public static void main(String[] args) {
				String url = "https://demoqa.com/automation-practice-form";
				WebDriver driver = new DriverConnection().getConnection(url);
				WebElement button = driver.findElement(By.id("uploadPicture"));
				button.sendKeys("C:\\Users\\baps\\Downloads\\Untitled Diagram (3).drawio");
				
				//1.Scroll By pixels
				JavascriptExecutor js = (JavascriptExecutor) driver;
//				js.executeScript("window.scrollBy(0,50)");
//				
//				
//				
//				//2.Scroll By element
				WebElement ele = driver.findElement(By.xpath("//*[@id='stateCity-wrapper']/div[2]/div/div/div[1]"));
			// Scrolling down the page till the element is found		
		        js.executeScript("arguments[0].scrollIntoView();", ele);
				
				//3.Scroll at the last bottom.Scrolling down the page till the element is found
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//				js.executeScript("arguments[0].scrollIntoView();", ele);
//				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
				
				}
}
