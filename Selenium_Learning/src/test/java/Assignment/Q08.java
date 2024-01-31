package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//W.A.J.Script To write a script for drop down.

public class Q08 {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		driver.findElement(By.name("firstName")).sendKeys("Sakshi");
		driver.findElement(By.name("lastName")).sendKeys("Jain");
		driver.findElement(By.name("phone")).sendKeys("9078990652");
		driver.findElement(By.id("userName")).sendKeys("xysss23@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("278 gamufdfjk safugk");
		driver.findElement(By.name("city")).sendKeys("NewJersey");
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");


		
		driver.findElement(By.name("state")).sendKeys("America");
		
		driver.findElement(By.name("postalCode")).sendKeys("08405");
		
		WebElement countries = driver.findElement(By.name("country"));
		Select country = new Select (countries);
		country.selectByValue("UNITED STATES");
		
		
	
		
	}

}
