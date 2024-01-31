package PracticePurpose;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.DriverConnection;

public class IconTriggerCalender {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = new DriverConnection().getConnection(url);
		driver.findElement(By.id("Icon Trigger")).click();
		Thread.sleep(2000);
		
		WebElement iframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[3]/p/iframe"));
		System.out.println("frame fetched");
		driver.switchTo().frame(iframe);
		System.out.println("switched to frame");
		Thread.sleep(2000);
		
		WebElement icontrig= driver.findElement(By.className("ui-datepicker-trigger"));
		icontrig.click();
		Thread.sleep(2000);
		
		String myDate = "25";
		String myMonth = "August";
		String myYear = "1997";
		String currentyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		//using parse because, to convert string value into int because by default value is string
		int y1 = Integer.parseInt(myYear);
		int y2 = Integer.parseInt(currentyear);
		
		while(!myYear.equals(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText())) {
			if(y1>y2) {
				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
				
			}
			else {
				driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
			}
		}
		while(!myMonth.equals(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText())) {
			if(y1>y2) {
				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
			}
			else {
				driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
			}
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]/a")).click();
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement date : dates) {
			String d = date.getText();
			System.out.println(d+" / "+myMonth+" / "+myYear);
			if(d.equals(myDate)) {
				date.click();
		
	}
	}
	}
}
	
