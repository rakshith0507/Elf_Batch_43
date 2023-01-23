package Assignment;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ViaAssignment {
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime SystemDateTime = LocalDateTime.now().plusDays(4).plusMonths(2);
		String monthName = SystemDateTime.getMonth().name();
		int year = SystemDateTime.getYear();
		int day = SystemDateTime.getDayOfMonth();
		String month = "" + monthName.charAt(0)+ monthName.substring(1, monthName.length()).toLowerCase().substring(0, 2);
		System.out.println(monthName.charAt(0) + monthName.substring(1, monthName.length()).toLowerCase().substring(0, 2));

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions action=new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://in.via.com/");
		driver.findElement(By.id("wzrk-cancel")).click();
		WebElement from = driver.findElement(By.id("source"));
		from.sendKeys("Bangalore,Bangalore");
		action.click(from);
		WebElement To = driver.findElement(By.id("destination"));
		To.sendKeys("Delhi,Delhi");
		action.click(To);
		driver.findElement(By.id("departure")).click();

		driver.findElement(By.xpath("//span[contains(text(),' " + year + "')]/../..//div[text()='" + day + "']")).click();
		Thread.sleep(2000);
		WebElement returns = driver.findElement(By.id("return"));
		js.executeScript("arguments[0].click();", returns);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@style='text-align: right;'])[4]")).click();
		driver.findElement(By.xpath("//span[text()='" + month + "']/../../..//span[contains(text(),' " + year+ "')]/../..//div[text()='" + day + "']")).click();
		WebElement plus = driver.findElement(By.xpath("//div[@class='plus']"));
		action.click(plus).click(plus).perform();
		driver.findElement(By.id("search-flight-btn")).click();
	}

}
