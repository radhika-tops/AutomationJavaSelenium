package PracticePurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practiceform {
	public static void main (String[]args) throws InterruptedException {
		String url = "https://demoqa.com/automation-practice-form";
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\baps\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
		
		
		driver.findElement(By.id("firstName")).sendKeys("radhika");
		driver.findElement(By.id("lastName")).sendKeys("Patel");
		driver.findElement(By.id("userEmail")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();

		driver.findElement(By.id("userNumber")).sendKeys("9834774530");
}
}