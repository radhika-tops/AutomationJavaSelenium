package PracticePurpose;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.selenium.DriverConnection;

public class MultiSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
	
	String url = "https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html?m=1";
	WebDriver driver = new DriverConnection().getConnection(url);
	
//1.The select dropdown			
	
/*			WebElement ele = driver.findElement(By.id("mySelect"));
	Select select = new Select (ele);
	
	
//	//1.selection technique
//	//select.selectByIndex(2);
	
	
	//2. other techniques for select
	select.selectByVisibleText("Orange");
	
	//this helps to print message and run also
	System.out.println(select.getFirstSelectedOption().getText()); //returns selcted value
	//select.getFirstSelectedOption().getText();
*/		
	
	
//The Multi Select Element			
	//Multidropdown
	
	WebElement ele = driver.findElement(By.id("cars"));
	Select select = new Select (ele);
	
	
	select.selectByIndex(0);
	select.selectByIndex(1);
	select.selectByIndex(3);
	
//how to print or return the selected value
List<WebElement> listofoptions = select.getAllSelectedOptions();			//returns all selected value
	

for(WebElement obj : listofoptions ) {
	System.out.println(obj.getText());
}
}
}
