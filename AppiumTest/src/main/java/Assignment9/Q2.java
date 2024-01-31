package Assignment9;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class Q2 {
	static AppiumDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		try {
			openGeneralStore();

		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void openGeneralStore() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus Nord CE 2");
		cap.setCapability("udid", "BQAA8DPBXOPZTGBY");
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		cap.setCapability("app", "C:\\Users\\baps\\Downloads\\General-Store.apk");
		

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Thread.sleep(2000);
		 driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Algeria\"]")).click();
		 driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Dipam");
		 //driver.findElement(AppiumBy.accessibilityId("text")).click();
		// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
}
}
