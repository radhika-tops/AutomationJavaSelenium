package PracticePurpose;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.selenium.DriverConnection;

public class FbScreenShot {
	public static void getScreenshot(WebDriver driver, String path) {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			FileUtils.copyFile(source, dest);;
			System.out.println("ss taken");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = new DriverConnection().getConnection(url);
		Thread.sleep(2000);
		System.out.println("method called");
		
		driver.findElement(By.id("email")).sendKeys("a b c @ gmail");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		getScreenshot(driver, "C:\\Users\\baps\\Downloads\\Scrreenshot\\FBssc.png");
		System.out.println("done");
		Thread.sleep(2000);
		driver.close();
}
}
