package Assignment;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Dimension resizeOfTheBrowser = new Dimension(100, 200);
		System.out.println("New size of the Browser is "+ resizeOfTheBrowser);
		driver.quit();
	}

}
