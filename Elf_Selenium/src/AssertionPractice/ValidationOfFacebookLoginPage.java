package AssertionPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidationOfFacebookLoginPage {
	@Test
	
	public void facebookErrorLoginTesting() {
		
		String landingActualTitle = "Facebook – log in or sign up";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		SoftAssert sa = new SoftAssert();		
		
		driver.get("https://www.facebook.com/");
		String landingExpectedTitle = driver.getTitle();
   Assert.assertEquals(landingActualTitle, landingExpectedTitle, "Not Landing to Login page");
   Reporter.log("Navigated to Facebook page",true);
		driver.findElement(By.name("login")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Forgotten password?")));
		Reporter.log("Page Loaded",true);
		sa.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjczNTA3MTc5LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D", "User Not navigated to error page");
		String borderOfEmailTextfield = driver.findElement(By.id("email")).getCssValue("border");
		sa.assertEquals(borderOfEmailTextfield, "1px solid rgb(240, 40, 73)", "colour Miss match");
				
		driver.quit();
		sa.assertAll();
		
		
	}

}
