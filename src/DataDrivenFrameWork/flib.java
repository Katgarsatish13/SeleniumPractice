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

public class flib {
	public String readExceldata(String excelpath,String sheetname, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row Row = sheet.getRow(row);
		Cell Cell = Row.getCell(cell);
		String data = Cell.getStringCellValue();
		return data;
		
	}
	public void writeExceldata(String excelpath,String sheetname, int row, int cell,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		
		Row Row = sheet.getRow(row);
		Cell Cell = Row.createCell(cell);
		    Cell.setCellValue("ram");
		    FileOutputStream fos=new FileOutputStream(excelpath);
		    wb.write(fos);
	}
	public int getRowCountMethod(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int rc = sh.getLastRowNum();
		return rc;
		
	}
		
	

}
