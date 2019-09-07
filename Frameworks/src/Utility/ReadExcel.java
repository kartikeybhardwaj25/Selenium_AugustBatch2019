package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		File src =new File("C:\\Users\\kartikey\\eclipse-workspace\\Frameworks\\src\\TestData\\TestData.xlsx");
		
		
		//Read file inputStream
		
		FileInputStream fis = new FileInputStream(src);
		
		//Object for workbook
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		
		
		//Object for Sheet
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		int rowNum = wb.getSheetAt(0).getLastRowNum();
		
		for(int i=0;i<=rowNum;i++) {
			
			String data0 = sh.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println("value of username:  "+data0);
			
			String data1 = sh.getRow(i).getCell(2).getStringCellValue();
			
			System.out.println("value of password:  "+data1);
			
			
			
		}
		
		wb.close();

	}

}
