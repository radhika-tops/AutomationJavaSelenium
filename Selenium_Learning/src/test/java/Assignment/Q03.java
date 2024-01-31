package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.selenium.DriverConnection;
		//W.A.J.Script for Selecting multiple items in a drop dropdown
public class Q03 {
		public static void main(String[] args) throws InterruptedException {
			String url = "https://demoqa.com/select-menu";
			WebDriver driver = new DriverConnection().getConnection(url);
			

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)");
			Thread.sleep(2000);
			
			
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]"));
			ele.click();
		
			
			Actions action = new Actions(driver);
			
			
			action.keyDown(Keys.ARROW_DOWN)
			    .sendKeys(Keys.ENTER)
		    	.keyDown(Keys.ARROW_DOWN)
		    	.sendKeys(Keys.ENTER)
		    	.keyDown(Keys.ARROW_DOWN)
		    	.sendKeys(Keys.ENTER)
		    	.keyDown(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
			
			
			WebElement element = driver.findElement(By.id("cars"));
			Select select = new Select (element);
			
			
			select.selectByIndex(0);
			select.selectByIndex(1);
			select.selectByIndex(3);
			
			
			//to print or return the selected value
					List<WebElement> listofoptions = select.getAllSelectedOptions();			//returns all selected value
						
					
					for(WebElement obj : listofoptions ) {
						System.out.println(obj.getText());
					}
}
}
