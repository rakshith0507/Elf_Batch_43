package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyfile {
public static void main(String[] args) throws IOException {
	//Step 1 : Creating the input stream type object
	File absPath = new File("./TestData/userData.properties");
	FileInputStream fis = new FileInputStream(absPath);
	//Step 2 : Create object of File type
	Properties properties = new Properties();
	properties.load(fis);
	//Step 3 : Read Methods
	String key = properties.getProperty("chromeBrowserKey").toString();
	String value =properties.get("chromedriverPath").toString();
	String url = properties.get("url").toString();
	
	System.setProperty(key, value);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
	
	
	
}
}
