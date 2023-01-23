package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementUsingID {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("rakshith");
		driver.findElement(By.id("Password")).sendKeys("password@123");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("pass")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}

