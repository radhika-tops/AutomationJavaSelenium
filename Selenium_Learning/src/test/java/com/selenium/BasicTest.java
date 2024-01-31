package com.selenium;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class BasicTest {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		/*chrome
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		String expectedResult = "facebook.com";
		String actual = driver.getTitle();
		System.out.println(actual);
		if(expectedResult.equals(actual)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("selenium@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("pass");
		
		*/
		
		
		/*
		edge
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		*/
		
		//firefox
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\baps\\Downloads\\geckodriver-v0.33.0-win64 (1)\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
		
		
		
		/*internet explorer
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer_x64_4.10.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		*/

		
		
	}

}
