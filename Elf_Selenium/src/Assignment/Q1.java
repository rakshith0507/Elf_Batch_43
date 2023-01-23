package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedrivers");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		String titleOfThePage = driver.getTitle();
		System.out.println("Title of the page is "+ titleOfThePage);
		String currentPageUrl = driver.getCurrentUrl();
		System.out.println("URL of the Current Page is "+ currentPageUrl);
		String currentPageResource = driver.getPageSource();
		System.out.println("Page Source of the Current page is "+ currentPageResource);
		driver.quit();
	}
	

}
