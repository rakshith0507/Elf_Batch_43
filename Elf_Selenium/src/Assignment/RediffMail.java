package Assignment;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffMail {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign in']"));
		signIn.click();
		WebElement userName = driver.findElement(By.xpath("//input[@name='login']"));
		userName.sendKeys("sumanthElfBatch@rediffmail.com");
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("Testing@123");
		WebElement signinButton = driver.findElement(By.xpath("//input[@title='Sign in']"));
		signinButton.submit();
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'TO')]")).sendKeys("sumanthElfBatch@rediffmail.com");

		// toAddress.sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'Subject:')]/..//input")).sendKeys("Rakshith");
		// subject.sendKeys("Rakshith");
		WebElement bodyFrame = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		driver.switchTo().frame(bodyFrame);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hi hello");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Send']")).click();
		driver.navigate().refresh();
		try {
			driver.findElement(By.xpath("//span[text()='Rakshith']/..//cite")).click();
		} catch (Exception e) {

		}
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='Rakshith']/..//cite")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		//WebElement successMsg = driver.findElement(By.xpath("//div[text()='1 mail deleted']"));
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[contains(text(),'1 mail deleted')]"))));
		TakesScreenshot ts = (TakesScreenshot) driver;
			File tempScreenshot = ts.getScreenshotAs(OutputType.FILE);
			File targetScreenshot = new File("./errorShots/snap12.png");
			FileHandler.copy(tempScreenshot, targetScreenshot);
		

		driver.quit();

}

}
//"//div[@id='rdNotify']
