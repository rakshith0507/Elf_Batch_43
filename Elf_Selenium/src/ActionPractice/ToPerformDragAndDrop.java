package ActionPractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToPerformDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 20);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frameElement);
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement tarsh = driver.findElement(By.id("trash"));
		WebElement gallery = driver.findElement(By.id("gallery"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(image1, tarsh).perform();
		actions.dragAndDrop(image2, tarsh).perform();
		actions.dragAndDrop(image3, tarsh).perform();
		actions.dragAndDrop(image4, tarsh).perform();
		actions.dragAndDrop(image1, gallery).perform();
		actions.dragAndDrop(image2, gallery).perform();

		// drag and Hold
		actions.clickAndHold(image1).perform();
		actions.moveByOffset(200, 100).perform();
		Thread.sleep(5000);
		actions.release().perform();
		// driver.quit();
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		WebElement elementToBeScrolled = driver.findElement(By.xpath("//h1[text()='Drag And Drop']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", elementToBeScrolled);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("Accepted Elements")));
		driver.findElement(By.id("Accepted Elements")).click();
		WebElement frame2 = driver.findElement(By.xpath("//iframe[contains(@data-src,'accepted-elements.html')]"));
		driver.switchTo().frame(frame2);

		WebElement draggable = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement location = driver.findElement(By.id("droppable"));
		System.out.println(location.getText());

		actions.dragAndDrop(draggable, location).perform();
		Thread.sleep(2000);
		System.out.println(location.getText());
		driver.switchTo().defaultContent();
		driver.findElement(By.id("Propagation")).click();
		WebElement frame3 = driver.findElement(By.xpath("//iframe[contains(@data-src,'propagation.html')]"));
		driver.switchTo().frame(frame3);
		WebElement source3 = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement innerDroppable = driver.findElement(By.id("droppable-inner"));
		actions.dragAndDrop(source3, innerDroppable).perform();
		
		
		
		

	}

}
