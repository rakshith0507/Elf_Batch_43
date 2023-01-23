package PracticeTestNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_bikes_011 {
	@Parameters("browserName1")
@Test
	
	public void TC_bikes_11(@Optional("Firefox") String bname ) {
		System.out.println(bname);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://kawasaki-india.com/");
		String title = driver.getTitle();
		Reporter.log(title,true);
		driver.quit();
	}

}
