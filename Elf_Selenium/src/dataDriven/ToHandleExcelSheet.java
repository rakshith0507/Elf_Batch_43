package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToHandleExcelSheet {
	public static void main(String[] args) throws IOException {
		// Step 1 : Creating Input stream type object
		File absPath = new File("./TestData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(absPath);

		// Step 2 : Creating Object of the File Type

		Workbook workbook = new XSSFWorkbook(fis);

		// Step 3 : Read Methods
		String value = workbook.getSheet("Test").getRow(9).getCell(3).getStringCellValue();
		String value1 = workbook.getSheet("Test").getRow(9).getCell(4).getStringCellValue();
		String value2 = workbook.getSheet("Test").getRow(11).getCell(3).getStringCellValue();
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);

	}

}
