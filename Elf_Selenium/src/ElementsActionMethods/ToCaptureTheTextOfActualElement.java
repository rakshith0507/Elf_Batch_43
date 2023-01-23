package ElementsActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheTextOfActualElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//to capture value from textfield
		/*driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		Thread.sleep(3000);
		WebElement usernameTextField = driver.findElement(By.id("userName"));
		usernameTextField.sendKeys("rakshith");
		Thread.sleep(5000);
		String getAttributeValue = usernameTextField.getAttribute("value");
		System.out.println(getAttributeValue);*/
		
		//to capture tool tip text
		/*driver.get("https://demo.actitime.com/login.do");
		WebElement tooltip = driver.findElement(By.id("keepMeLoggedInCaptionContainer"));
		String toPrintToolTip = tooltip.getAttribute("title");
		System.out.println(toPrintToolTip);*/
		
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(10000);
		
		driver.findElement(By.id("loginclose1")).click();
		String alternateText = driver.findElement(By.xpath("//img[@alt='Wooden Bed']")).getAttribute("title");
		System.out.println(alternateText);
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
	}

}
