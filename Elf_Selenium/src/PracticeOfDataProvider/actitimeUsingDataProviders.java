package PracticeOfDataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class actitimeUsingDataProviders {

	@DataProvider
	public String[][] fromExcel() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(new File("./TestData/TestData.xlsx"));
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("actitime");
		int rowCount = sheet.getPhysicalNumberOfRows() - 1;
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		// store the data in the form of array using below
		String data[][] = new String[rowCount][colCount];
		for (int i = 1, k = 0; i <= rowCount; i++, k++) {
			for (int j = 0; j < colCount; j++) {
				data[k][j] = sheet.getRow(i).getCell(j).toString();
			}
		}

		return data;

	}

	@Test(dataProvider = "fromExcel")
	public void test(String data[]) {
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(data[0]);
		System.out.println(username.getAttribute("value"));

		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys(data[1]);
		System.out.println(password.getAttribute("value"));
		driver.findElement(By.id("loginButton")).click();
		driver.quit();

	}

}
