package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Rakshith  O R
 *
 */

public class SignIn_001 {
	public static void main(String[] args) throws InterruptedException {
		//User Data
		String expectedTitleOfTheLandingPage = "FireFlink – Test Automation. Redefined.";
		String expectedTitleOfTheSIgnInPage = "FireFlink";
		String email = "rakshith.or@testyantra.com";
		String password = "Password@123";

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// 1 .Launch chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// 2.Navigate to URL
		driver.get("https://fireflink.com/");
		String actualTitleOfTheLandingPage = driver.getTitle();

		if (actualTitleOfTheLandingPage.equals(expectedTitleOfTheLandingPage)) {
			System.out.println("User Navigated to FireFlink Landing Page");
		}
		// 3.Click on the SignIn button in Landing Page
		WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign In']"));
		if (signIn.isDisplayed()) {
			System.out.println("SignIn button is displaying");
		}
		signIn.click();
		Thread.sleep(5000);
		String actualTitleOfTheSignInPage = driver.getTitle();
		if (actualTitleOfTheSignInPage.equals(expectedTitleOfTheSIgnInPage)) {
			System.out.println("User Navigated to FireFlink SignIn Page");
		}
		// 4.Enter the valid Email in Email Textfield
		WebElement emailTextfield = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		emailTextfield.sendKeys(Keys.CLEAR);
		emailTextfield.sendKeys(email);
		String eValue = emailTextfield.getAttribute("value");
		if (eValue.equals(email)) {
			System.out.println("User Entered Valid Email ID");
		}
		// 5.Enter the Valid Password in Password Textfield
		WebElement passwordTextfield = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		passwordTextfield.sendKeys(Keys.CLEAR);
		passwordTextfield.sendKeys(password);
		String pwdValue = passwordTextfield.getAttribute("value");
		if (pwdValue.equals(password)) {
			System.out.println("User Entered Valid Password");

		}
		// 6.Click on the SignIn button in Login Page
		Thread.sleep(5000);
		WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		if (signInButton.isDisplayed()) {
			System.out.println("SignIn Button is Displaying");
		}
		signInButton.submit();
		driver.quit();

	}

}
