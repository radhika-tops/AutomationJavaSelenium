package PracticePurpose;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.DriverConnection;

//selectByVisibleText()
//selectByValue
//selectByIndex
public class P05Dropdown {
	public static void main(String[] args) {
		String url = "https://www.globalsqa.com/demo-site/select-dropdown-menu/";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		WebElement drpCountryEle =driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		
		////selectByVisibleText()
		Select drpCountry = new Select(drpCountryEle);
		drpCountry.selectByVisibleText("Anguilla");
		
		//selectByValue
		Select drpCountry1 = new Select(drpCountryEle);
		drpCountry1.selectByValue("GUF");
		
		//selectByIndex
		Select drpCountry2 = new Select(drpCountryEle);
		drpCountry2.selectByIndex(13);
		
		
		
		//selecting option from dropdown without using methods
		
		List<WebElement>alloptions=drpCountry.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Cuba"))
			{
				option.click();
				break;
			}
		}
		
	}
}
