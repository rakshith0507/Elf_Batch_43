package ViaUsingPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchForThreeDifferentFromAndToLocation {
	@Test
	public void searchForBus() {
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
	
		
		driver.get("https://in.via.com/");
		//driver.navigate().refresh();
		driver.findElement(By.id("wzrk-cancel")).click();
		BasePage Basepge = new BasePage(driver);
		Basepge.getBusNavigationBar().click();
		BusHomePage bhp = new BusHomePage(driver);
		bhp.getFromTextfield().click();
		bhp.getFromTextfield().sendKeys("Bangalore");
		
		bhp.getBangalore().click();
		bhp.getDestinationTextfield().sendKeys("Mangalore");
		bhp.getMangalore().click();
		bhp.getDepartureField().click();
		driver.findElement(By.xpath("//span[.='Jan']/../../..//div[text()='25']")).click();
		bhp.getSearchButton();
		
		
		
		
	}

}
