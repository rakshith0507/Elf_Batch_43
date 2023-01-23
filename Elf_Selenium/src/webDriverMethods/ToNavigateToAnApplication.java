package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToAnApplication {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ferrari.com/en-IN");
		Thread.sleep(10000);
		String getTitleOfThePage = driver.getTitle();
		System.out.println(getTitleOfThePage);
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		driver.close();
		

	}

}
