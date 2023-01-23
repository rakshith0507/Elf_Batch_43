package ViaUsingPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(partialLinkText = "Bus") private WebElement busNavigationBar;
    
	public WebElement getBusNavigationBar() {
		return busNavigationBar;
	}

	public void setBusNavigationBar(WebElement busNavigationBar) {
		this.busNavigationBar = busNavigationBar;
	}
	

}
