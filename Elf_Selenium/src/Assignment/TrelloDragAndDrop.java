package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloDragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://trello.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("user")).sendKeys("playstoretyss@gmail.com");
		driver.findElement(By.xpath("//input[@id='login']")).submit();
		
		WebDriverWait expicitwait = new WebDriverWait(driver, 20);
		expicitwait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));
		WebElement passwordtextfield = driver.findElement(By.id("password"));
		passwordtextfield.sendKeys("Password@123");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[text()='Java']")).click();
		WebElement manualTesting = driver.findElement(By.xpath("//textarea[text()='Manual Testing']"));
		WebElement java = driver.findElement(By.xpath("//textarea[text()='Java']"));
		WebElement selenium = driver.findElement(By.xpath("//textarea[text()='Selenium']"));
		WebElement mockStatus = driver.findElement(By.xpath("//textarea[text()='Mock Status']"));
		WebElement mockScheduled = driver.findElement(By.xpath("//span[text()='Mock Scheduled']"));
		WebElement mockComplete = driver.findElement(By.xpath("//span[text()='Mock Complete']"));
		WebElement mockPending = driver.findElement(By.xpath("//span[text()='Mock Pending']"));
		driver.findElement(By.xpath("//button[@aria-label='Workspace navigation']")).click();
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(mockScheduled, selenium).perform();
		actions.dragAndDrop(mockComplete, manualTesting).perform();
		//actions.dragAndDrop(mockScheduled, manualTesting);
		actions.dragAndDrop(mockPending, manualTesting).perform();
		
		
	}

}
