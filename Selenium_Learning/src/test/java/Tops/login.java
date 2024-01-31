package Tops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Assignment.DriverConnection;

public class login {
	
		static WebDriver driver;
	        @BeforeClass
	        public void openBrowser() { 
	        driver = new DriverConnection().getConnection("https://careercenter.tops-int.com/");
	       // driver.get("https://careercenter.tops-int.com/");
	        }
	        @Test(dataProvider = "dp")
	        public void login(String mobile, String password) throws InterruptedException {
	        WebElement num = driver.findElement(By.id("mobile"));
	        num.clear();
	        num.sendKeys(mobile);
	        WebElement pswd = driver.findElement(By.id("password"));
	        pswd.clear();
	        pswd.sendKeys(password);
	        Thread.sleep(2000);
	        WebElement login = driver.findElement(By.xpath("//form[@id='loginForm']/div[3]/input"));
	        login.click();	        
	        }
	        @DataProvider(name = "dp")
	        public Object[][] dpmethod(){
	        Object o [][] = new Object [4][2];
	        
	        o[0][0] = "123456789";
	        o[0][1]	 = "123456789";
	        
	        o[1][0] = "Sara";
	        o[1][1]	 = "Sara";
	        
	        o[2][0] = "123456789";
	        o[2][1]	 = "Sara";
	        
	        o[3][0] = "7041480673";
	        o[3][1]	 = "7041480673";
	        return o;
	        }

}
