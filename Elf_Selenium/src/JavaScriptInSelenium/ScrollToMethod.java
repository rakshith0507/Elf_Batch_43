package JavaScriptInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToMethod {
	//scrollIntoView(boolean b)==>document in javascript
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//To scroll in Y direction
		/*driver.get("https://www.swiggy.com/");
		WebElement elementToBeScrolled = driver.findElement(By.linkText("Hassan"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", elementToBeScrolled);
		Thread.sleep(5000);
		//by using scroll to method
		js.executeScript("window.scrollTo(0,7952)");*/
		// TO scroll in X direction
		driver.get("https://www.album.alexflueras.ro/galleries/urban.html");
		WebElement elementToBeScrolled = driver.findElement(By.id("back"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", elementToBeScrolled);
		Thread.sleep(5000);
		//by using scroll to method
		js.executeScript("window.scrollTo(0,0)");
		
		
	}

}
