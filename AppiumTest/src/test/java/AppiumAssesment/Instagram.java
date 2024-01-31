package AppiumAssesment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Instagram {
	static AppiumDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		try {
			openinstagram();

		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
}
	public static void opencalculator() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus Nord CE 2");
		cap.setCapability("udid", "BQAA8DPBXOPZTGBY");
		// cap.setCapability("udid", "BQAA8DPBXOPZTGBY-fbkdpY._adb-tls-connect._tcp");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		cap.setCapability("appPackage", "uk.co.aifactory.chessfree");
		cap.setCapability("appActivity", "uk.co.aifactory.chessfree.ChessFreeActivity");
		//cap.setCapability("appPackage", "com.oneplus.calculator");
		//cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");
		cap.setCapability("automationName", "UiAutomator2");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"uk.co.aifactory.chessfree:id/YesButton]")).click();
		// Thread.sleep(1000);
//		driver.findElement(By.id("com.oneplus.calculator:id/digit_8")).click();
//		 Thread.sleep(1000);
//		driver.findElement(By.id("com.oneplus.calculator:id/digit_5")).click();
//		 Thread.sleep(1000);
//		driver.findElement(By.id("com.oneplus.calculator:id/op_add")).click();
		// Thread.sleep(1000);
//		driver.findElement(By.id("com.android.bbkcalculator:id/digit7")).click();
		// Thread.sleep(1000);
//		driver.findElement(By.id("com.android.bbkcalculator:id/digit3")).click();
		Thread.sleep(1000);
//		driver.findElement(By.id("com.android.bbkcalculator:id/equal")).click();

		// Thread.sleep(1000);

//		String value = driver.findElement(By.id("com.oneplus.calculator:id/formula")).getText();
//		System.out.println("My Output is... " + value);

	}
}