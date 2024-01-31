package PracticePurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Assignment.DriverConnection;
//isDisplayed  , isEnabled   , isSelected
public class P01 {
	public static void main(String[] args) {
		String url = "https://demo.nopcommerce.com/register?returnUrl=%2F";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		//1. isDisplayed()  2. isEnabled()
		
		WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display Status: "+searchStore.isDisplayed());   //true, because its displayed
		System.out.println("Enabled Status: "+searchStore.isEnabled());     //true, because its enabled
		
		
		//3. isSelected()
		
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		
		female.click();  //selects female radio button
		System.out.println(male.isSelected());     //false
		System.out.println(female.isSelected());  //true because selected
		
		
		male.click();   //selects male radio button
		System.out.println(male.isSelected());   //true because selected
		System.out.println(female.isSelected());  //false
		
		
	}

}
