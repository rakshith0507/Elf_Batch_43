package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementUsingIDInActiTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		String titleOfThePage = driver.getTitle();
		System.out.println("The Title of the page with Manager Login is  "+ titleOfThePage);
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		 String titleOfTheTranieePage = driver.getTitle();
		System.out.println("The Title of the page with Traniee Login is  "+ titleOfTheTranieePage);
		driver.findElement(By.id("logoutLink")).click();
		
		
		driver.quit();

	}

}
