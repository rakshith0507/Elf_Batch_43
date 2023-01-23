package Dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropdown {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php?r=101");
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(dayDropdown);
		System.out.println("dayDropdown : "+daySelect.isMultiple());
		List<WebElement> dayDropdownOptions = daySelect.getOptions();
		for( WebElement ele:dayDropdownOptions) {
			System.out.println(ele.getText()+", ");
		}
		
		daySelect.selectByIndex(12);
		System.out.println();
		System.out.println("===================================================================================================");
		
		Select monthSelect = new Select(monthDropdown);
		System.out.println("monthDropdown : "+monthSelect.isMultiple());
		List<WebElement> monthDropdownOptions = monthSelect.getOptions();
		for( WebElement ele:monthDropdownOptions) {
			System.out.println(ele.getText()+", ");
		}
		System.out.println();
		monthSelect.selectByValue("7");
		System.out.println("========================================================================================================");
		
		Select yearSelect = new Select(yearDropdown);
		System.out.println("yearSelect : "+ yearDropdown.getText());
		List<WebElement> yearDropDownOptions = yearSelect.getOptions();
		for( WebElement ele:yearDropDownOptions) {
			//System.out.println(ele.getText()+", ");
			yearSelect.selectByVisibleText(ele.getText());
			//Thread.sleep(500);
		}
		
		
		
		yearSelect.selectByVisibleText("1991");
		
		
	}

}
