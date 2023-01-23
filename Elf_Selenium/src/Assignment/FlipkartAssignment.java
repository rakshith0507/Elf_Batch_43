package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Forgot?']/../../../../../../../../button")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.navigate().refresh();
		String product1 = "iPhone";
		driver.findElement(By.xpath("//div[contains(text(),' " + product1 + " ')]")).click();
		Set<String> windowId = driver.getWindowHandles();
		for (String id1 : windowId) {
		driver.switchTo().window(id1);
		}
		System.out.println(driver.getTitle());
		String rupee1 = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(1000);
		String product2 = "OPPO";
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(product2, Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'" + product2 + " ')]")).click();
		Set<String> windowId1 = driver.getWindowHandles();
		for (String id1 : windowId1) {
		driver.switchTo().window(id1);
		}
		System.out.println(driver.getTitle());
		String rupee2 = driver.findElement(By.xpath("//div[@class='_3I9_wc _2p6lqe']")).getText();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(1000);
		String product3 = "vivo";
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(product3, Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),' " + product3 + " ')]")).click();
		Set<String> windowId11 = driver.getWindowHandles();
		for (String id1 : windowId11) {
		driver.switchTo().window(id1);
		}
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		String rupee3 = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		System.out.println(rupee1 + " " + rupee2 + "  " + rupee3);
		ArrayList<String> a3=new ArrayList<String>();
		a3.add(rupee1);
		a3.add(rupee2);
		a3.add(rupee3);
		System.out.println(a3);
		Thread.sleep(2000);
		rupee1 = rupee1.replace(",", "");
		rupee1 = rupee1.replace("₹", "");
		int r1 = Integer.parseInt(rupee1);
		rupee2 = rupee2.replace(",", "");
		rupee2 = rupee2.replace("₹", "");
		int r2 = Integer.parseInt(rupee2);
		rupee3 = rupee3.replace(",", "");
		rupee3 = rupee3.replace("₹", "");
		int r3 = Integer.parseInt(rupee3);
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(r1);
		a1.add(r2);
		a1.add(r3);
		System.out.println(a1);

		for(int i=0;i<=a1.size();i++) {
		int min=a1.get(1);
		if (a1.get(i) < min) {
		Integer a2=a1.get(i);
		String a4 = driver.findElement(By.xpath("//span[@class='_2-ut7f _2xc6hH']")).getText();
		System.out.println(a4);
		System.out.println(a2);
		/*if(a2.equals(a1)){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,3000);");
		WebElement remove = driver.findElement(By.xpath("//div[contains(text(),'Remove')]"));
		remove.click();
		driver.findElement(By.xpath("//div[contains(text(),'Remove')]/..")).click();
		System.out.println("removed product" + " " + driver.getTitle());*/
		}
		}
	}
}

		// driver.quit();