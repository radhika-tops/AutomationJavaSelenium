package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P004DynamicWebTable {
	public static void main(String[] args) {
		String url = "https://cosmocode.io/automation-practice-webtable/";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		//to print row size
		System.out.println(rows.size());
		for(int i=1;i<=rows.size();i++) {
			
			List<WebElement> col = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td"));
		//to print data from table	
		for(int j=2;j<=col.size();j++)	{
			List<WebElement> data = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td["+j+"]"));
			for(WebElement d: data) {
				System.out.print(d.getText()+"|| ");
			}
		}
		System.out.println();
		

		}
		
	}
}
