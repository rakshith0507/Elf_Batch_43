package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("D:\\Rakshith\\software\\Drivers\\Browser Drivers\\MultipleWindow.html");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='button']")).click();
	Thread.sleep(5000);
	String expectedPageTitle = "Multiple popups";
	Set<String> allWindowsID = driver.getWindowHandles();
	for (String windowsID : allWindowsID) {
		driver.switchTo().window(windowsID);
		String actualPageTitle = driver.getTitle();
		if (!(expectedPageTitle.equals(actualPageTitle))) {
			driver.manage().window().maximize();
			driver.close();

		}

	}
	
	Thread.sleep(5000);
	driver.quit();
	
}
	
}