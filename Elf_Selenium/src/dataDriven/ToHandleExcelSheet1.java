package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToHandleExcelSheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File absPath = new File("./TestData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(absPath);
		
		//Workbook workbook = WorkbookFactory.create(fis);

		Workbook workbook = WorkbookFactory.create(fis);
		String value = workbook.getSheet("Test").getRow(9).getCell(3).getStringCellValue();
		String value1 = workbook.getSheet("Test").getRow(9).getCell(4).getStringCellValue();
		String value2 = workbook.getSheet("Test").getRow(11).getCell(3).getStringCellValue();
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);

	}

}
