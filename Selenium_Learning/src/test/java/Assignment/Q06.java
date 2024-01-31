package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
//W.A.J. Script To perform the radio button to select one by one in loop
public class Q06 {
		public static void main(String[] args) throws InterruptedException {
			String url = "https://demo.guru99.com/test/radio.html";
			WebDriver driver = new DriverConnection().getConnection(url);
			
		
			List<WebElement> radioOption = driver.findElements(By.name("webform"));
			for(WebElement option:radioOption)
			{
				String name = option.getText();
				System.out.println(name);

			}
			radioOption.get(0).click();
			
			//selecting second option
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"vfb-7-2\"]")).click();
		
			
			//selecting third option
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"vfb-7-3\"]")).click();
		}

}
