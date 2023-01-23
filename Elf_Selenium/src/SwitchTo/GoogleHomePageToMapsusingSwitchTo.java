package SwitchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePageToMapsusingSwitchTo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
	
	WebElement frameElement = driver.findElement(By.xpath("(//iframe[@role='presentation'])[2]"));
	driver.switchTo().frame(frameElement);
	Thread.sleep(2000);
	WebElement maps = driver.findElement(By.xpath("//span[text()='Maps']"));
	maps.click();
	Thread.sleep(2000);
	driver.quit();
	
}
}
