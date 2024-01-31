package PracticePurpose;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		
		//1.how to validate user input
//		String targetDate = "30-Feb-2023";
//		SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
//		//to show correct date because 30 th feb is wrong date so we using below code
//		try {
//			targetDateFormat.setLenient(false);
//			//convert my date using this format
//			Date formattedTargetDate = targetDateFormat.parse(targetDate);
//			System.out.println(formattedTargetDate);
//		} catch (ParseException e) {
//			throw new Exception("Invalid date is provided, pls check input date");
//		}
		
		
		
		
		
		
//		//2. Select a date in the current year and current month
//		//here verifying date
//		Calendar calendar = Calendar.getInstance();
//		String targetDate = "01-Aug-2023";
//		//if the date is valid then it will go to try block otherwise goes to catch block to create exception
//		SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
//		Date formattedTargetDate;
//		try {
//			//then parse the date
//			targetDateFormat.setLenient(false);
//			formattedTargetDate = targetDateFormat.parse(targetDate);
//			//and set it to calendar
//			calendar.setTime(formattedTargetDate);
//			
//			int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
//			int targetMonth = calendar.get(Calendar.MONTH);
//			int targetYear = calendar.get(Calendar.YEAR);
//			
//			
//			driver.findElement(By.id("second_date_picker")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();
//			
//		} catch (ParseException e) {
//			throw new Exception("Invalid date is provided, pls check input date");
//		}
//	
		
		
		
		//3. Select the past date
//		Calendar calendar = Calendar.getInstance();
//		String targetDate = "01-Aug-2005";
//		//if the date is valid then it will go to try block otherwise goes to catch block to create exception
//		SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
//		Date formattedTargetDate;
//		try {
//			//then parse the date
//			targetDateFormat.setLenient(false);
//			formattedTargetDate = targetDateFormat.parse(targetDate);
//			//and set it to calendar
//			calendar.setTime(formattedTargetDate);
//			
//			int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
//			int targetMonth = calendar.get(Calendar.MONTH);
//			int targetYear = calendar.get(Calendar.YEAR);
//			
//			
//			driver.findElement(By.id("second_date_picker")).click();
//			String actualDate = driver.findElement(By.className("ui-datepicker-title")).getText(); //august 2023
//			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
//			int actualMonth = calendar.get(Calendar.MONTH);
//			int actualYear = calendar.get(Calendar.YEAR);
//			
//			while(targetMonth<actualMonth || targetYear<actualYear) {
//				driver.findElement(By.className("ui-datepicker-prev")).click();
//				actualDate = driver.findElement(By.className("ui-datepicker-title")).getText(); //august 2023
//				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
//			    actualMonth = calendar.get(Calendar.MONTH);
//				actualYear = calendar.get(Calendar.YEAR);
//			}
//		
//
//			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();
//			
//		} catch (ParseException e) {
//			throw new Exception("Invalid date is provided, pls check input date");
//		}
		
		
		
		
		//4.Select the Future date
		Calendar calendar = Calendar.getInstance();
		String targetDate = "01-Aug-2031";
		//if the date is valid then it will go to try block otherwise goes to catch block to create exception
		SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date formattedTargetDate;
		try {
			//then parse the date
			targetDateFormat.setLenient(false);
			formattedTargetDate = targetDateFormat.parse(targetDate);
			//and set it to calendar
			calendar.setTime(formattedTargetDate);
			
			int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
			int targetMonth = calendar.get(Calendar.MONTH);
			int targetYear = calendar.get(Calendar.YEAR);
			
			
			driver.findElement(By.id("second_date_picker")).click();
			String actualDate = driver.findElement(By.className("ui-datepicker-title")).getText(); //august 2023
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
			int actualMonth = calendar.get(Calendar.MONTH);
			int actualYear = calendar.get(Calendar.YEAR);
			
			
			//chages required for future date
			while(targetMonth>actualMonth || targetYear>actualYear) {
				driver.findElement(By.className("ui-datepicker-next")).click();
				//then other data is same, because yo need to read information
				actualDate = driver.findElement(By.className("ui-datepicker-title")).getText(); //august 2023
				//you need to parse it
				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
			   //and then set it
				actualMonth = calendar.get(Calendar.MONTH);
				actualYear = calendar.get(Calendar.YEAR);
			}
		

			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();
			
		} catch (ParseException e) {
			throw new Exception("Invalid date is provided, pls check input date");
		}
		
		
		
		
		
		
		//5.
		
		
	}
}
