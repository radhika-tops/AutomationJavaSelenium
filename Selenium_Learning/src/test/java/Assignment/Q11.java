package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.DriverConnection;

public class Q11 {
	public static void main(String[] args) {
		String url = "https://demo.guru99.com/test/web-table-element.php";
		WebDriver driver= new DriverConnection().getConnection(url);
		
		 //Using tagname with anchor
	      List<WebElement> links = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
	      System.out.println("The number of links is " + links.size());
	     // driver.close();
	}

}
