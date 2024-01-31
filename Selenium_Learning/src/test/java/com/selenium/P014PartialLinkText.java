package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P014PartialLinkText {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		List<WebElement>list= driver.findElements(By.partialLinkText("Create"));
		//to count how many times create word comes
		System.out.println(list.size());  //size=4
		
		//to click on 2nd index of create(Create a Page)
		list.get(1).click();
		
		//to back window use navigate
		driver.navigate().back();
		
		//to print which words are comes related to create
		for(WebElement link:list) {
			System.out.println(link.getText()); //1.Create new account 2.Create a Page 3.Create ad 4.Create Page
			
			
		}
	}

}
