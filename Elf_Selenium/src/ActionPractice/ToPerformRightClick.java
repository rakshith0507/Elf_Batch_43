
package ActionPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToPerformRightClick {
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
	driver.findElement(By.xpath("//div[text()='Elf43']")).click();
	WebElement advancedSeleniumCard = driver.findElement(By.xpath("//span[text()='Advanced Selnium']"));
	Actions actions = new Actions(driver);
	actions.contextClick(advancedSeleniumCard).perform();
	List<WebElement> contextmenu = driver.findElements(By.xpath("//div[contains(@class,'quick-card-editor-buttons')]"));
	for(WebElement ele:contextmenu) {
		System.out.println(ele.getText());
		
	}
	
	
	
	
	
}
	
}
