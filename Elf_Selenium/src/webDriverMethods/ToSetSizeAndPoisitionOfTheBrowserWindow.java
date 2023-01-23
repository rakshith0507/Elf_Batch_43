package webDriverMethods;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetSizeAndPoisitionOfTheBrowserWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://firelawn.com/");
		Thread.sleep(3000);
		Point positionOfTheBrowser = new Point(0, 0);
		driver.manage().window().setPosition(positionOfTheBrowser);
		Thread.sleep(3000);
		Dimension sizeOfTheBrowser = new Dimension(800, 800);
		driver.manage().window().setSize(sizeOfTheBrowser);
		Thread.sleep(6000);
		driver.manage().window().fullscreen();
		driver.quit();






	}
}
