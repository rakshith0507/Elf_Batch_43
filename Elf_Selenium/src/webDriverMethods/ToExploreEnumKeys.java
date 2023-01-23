package webDriverMethods;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreEnumKeys {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fireflink.com/");
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("rakshith",
				Keys.CONTROL + "A");
		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys(Keys.CONTROL + "c");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(Keys.CONTROL + "v");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']/..//span")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
