package com.parametrized;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("D:\\LoginData.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet =workbook.getSheet("TestData");
		int row= sheet.getLastRowNum();
		int colm= sheet.getRow(0).getLastCellNum();
		
		for(int r=0;r<=row;r++)
		{
			XSSFRow rownumber= sheet.getRow(r);
			for(int c=0; c<colm;c++)
			{
				XSSFCell cell=rownumber.getCell(c);
				
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getRichStringCellValue()); break;
				case NUMERIC: System.out.print(cell.getNumericCellValue()); break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
				}
				System.out.print(" | ");
				
			}
			System.out.println();
		}
	}

}
