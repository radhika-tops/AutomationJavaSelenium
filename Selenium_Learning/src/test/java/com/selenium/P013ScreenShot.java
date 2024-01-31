package com.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class P013ScreenShot {
	public static void getScreenshot(WebDriver driver, String path) {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			FileUtils.copyFile(source, dest);;
			System.out.println("ss taken");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		String url = "https://mvnrepository.com/artifact/commons-io/commons-io/2.13.0";
		WebDriver driver = new DriverConnection().getConnection(url);
		Thread.sleep(2000);
		System.out.println("method called");
		getScreenshot(driver, "C:\\Users\\baps\\Downloads\\Scrreenshot\\ssc.png");
		System.out.println("done");
		Thread.sleep(2000);
		driver.close();
	}
	}


