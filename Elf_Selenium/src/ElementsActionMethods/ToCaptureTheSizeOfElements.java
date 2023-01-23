package ElementsActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheSizeOfElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		Dimension sizeOfTheElement = driver.findElement(By.id("email")).getSize();
		int widthOfTheEmailTextfieldElement = sizeOfTheElement.getWidth();
		int heightOfTheEmailTextfieldElement = sizeOfTheElement.getHeight();
		Dimension sizeOfThePasswordTextfield = driver.findElement(By.id("passContainer")).getSize();
		int widthOfThePasswordTextfield = sizeOfThePasswordTextfield.getWidth();
		int heightOfThePasswordTextfield = sizeOfThePasswordTextfield.getHeight();

		System.out.println("widthOfTheEmailTextfieldElement = "+ widthOfTheEmailTextfieldElement);
		System.out.println("heightOfTheEmailTextfieldElement ="+heightOfTheEmailTextfieldElement);
		System.out.println("widthOfThePasswordTextfield ="+widthOfThePasswordTextfield);
		System.out.println("heightOfThePasswordTextfield ="+heightOfThePasswordTextfield);
		if (widthOfTheEmailTextfieldElement == widthOfThePasswordTextfield) {
			System.out.println("Email Textfield and Password Textfield are Alligned to Right");
		} else {
			System.out.println("Email Textfield and Password Textfield are not inline towards Right");
		}

		driver.quit();

	}

}
