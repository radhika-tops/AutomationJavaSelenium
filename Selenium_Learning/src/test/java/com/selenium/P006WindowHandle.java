package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P006WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		//to open window
		String mainwindow = driver.getWindowHandle();
		System.out.println(mainwindow);
		
		
		//to click on click here button
		WebElement ele = driver.findElement(By.xpath("/html/body/p/a"));
		ele.click();
		//another way to click button
		//WebElement ele1 = driver.findElement(By.xpath("Click Here"));
		//ele1.click();
		
		
		
		//to fetch data and check how much window open then after new page open for inserting data
		Set<String> allwindow = driver.getWindowHandles();
		for(String win: allwindow) {
			System.out.println(win);
			if(!win.equals(mainwindow)) {
				driver.switchTo().window(win);
			}
		}
		
		//to insert email id
		WebElement email = driver.findElement(By.name("emailid"));
		email.sendKeys("selenium@gmail.com");
		
		
		//to click on submit button
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		
		//to close current window after work is done
		driver.close();
		//to close back window also(mainwindow)
		driver.switchTo().window(mainwindow);
		driver.close();
		
		//driver.quit();
		
	}

}
