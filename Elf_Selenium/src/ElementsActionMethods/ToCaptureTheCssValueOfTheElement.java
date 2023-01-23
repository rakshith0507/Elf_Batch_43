package ElementsActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheCssValueOfTheElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		System.out.println(loginButton.getCssValue("color"));
		System.out.println(loginButton.getCssValue("border-radius"));
		System.out.println(loginButton.getCssValue("height"));
		System.out.println(loginButton.getCssValue("font-size"));
		System.out.println(loginButton.getCssValue("border"));
		driver.quit();

	}

}
