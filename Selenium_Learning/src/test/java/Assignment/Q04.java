package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.DriverConnection;

//W.A.J. script to use different methods to manage the windows-alerts and pop ups.

public class Q04 {
		public static void main(String[] args) throws InterruptedException {
			String url = "https://nxtgenaiacademy.com/alertandpopup/";
			WebDriver driver= new DriverConnection().getConnection(url);

			
			
		//1.	Simple Alert

			driver.findElement(By.name("alertbox")).click();
			Thread.sleep(2000);
			
			//switch to alert window and accept the alert
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
			Thread.sleep(3000);
			
			
		//2. Confirm Alert 
			driver.findElement(By.name("confirmalertbox")).click();
            Thread.sleep(2000);
			
			//switch to alert window and accept the alert
			Alert alert1 = driver.switchTo().alert();
			//alert1.accept();   //closes alert window using ok button
			
			alert1.dismiss(); //closes alert window using cancel button
			Thread.sleep(3000);
			
		//3. Promt Alert
			driver.findElement(By.name("promptalertbox1234")).click();
            Thread.sleep(2000);
			
          //switch to alert window and accept the alert
			Alert alert2 = driver.switchTo().alert();
			Thread.sleep(2000);
			alert2.sendKeys("Yes");
			alert2.accept(); 
		
		}
}
