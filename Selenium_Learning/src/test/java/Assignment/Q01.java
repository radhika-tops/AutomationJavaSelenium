package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.DriverConnection;

public class Q01 {
	public static void main(String[] args) {

		String url = "https://phptravels.com/demo/";
		WebDriver driver= new DriverConnection().getConnection(url);
		driver.findElement(By.name("first_name")).sendKeys("namrata");
		driver.findElement(By.name("last_name")).sendKeys("sharma");
		driver.findElement(By.name("business_name")).sendKeys("abc");
		driver.findElement(By.name("email")).sendKeys("abc1283@gmail.com");

		
			
		
		WebElement num1 = driver.findElement(By.id("numb1"));
		//By default value of driver function is string
		String s1 = num1.getText();
		//then we need to convert value from string to int because int value mentioned in website
		int n1 = Integer.parseInt(s1);
		
		WebElement num2 = driver.findElement(By.id("numb2"));
		//By default value of driver function is string
		String s2 = num2.getText();
		//then we need to convert value from string to int because int value mentioned in website
		int n2 = Integer.parseInt(s2);
		int n3 = n1+n2;
		
		//convert int value to string to show value , because by default value is string so we need to convert again.
		String s3 = String.valueOf(n3);
		WebElement result = driver.findElement(By.id("number"));
		result.sendKeys(s3);
		
		//to click on submit button
		WebElement ele = driver.findElement(By.id("demo"));
		ele.click();
		
	}
	
}
