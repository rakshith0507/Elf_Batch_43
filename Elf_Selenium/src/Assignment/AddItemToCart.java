package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Rakshith O R
 *
 */
public class AddItemToCart {
	public static void main(String[] args) throws InterruptedException {
		// User Data
		String url = "https://www.amazon.in/";
		String expectedTitleOfLandingPage = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String expectedTitleOfNavigatedPage = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		String category = "Mobiles";
		String brand = "OnePlus";

		// Step 1 : Launch Empty Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Step 2 : Enter the Amazon URL
		driver.get(url);
		Thread.sleep(5000);
		// Step 3 : Navigating to Landing Page
		String actualTitleOfLandingPage = driver.getTitle();
		if (actualTitleOfLandingPage.equals(expectedTitleOfLandingPage)) {
			System.out.println("User Navigated to Amazon Landing Page ");
		}
		// Step 4 : Navigate to Mobile category Page
		WebElement selectCategory = driver.findElement(By.xpath("//a[text()='" + category + "']"));
		selectCategory.click();
		String actualTitleOfTheNavigatedPage = driver.getTitle();
		if (actualTitleOfTheNavigatedPage.equals(expectedTitleOfNavigatedPage)) {
			System.out.println("User Naviated to " + category + "Page");
		}
		// Step 5 : Select The Brand from Brand checkbox
		WebElement sortTheBrand = driver
				.findElement(By.xpath("//span[text()='Brands']/../..//span[text()='" + brand + "']"));
		sortTheBrand.click();
		// Step 6 : Select the 2nd Displayed Mobile and get the price of same
		WebElement getThePrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]"));
		String price = getThePrice.getText();
		System.out.println("Price of the product is = " + price);
		price = price.replace(",", "");
		int priceOfTheProduct = Integer.parseInt(price);
		String homepageID = driver.getWindowHandle();
		// Step 7 : Add the same mobile to cart if its price is greater than 25000
		if (priceOfTheProduct > 25000) {
			driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]/../../../../../../div")).click();
			Thread.sleep(5000);
			Set<String> allWindowsID = driver.getWindowHandles();
			allWindowsID.remove(homepageID);
			for (String windowID : allWindowsID) {
				driver.switchTo().window(windowID);
			}
			WebElement addToCart = driver.findElement(By.id("submit.add-to-cart-announce"));
			addToCart.submit();
		} else {
			System.out.println("Price is not in Range");
		}
	}

}
