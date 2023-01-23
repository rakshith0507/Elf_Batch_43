package ElementsActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheLocationOfElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement emailTextfield = driver.findElement(By.id("email"));
		WebElement passwordTextfield = driver.findElement(By.id("passContainer"));
		Point emailLocation = emailTextfield.getLocation();
		Point passwordLocation = passwordTextfield.getLocation();
		int emailTextfieldXLocation = emailLocation.getX();
		int passwordTextfieldXLocation = passwordLocation.getX();
		int emailTextfieldYLocation = emailLocation.getY();
		int passwordTextfieldYLocation = passwordLocation.getY();
		System.out.println("X Location of the Email Textfield is ="+emailTextfieldXLocation);
		System.out.println("X Location of the Password Textfield is ="+ passwordTextfieldXLocation);
		System.out.println("Y Location of the Email Textfield is ="+ emailTextfieldYLocation);
		System.out.println("Y Location of the Password Textfield is = "+ passwordTextfieldYLocation);
		
		driver.quit();
		
		
	}

}
