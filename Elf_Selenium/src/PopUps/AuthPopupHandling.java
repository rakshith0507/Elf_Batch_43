package PopUps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopupHandling {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Runtime.getRuntime().exec("./AutoItProgramme/auth.exe");
		//wait.until(ExpectedConditions.titleIs("Basic Auth"));
		driver.quit();
	}


}
