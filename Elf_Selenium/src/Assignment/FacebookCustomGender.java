package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCustomGender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php?r=101");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement disableElement = driver.findElement(By.name("custom_gender"));
		js.executeScript("arguments[0].value='It is valid';",disableElement);
		disableElement.findElement(By.xpath("//label[text()='Custom']")).click();


	}

}
