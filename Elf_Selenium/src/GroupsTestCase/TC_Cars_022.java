package GroupsTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_Cars_022 {
	@Test(groups="regression")
	public void TC_Cars_22(@Optional("chrome")String BrowserName) {
		WebDriver driver = null;
		if(BrowserName.equalsIgnoreCase("chrome")) {
				driver= new ChromeDriver();
		}else if(BrowserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}else {
			Reporter.log("Please pass a valid browser name",true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.marutisuzuki.com/");
		String title = driver.getTitle();
		Reporter.log(title,true);
		driver.quit();
	}

}
