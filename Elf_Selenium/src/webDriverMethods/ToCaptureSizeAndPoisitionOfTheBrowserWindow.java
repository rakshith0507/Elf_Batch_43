package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSizeAndPoisitionOfTheBrowserWindow {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	Dimension sizeOfTheBrowser = driver.manage().window().getSize();
	int height = sizeOfTheBrowser.getHeight();
	int width = sizeOfTheBrowser.getWidth();
	System.out.println(height);
	System.out.println(width);
	Point poisitionOfTheBrowser = driver.manage().window().getPosition();
	System.out.println(poisitionOfTheBrowser.getX());
	System.out.println(poisitionOfTheBrowser.getY());
	driver.quit();
}
}
