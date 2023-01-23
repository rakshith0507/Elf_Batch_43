package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:\\Rakshith\\software\\Drivers\\Browser Drivers\\MultipleWindow.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(5000);
		String expectedPageTitle = "#1 buffet grill barbeque restaurant near you. Exciting Offers on lunch dinner with our trademark. | Barbeque Nation";
		Set<String> allWindowsID = driver.getWindowHandles();
		for (String windowsID : allWindowsID) {
			driver.switchTo().window(windowsID);
			String actualPageTitle = driver.getTitle();
			if (expectedPageTitle.equals(actualPageTitle)) {
				driver.manage().window().maximize();
				break;

			}

		}
		driver.close();
		Thread.sleep(5000);
		driver.quit();

	}

}
