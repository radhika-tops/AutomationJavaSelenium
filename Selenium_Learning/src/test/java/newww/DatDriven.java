package newww;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelFileReader.DriverConnection;



public class DatDriven {
	
	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		driver = new DriverConnection().getConnection("http://www.facebook.com");


	}
	@Test (dataProvider = "dp")
	public void logintest(String email, String pass) throws InterruptedException
	{
		System.out.println(email + " " + pass);
		WebElement username = driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys(email);
		WebElement password = driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(pass);
		Thread.sleep(3000);
		
	}
	@DataProvider(name="dp")
	public static Object[][] data()
	{
		ExcelReader ex = new ExcelReader("C:\\Users\\baps\\Desktop\\practice- Copy.xlsx", "login");
		int row = ex.rowcount();
		System.out.println("row : "+row);
		int col = ex.colcount();
		System.out.println("col : "+col);

		Object obj[][] = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				String data = ex.getData(i, j);
				obj[i - 1][j] = data;
			}
		}
		return obj;
	}
}
