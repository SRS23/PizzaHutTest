package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constantss;

public class GetDataFromExcell  {
	XSSFWorkbook workbook;
		public String getUrlLink() throws IOException {
			
			FileInputStream fis = new FileInputStream( Constantss.websiteUrl);
			 workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Row row = sheet.getRow(3);
			Cell cell = row.getCell(1);
			
			XSSFCell value = sheet.getRow(3).getCell(1);
			
			String text = value.toString();
			System.out.println(text);
			return text;
		}
		public void close() {
			if (workbook != null) {
	            try {
	                workbook.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        
		
		}
}
