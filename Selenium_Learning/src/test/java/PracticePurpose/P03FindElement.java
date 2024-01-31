package PracticePurpose;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Assignment.DriverConnection;

public class P03FindElement {
	public static void main(String[] args) {
		String url = "https://demo.nopcommerce.com/register?returnUrl=%2F";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		
		//findElement() ----->Return the Single WebElement
		
		//1.
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("XYXZZ");
		
		//2.
		WebElement ele = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(ele.getText());
		
		//3.
		WebElement searchButton = driver.findElement(By.xpath("//button[normalize-space()='Search']"));
		
		
		//findElements()  ----->Returns multiple WebElement
		
		//1.
		List<WebElement>links =driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Number of elements captured: "+links.size());  
		
		for(WebElement ele1:links)
		{
			System.out.println(ele1.getText());
		}
		
		//2.
		List<WebElement>logo =driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.size());  
		
		//3 
		List<WebElement> elements= driver.findElements(By.xpath("(//a[normalize-space()='Electronics'])[2]"));
		System.out.println(elements.size());  //0
	}

}
