package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Rakshith  O R
 *
 */

public class WoodenStreet {

	private static final String Chategories = "Study Table";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id='loginclose1']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[contains(text(),'" + Chategories + "')]")).click();
		Thread.sleep(15000);
		WebElement furniturePrice = driver
				.findElement(By.xpath("(//h1[contains(text(),'" + Chategories + "')]/../..//strong)[2]"));

		/*
		 * driver.findElement(By.
		 * xpath("//span[text()='Sort by']/../../../../../div/div/div/div/div[2]")).
		 * click(); Set<String> allWindowID = driver.getWindowHandles(); for (String
		 * windowsID : allWindowID) { driver.switchTo().window(windowsID);
		 * 
		 * } //WebElement SD=
		 * driver.findElement(By.xpath("//h1[contains(text(),'"+Chategories+
		 * "')]/../div[2]/span"));
		 */
		String priceOfTheFurniture = furniturePrice.getText();
		String NEW = priceOfTheFurniture.replace("Rs", "");
		String furnituresPrice = NEW.replace(",", "");
		furnituresPrice = furnituresPrice.trim();
		System.out.println(furnituresPrice);
		int price = Integer.parseInt(furnituresPrice);
		System.out.println(price);

		if (price > 10000) {
			System.out.println("price is more");
		} else {
			driver.findElement(By.xpath("//span[text()='Sort by']/../../../../../div/div/div/div/div[2]")).click();
			Set<String> allWindowID = driver.getWindowHandles();
			for (String windowsID : allWindowID) {
				driver.switchTo().window(windowsID);
			}
			Thread.sleep(10000);
			driver.findElement(By.id("button-cart-buy-now")).click();
			Thread.sleep(5000);

		}

	}
}
