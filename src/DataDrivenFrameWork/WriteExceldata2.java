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

public class WriteExceldata2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validdata");
		Row row = sheet.getRow(2);
		Cell cell = row.createCell(3);
		cell.setCellValue("kuldeep");
		FileOutputStream fos = new FileOutputStream("./data/testdata.xlsx");
		wb.write(fos);
		
	}

}
