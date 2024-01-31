package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.selenium.DriverConnection;

//W.A.J.script to register your self in Gmail.

public class Q05 {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://accounts.google.com/signup/v2/createaccount?theme=glif&flowName=GlifWebSignIn&flowEntry=SignUp";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		driver.findElement(By.name("firstName")).sendKeys("rsshmi");
		driver.findElement(By.name("lastName")).sendKeys("sshil");
		
		driver.findElement(By.xpath("//div[@class='dG5hZc']/div[1]/div[1]/div[1]/button[1]/span")).click();
		Thread.sleep(2000);
		
		
		
		String mainwindow = driver.getWindowHandle();
		System.out.println(mainwindow);
		
		
		Set<String> allwindow = driver.getWindowHandles();
		for(String win: allwindow) {
			System.out.println(win);
			if(!win.equals(mainwindow)) {
				driver.switchTo().window(win);
			}
		}
		

		
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
		month.selectByVisibleText("July");
		
		
		driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("28");
		
		driver.findElement(By.name("year")).sendKeys("2000");
		
		
//		WebElement iframe = driver.findElement(By.xpath("//body[@id='yDmH0d']/iframe[1]"));
//		System.out.println("frame fetched");
//		driver.switchTo().frame(iframe);
//		System.out.println("switched to frame");
//		Thread.sleep(2000);
		//*[@id="yDmH0d"]/iframe[1]
		
		//div[@class='resp-tabs-container']/div[1]/p/iframe
		
		driver.findElement(By.id("gender")).click();
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build()
		.perform();
		
//		WebElement genders = driver.findElement(By.id("//*[@id=\"gender\"]"));
//		Select gender = new Select(genders);
//		gender.selectByValue("2");
	
		
		driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();
		
	}
}
