package Basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenshots {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempScreenshot = ts.getScreenshotAs(OutputType.FILE);
		File targetScreenshot = new File("./errorShots/snap.png");
		FileHandler.copy(tempScreenshot, targetScreenshot);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id='loginclose1']")).getScreenshotAs(OutputType.FILE);
		File targetScreenshot1 = new File("./errorShots/snap1.png");
		FileHandler.copy(tempScreenshot, targetScreenshot1);
		

	}

}
