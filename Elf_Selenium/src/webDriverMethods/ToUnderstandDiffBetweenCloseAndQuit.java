package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Iterable;
import java.util.Set;

public class ToUnderstandDiffBetweenCloseAndQuit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("D:\\Rakshith\\software\\Drivers\\Browser Drivers\\MultipleWindow.html");
		driver.findElement(By.xpath("//input[@type=\"button\"]")).click();
		Thread.sleep(2000);
		Set<String> allWindowsID = driver.getWindowHandles();
		System.out.println("size of the set " + allWindowsID.size());
		for(String windowsID :allWindowsID ) {
			System.out.println(windowsID);
			driver.quit();
		}



	}

}
