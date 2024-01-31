package PracticePurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.DriverConnection;

public class P04getTextVsgetAttributeValue {
	//difference between getText() and getAttribute(value)in selenium
	//1. getText()method returns the innerText of an element.
	//2. The getAttribute()method fetches the text contained by an attribute in an html document.	
	
	
		public static void main(String[] args) {
			String url ="https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
			WebDriver driver = new DriverConnection().getConnection(url);
			
			WebElement emailinputbox = driver.findElement(By.id("Email"));
			
//			emailinputbox.clear();  // cleared previous data
//			emailinputbox.sendKeys("absdim23@gmail.com");  //inserting new data
			
			
			//to capture the text/value from inputbox
			System.out.println("Result from getAttribute()method: "+ emailinputbox.getAttribute("value"));
			//another way to print text but not return value so getattribute is correct method to return text
			System.out.println("Result from getText()method: "+ emailinputbox.getText());
			
			//login button
			
			WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
			
			System.out.println(button.getAttribute("type"));
			System.out.println(button.getAttribute("class"));
			
			System.out.println(button.getText());
			
			String title = driver.findElement(By.xpath("//div[@class='page-title'] //h1")).getText();
			System.out.println(title);
			
		}
}
