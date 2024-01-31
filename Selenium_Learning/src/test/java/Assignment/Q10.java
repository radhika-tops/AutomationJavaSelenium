package Assignment;
//W.A.J. Script How to handled Alert in selenium

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.DriverConnection;

public class Q10 {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/test/delete_customer.php";
		WebDriver driver= new DriverConnection().getConnection(url);
		
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		
		
		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();   //closes alert window using ok button
//		
//		
//		Alert alertt = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alertt.accept();
		
		//another way to close alert window
		alert.dismiss();  // closes alert by using cancel button
		System.out.println("alert cancel");
		
		
	}
}
