package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.DriverConnection;
	//W.A.J.Script for Locating links by linkText() and partialLinkText()
public class Q02 {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://www.facebook.com/";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		
		//partialLinkText()
		List<WebElement>list= driver.findElements(By.partialLinkText("Create"));
		list.get(2).click();
		Thread.sleep(3000);
		
		//to go back
		driver.navigate().back();
		
		//linktext()
		driver.findElement(By.linkText("Create new account")).click();
		

		
	}

}

