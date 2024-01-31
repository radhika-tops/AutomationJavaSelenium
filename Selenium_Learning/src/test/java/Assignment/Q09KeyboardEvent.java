package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Q09KeyboardEvent {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://text-compare.com/";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		//scroll event
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		
		
		WebElement input1=driver.findElement(By.id("inputText1"));
		WebElement input2=driver.findElement(By.id("inputText2"));
		
		input1.sendKeys("Hello Prachi... Have a good day!");
		
		
		Actions action = new Actions(driver);
		
		//CTRL + A
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		//CTRL+ C

		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
    	//using right click
		action.contextClick(input1).build().perform();

		
		
		//pressing TAB key- shift to input2 box
		action.sendKeys(Keys.TAB);
		action.perform();
		
		//using right click
				action.contextClick(input2).build().perform();
				
			//	action.sendKeys("v").click();
		
		//CTRL+ V

		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		//compare texts
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
			System.out.println("Text Copied");
		else
			System.out.println("Text not copied");
		
	}
}


