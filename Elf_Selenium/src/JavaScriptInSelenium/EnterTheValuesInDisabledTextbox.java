package JavaScriptInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheValuesInDisabledTextbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.get("https://demoapp.skillrary.com/");
		WebElement textbox = driver.findElement(By.xpath("//input[@class='form-control']"));
		System.out.println(textbox.isEnabled());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Rakshith'", textbox);*/
		
		
		
		//to Remove the auto populated values and one more method to deleted
		//=================================================clear the content in textfield=========================================
		/*driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement textbox = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=''", textbox);*/
		
		//===========================================click on the disabled Elements============================================
		
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase7-archive-downloads.html");
		driver.findElement(By.partialLinkText("jdk-7u80-solaris-i586")).click();
		WebElement disablebutton = driver.findElement(By.xpath("//a[contains(text(),'Download jdk-7u80-solaris-i586.tar.gz')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", disablebutton);
		
		
		
		
	}

}
