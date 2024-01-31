package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//1.Mouse Hover Event
public class Q09MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		WebElement home = driver.findElement(By.className("mouseOut"));
		WebElement flights = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[1]"));
		WebElement hotels = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[1]"));
		WebElement carrentals = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[1]"));
		WebElement cruise = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td[1]"));
		WebElement Desti = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[6]/td[1]"));
		WebElement Vacat = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[7]/td[1]"));
	
		
		Actions action = new Actions(driver);
		action.moveToElement(home).build().perform();
		action.moveToElement(flights).build().perform();
		action.moveToElement(hotels).build().perform();
		action.moveToElement(carrentals).build().perform();
		action.moveToElement(cruise).build().perform();
		action.moveToElement(Desti).build().perform();
		action.moveToElement(Vacat).build().perform();

		Thread.sleep(3000);
		
		driver.close();
		
	}

}
