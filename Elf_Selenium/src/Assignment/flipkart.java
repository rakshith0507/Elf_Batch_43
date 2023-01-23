package Assignment;

import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkart {
	public static  WebDriver driver;
	public static WebDriverWait explicitWait;
	public static TreeMap<Integer, String>productDetails = new TreeMap<>();
	public static JavascriptExecutor js;
	

	public static void main(String[] args) throws InterruptedException {
		//step 1: open the Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		explicitWait = new WebDriverWait(driver, 20);
		//step 2: Navigate to Flipkart
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Login']/../../../../../button")).click();
	
		searchAndAddProduct("APPLE");
		searchAndAddProduct("MOTOROLA");
		searchAndAddProduct("oppo");
		
		//remove the least product
		String lowestProduct ="";
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		String lowestProductPrice = ""; 
		 List<WebElement> prices = driver.findElements(By.xpath("(//div[contains(@style,'box-shadow')]//span[contains(text(),'₹')])[position() mod 2= 0]"));
		for(int i=1;i<prices.size();i++) {
			int price = Integer.parseInt(prices.get(i-1).getText().replace("₹", "").replace(",", ""));
			productDetails.put(price, "Product"+i+"");					
		}
		Set<Integer>costOfProduct = productDetails.keySet();
		for(Integer lowestCost:costOfProduct) {
			lowestProduct = productDetails.get(lowestCost);
			break;
			
		}
		char indexOfRemoveButton = lowestProduct.charAt(lowestProduct.length()-1);
		for(;;) {
			try {
				driver.findElement(By.xpath("(//div[text()='Remove'])["+indexOfRemoveButton+"]")).click();
				break;
				
			}
			catch(Exception e){
				js.executeScript("window.scrollby(0,1717)");
						
			}
			driver.findElement(By.xpath("(//div[text()='Remove'])["+indexOfRemoveButton+"]")).click();
			
				
			}
		}
		
		
		
		

	
	public static void searchAndAddProduct(String product) throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(product , Keys.ENTER);
		
		explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'"+product+"')]")));
		Thread.sleep(5000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[contains(text(),'"+product+"')]")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentId);
		for(String window:allWindowId) {
			driver.switchTo().window(window);
			
		}
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']")));
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.='Place Order']")));
		driver.findElement(By.xpath("//button[.='Place Order']")).click();
		driver.close();
		driver.switchTo().window(parentId);
		explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Search for products, brands and more']")));
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(Keys.DELETE);
		
		
		
		
		
		
		
	
}
}

