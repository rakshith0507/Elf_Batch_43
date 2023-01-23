package ActionPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToMOveTheMouseCursorOnAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.reliancedigital.in/");
	driver.findElement(By.xpath("//button[text()='No, don’t.']")).click();
	WebElement camera = driver.findElement(By.xpath("//div[text()='Cameras']"));
	Actions actions = new Actions(driver);
	
	//actions.moveToElement(camera).perform();
	//actions.moveToElement(camera, -140, 0).perform();
	actions.moveByOffset(474, 108).perform();
	
	
	

	}

}
