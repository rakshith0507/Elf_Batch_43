package ViaUsingPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusHomePage {

	public BusHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(partialLinkText = "One way")
	private WebElement OneWayLink;

	@FindBy(partialLinkText = "Round trip")
	private WebElement RoundTripLink;
	@FindBy(partialLinkText = "Packages")
	private WebElement PackagesLink;
	@FindBy(id = "srcId")
	private WebElement FromTextfield;
	@FindBy(id = "destId")
	private WebElement DestinationTextfield;
	public WebElement getOneWayLink() {
		return OneWayLink;
	}
	public WebElement getRoundTripLink() {
		return RoundTripLink;
	}
	public WebElement getPackagesLink() {
		return PackagesLink;
	}
	public WebElement getFromTextfield() {
		return FromTextfield;
	}
	public WebElement getDestinationTextfield() {
		return DestinationTextfield;
	}
	public WebElement getDepartureField() {
		return DepartureField;
	}
	public WebElement getReturnField() {
		return ReturnField;
	}
	public WebElement getSearchButton() {
		return SearchButton;
	}
	public WebElement getBangalore() {
		return Bangalore;
	}
	public WebElement getMangalore() {
		return Mangalore;
	}
	public WebElement getHassan() {
		return Hassan;
	}

	@FindBy(id = "departure")
	private WebElement DepartureField;
	@FindBy(id = "return")
	private WebElement ReturnField;
	@FindBy(xpath = "//input[@value='Search Buses'  and @class='search-btn search-journey']")
	private WebElement SearchButton;
	@FindBy(xpath = "//li[.='Bangalore']")
	private WebElement Bangalore;
	@FindBy(xpath = "//li[.='Mangalore']")
	private WebElement Mangalore;
	@FindBy(xpath = "//li[.='Hassan']")
	private WebElement Hassan;

}
