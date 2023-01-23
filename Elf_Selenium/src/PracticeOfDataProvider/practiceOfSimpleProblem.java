package PracticeOfDataProvider;
//provide 5 url using data Provider

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class practiceOfSimpleProblem {
	@DataProvider(parallel = true)
		public String[] data() {
		String a[]= {"https://www.hyundai.com/in/en","https://www.tatamotors.com/","https://kawasaki-india.com/","https://www.tvsmotor.com/"};
		
		return a;
		
	}
	
	@Test(dataProvider = "data")
	public void test(String url) {
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.quit();
		
	}

	
	

}
