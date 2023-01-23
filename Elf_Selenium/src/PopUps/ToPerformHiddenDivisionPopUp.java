package PopUps;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformHiddenDivisionPopUp {
	public static void main(String[] args) {
		LocalDateTime systemsDateTime = LocalDateTime.now().plusMonths(5);
		String monthName = systemsDateTime.getMonth().name();
		int year = systemsDateTime.getYear();
		int day = systemsDateTime.getDayOfMonth();
		String month = ""+ monthName.charAt(0)+monthName.substring(1,monthName.length()).toLowerCase();
		System.out.println(month);

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("https://www.makemytrip.com/");
		actions.click().perform();
		//		WebElement elementToBeScrolled = driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		//		js.executeScript("arguments[0].scrollIntoView(true)", elementToBeScrolled);
		driver.findElement(By.xpath("//label[@for='departure']")).click();

		//driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+day+"']")).click();

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
