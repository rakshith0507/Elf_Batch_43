package AssertionPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class actitimeLogin {
	@Test

	public void actitimeAssertion() {
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		String landingPageExpectedTitle = "actiTIME - Login";
		String homePageExpectedTitle = "actiTIME -  Enter Time-Track";
		String userName = "admin";
		String password = "manager";
		
		driver.get("https://demo.actitime.com/login.do");
		String landingPageActualTitle = driver.getTitle();
		Assert.assertEquals(landingPageExpectedTitle, landingPageActualTitle, "Landing Page is not Loaded Successfully");
		driver.findElement(By.id("username")).sendKeys(userName);
		String userNameTextfield = driver.findElement(By.id("username")).getAttribute("value");
		Assert.assertEquals(userName, userNameTextfield, "Please Enter Valid user Name");
		driver.findElement(By.name("pwd")).sendKeys(password);
		String passwordTextfield = driver.findElement(By.name("pwd")).getAttribute("value");
	 Assert.assertEquals(password, passwordTextfield , "Please Enter Valid Password");
	 driver.findElement(By.id("loginButton")).click();
	 String homePageActualTitle = driver.getTitle();
	 Assert.assertEquals(homePageExpectedTitle, homePageExpectedTitle, "Home page is not displaying Sucessfully");
	 explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
	 driver.findElement(By.id("logoutLink")).click();
	 Assert.assertEquals(landingPageExpectedTitle, landingPageActualTitle, "Please Logout");
	 driver.quit();
	 
	 
	 
		
		
	}

}
