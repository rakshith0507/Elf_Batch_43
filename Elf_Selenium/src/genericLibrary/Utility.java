package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {
	
	/**
	 * This method help us read property file in .properties 
	 * @param key
	 * @return
	 */
	public static String fromPropertyFile(String key) {
		 FileInputStream fis = null;
		 Properties properties = null;
		
		try {
		fis = new FileInputStream("./TestData/configure.properties");
		properties = new Properties();
		properties.load(fis);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
		
		
		
	}
	/**
	 * This method help us read excel file of any format(both .xls and .xlsx)
	 * @param sheetName we have to pass the name of the sheet where the data is store
	 * @param rowNo
	 * @param cellNo
	 * @return
	 */
	public static String fromExcel(String sheetName, int rowNo, int cellNo) {
		File absPath = new File("./TestData/TestData.xlsx");
		FileInputStream fis = null;
		Workbook workbook = null;
		
		
		try {
			 fis = new FileInputStream(absPath);
			 workbook = WorkbookFactory.create(fis);
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
		
	}

}
