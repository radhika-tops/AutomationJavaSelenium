package PracticePurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.DriverConnection;

public class DropDownCalender {
	public static void main(String[] args) throws InterruptedException {
        String url = "https://www.globalsqa.com/demo-site/datepicker/";
		   WebDriver driver = new DriverConnection().getConnection(url);
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,150)");
		   driver.findElement(By.id("DropDown DatePicker")).click();
		   Thread.sleep(2000);
		   WebElement iframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[2]/p/iframe"));
		   driver.switchTo().frame(iframe);
		   Thread.sleep(2000);
		   WebElement datepick = driver.findElement(By.xpath("//*[@id='datepicker']"));
		   datepick.click();
		   
		   WebElement years = driver.findElement(By.className("ui-datepicker-year"));
		   Select year = new Select(years);
		   year.selectByVisibleText("2013");
		   
		   WebElement months = driver.findElement(By.className("ui-datepicker-month"));
		   Select month = new Select(months);
		   month.selectByIndex(4);
		   
		   WebElement dates = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td[4]"));
		   dates.click();
	}
}
