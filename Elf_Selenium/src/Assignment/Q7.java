package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("D:\\Rakshith\\software\\Drivers\\Browser Drivers\\MultipleWindow.html");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(5000);
		driver.close();


	}

}
