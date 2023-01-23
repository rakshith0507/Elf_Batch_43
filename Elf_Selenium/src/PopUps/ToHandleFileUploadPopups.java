package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleFileUploadPopups {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		
//		driver.get("https://www.naukri.com/");
//		driver.findElement(By.linkText("Register")).click();
//		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Rakshith  O R\\Downloads\\leave_summary (3).pdf");
		
		driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Rakshith  O R\\Downloads\\images.jfif");
		Alert popUpAlert = driver.switchTo().alert();
		System.out.println(popUpAlert.getText());
		popUpAlert.accept();
		
	}

}
