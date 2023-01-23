package ElementsActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearTheContentInTextAreas {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("rakshith");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("password@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}

}
