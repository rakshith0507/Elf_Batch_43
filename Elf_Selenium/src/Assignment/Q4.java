package Assignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		Point newPositionOfTheWindow = new Point(100, 50);
		driver.manage().window().setPosition(newPositionOfTheWindow);
		Point poisitionOfTheBrowser = driver.manage().window().getPosition();
		System.out.println("Coordinate of X is "+poisitionOfTheBrowser.getX());
		System.out.println("Coordinate of Y is "+poisitionOfTheBrowser.getY());
		driver.quit();

	}

}
