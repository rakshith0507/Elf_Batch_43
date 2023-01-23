package Dropdowns;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime systemDateTime = LocalDateTime.now().plusMonths(6);
		String monthName = systemDateTime.getMonth().name();
		int year = systemDateTime.getYear();
		int day = systemDateTime.getDayOfMonth();
		
		String month = ""+monthName.charAt(0)+monthName.substring(1,monthName.length()).toLowerCase();
		System.out.println(month);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 20);
		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.makemytrip.com/");
		actions.click().perform();
		WebElement elementToBeScrolled = driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		js.executeScript("arguments[0].scrollIntoView(true)", elementToBeScrolled);
		driver.findElement(By.xpath("//span[text()='DEPARTURE']/..")).click();
//		 WebElement selectDate = driver.findElement(By.xpath("//div[text()='"+month+" "+year+ "']/../..//p[text()='"+day+"']"));
//		
//		 selectDate.click();

		for(;;) {
			   try {
				   driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+day+"']")).click();
				   break;
			   }
			   catch(Exception e) {
				   driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			   }
		}	

	}

}
