package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelExecutionOfDemoWorkShop {
	@Parameters("CrossBrowser")

	@Test
	public void DemoWeb(@Optional("Opera") String bname) {
		WebDriver driver = null;
		if (bname.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (bname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/register");
		String tittle = driver.getTitle();
		Reporter.log(tittle, true);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("sudarshan");
		driver.findElement(By.id("LastName")).sendKeys("cm");
		driver.findElement(By.id("Email")).sendKeys("abc1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Testing@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Testing@123");
		driver.findElement(By.id("register-button")).click();
		driver.quit();

	}
}
