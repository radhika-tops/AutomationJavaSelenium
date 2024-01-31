package PracticePurpose;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.DriverConnection;

public class SimpleAlret {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://testautomationpractice.blogspot.com/";
		WebDriver driver= new DriverConnection().getConnection(url);
		
		
		driver.findElement(By.xpath("//div[@class='columns-inner']/div[3]/div[1]/aside/div[1]/div[3]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();   //closes alert window using ok button
		
		//another way to close alert window
//		alert.dismiss();  // closes alert by using cancel button
		
	}

	
}
