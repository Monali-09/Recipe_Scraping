package utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public FileOutputStream fo;
	public FileInputStream fi;
	String path;
	
	
	public ExcelUtils(String path)
	{
		this.path = path;
		
	}
	
		
	public void setCellData(String sheetName, int rownum, int colnum, String data) throws IOException
	{
		
		File excelFile = new File(path);
		if(!excelFile.exists())
		{
			workbook = new XSSFWorkbook();
			fo = new FileOutputStream(path);
			workbook.write(fo);
		}
		
		fi = new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		
		
		if(workbook.getSheetIndex(sheetName)==-1)
			
			workbook.createSheet(sheetName);	
		
		sheet= workbook.getSheet(sheetName);
		
		if(sheet.getRow(rownum) == null)
				sheet.createRow(rownum);
		
		row = sheet.getRow(rownum);
		
		cell = row.createCell(colnum);
		cell.setCellValue(data);
		
		//For Wrapping the Text
		CellStyle cs= workbook.createCellStyle();
		cs.setWrapText(true);
		cell.setCellStyle(cs);
		
		fo = new FileOutputStream(path);
		workbook.write(fo);
		
		workbook.close();
		fi.close();
		fo.close();
	}	

}
