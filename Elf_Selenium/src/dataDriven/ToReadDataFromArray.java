package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromArray {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./TestData/TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet infoSheet = workbook.getSheet("array");
		int rowCount = infoSheet.getPhysicalNumberOfRows();
		int colCount = infoSheet.getRow(0).getPhysicalNumberOfCells();
		String[][] sarr = new String[rowCount][colCount];
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				sarr[i][j]=infoSheet.getRow(i).getCell(j).toString();
				
			}
		}
		for(String[] arr:sarr) {
			for(String data:arr) {
				System.out.print(data+",  ");
			}
			System.out.println();
		}
		
	}

}
