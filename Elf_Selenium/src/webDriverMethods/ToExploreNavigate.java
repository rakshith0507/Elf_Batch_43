package webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.NavigableMap;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigate {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		Thread.sleep(3000);
		driver.get("https://in.coursera.org/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().to("https://www.skillrary.com/");
		Thread.sleep(3000);
	
		URL url = new URL("https://www.edureka.co/");
		driver.navigate().to(url);
		
		driver.quit();
		
		
		
	}

}
