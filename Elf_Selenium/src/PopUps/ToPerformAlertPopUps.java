package PopUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToPerformAlertPopUps {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 20);
		driver.get("https://licindia.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			driver.findElement(By.linkText("Agents Portal")).click();
		} catch (Exception e) {
			WebElement elementToBeScrolled = driver.findElement(By.linkText("Download Our free App"));
			js.executeScript("arguments[0].scrollIntoView(true)", elementToBeScrolled);
			driver.findElement(By.linkText("Agents Portal")).click();

		}

		Alert popUpAlert = driver.switchTo().alert();
		System.out.println(popUpAlert.getText());
		popUpAlert.accept();
		String parentId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentId);
		for (String windowId : allWindowId) {
			driver.switchTo().window(windowId);
		}

		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Locators']")));
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		signIn.click();
		System.out.println(driver.findElement(By.xpath("(//div[contains(@data-ref,'errorEl')])[3]")).getText());

	}

}
