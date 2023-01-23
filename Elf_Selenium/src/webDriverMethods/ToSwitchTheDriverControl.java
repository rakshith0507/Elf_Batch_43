package webDriverMethods;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriverControl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("D:\\Rakshith\\software\\Drivers\\Browser Drivers\\MultipleWindow.html");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(5000);
		String expectedPageTitle = "Original Italian Recipes - Giallozafferano Recipes";
		Set<String> allWindowsID = driver.getWindowHandles();
		for(String windowsID : allWindowsID) {
			driver.switchTo().window(windowsID);
			System.out.println(driver.getTitle());
			String actualPageTitle = driver.getTitle();
			if(expectedPageTitle.equals(actualPageTitle)) {
				driver.manage().window().maximize();
				break;
				
			}
			
		}
		driver.quit();
	}

}
