package PracticePurpose;

import org.openqa.selenium.WebDriver;

import Assignment.DriverConnection;

public class P02Navigation {
		public static void main(String[] args) {
			
			String url ="https://www.snapdeal.com/";
			WebDriver driver = new DriverConnection().getConnection(url);
			driver.navigate().to("https://www.amazon.in/");
			
			driver.navigate().back();  //snapdeal
			driver.navigate().forward();  //amazon
			
			driver.navigate().refresh();  //refresh/reload the page
		}
}