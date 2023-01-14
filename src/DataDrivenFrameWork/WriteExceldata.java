package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class WriteExceldata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testdata.xlsx");
		//wb = new WorkbookFactory.create(fis);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validata");
		Row row = sheet.getRow(2);
		Cell cell = row.createCell(4);
	 cell.setCellValue("satish");
	 FileOutputStream fos=new FileOutputStream("./data/testdata.xlsx");
	 wb.write(fos);
	}

}
