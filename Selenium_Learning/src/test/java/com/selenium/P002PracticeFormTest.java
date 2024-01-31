package com.selenium;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class P002PracticeFormTest {
	

	public static void main (String[]args) throws InterruptedException {
		String url = "https://demoqa.com/automation-practice-form";
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
		WebDriver driver = new DriverConnection().getConnection(url);
		//Thread.sleep(2000);
		
		
		driver.findElement(By.id("firstName")).sendKeys("radhika");
		driver.findElement(By.id("lastName")).sendKeys("Patel");
		driver.findElement(By.id("userEmail")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();

		driver.findElement(By.id("userNumber")).sendKeys("9834774530");
		
		WebElement datepick = driver.findElement(By.id("dateOfBirthInput"));
		datepick.click();
		
		
		WebElement months = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select month = new Select(months);
		month.selectByValue("9");
		
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[5]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		
		driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]")).sendKeys("English");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.sendKeys(Keys.TAB)
		.build()
		.perform();
		
		//Thread.sleep(3000);
		//(//label[normalize-space()='Sports'])[1]
				//div[@id='hobbiesWrapper']/div[2]/div[1]
		List<WebElement> hobbies = driver.findElements(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]"));
		for(WebElement h:hobbies) {
			String name = h.getText();
			System.out.println(name);

		}
		hobbies.get(0).click();
		
		
		WebElement button = driver.findElement(By.id("uploadPicture"));
		button.sendKeys("C:\\Users\\baps\\Downloads\\Untitled Diagram (3).drawio");
		
		
		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Hello Selenium");
		
		
		WebElement elee = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]"));
		elee.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//date of birth with drop down button
//				WebElement dates= driver.findElement(By.id("day"));
//				Select date = new Select(dates);
//				date.selectByIndex(24);
//				
//				WebElement months = driver.findElement(By.id("month"));
//				Select month = new Select(months);
//				month.selectByValue("9");
//				
//				WebElement years = driver.findElement(By.id("year"));
//				Select year = new Select(years);
//				year.selectByVisibleText("1999");
		
		//driver.findElement(By.id("subjectsContainer")).sendKeys("Maths");
	//	driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("Maths");
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
		
	}
}
