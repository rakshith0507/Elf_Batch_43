package Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEmptyFirefoxBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		
		
	}

}
