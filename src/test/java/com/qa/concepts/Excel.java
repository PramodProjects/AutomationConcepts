package com.qa.concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {

//		// Get row count
//		FileInputStream fis = new FileInputStream("./documents\\excelData.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		int rowCount = sheet.getLastRowNum();
//		System.out.println(rowCount);
//		workbook.close();
//		fis.close();
		
		
		
		
		
		
//		// Get Cell count
//		FileInputStream fis = new FileInputStream("./documents\\excelData.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet =  workbook.getSheet("Sheet1");
//		XSSFRow row =  sheet.getRow(0);
//		int colCount = row.getLastCellNum();
//		System.out.println(colCount);
//		workbook.close();
//		fis.close();
//		
		
		
		
		
		
//		// Get cell data using row num and column num	
//		FileInputStream fis = new FileInputStream("./documents\\excelData.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheet("Sheet1");		
//		// To get formula value
//		XSSFRow row = sheet.getRow(1);
//		XSSFCell cell = row.getCell(1);
//		String s = cell.toString();
//		System.out.println(s);		
//		if(cell.getCellType()  == CellType.FORMULA ) 
//		{
//			switch(cell.getCachedFormulaResultType()) {
//			case BOOLEAN:
//				System.out.println(cell.getBooleanCellValue());
//				break;
//			case NUMERIC:
//				System.out.println(cell.getNumericCellValue());
//				break;
//			default:
//				break;
//				
//			}
//		}
				
//		// To get empty cell
//		XSSFRow row1 = sheet.getRow(3);
//		XSSFCell cell1 = row1.getCell(3);
//		DataFormatter formatter = new DataFormatter();
//		String s1 = formatter.formatCellValue(cell1);
//		System.out.println(s1);
//		workbook.close();
//		fis.close();
		
		
		
		
		
//		// Get cell data using column name
//		FileInputStream fis = new FileInputStream("./documents\\excelData.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		
//		int colNum = -1;		
//		for (int i = 0; i < sheet.getRow(0).getLastCellNum(); i++) 
//		{
//			if(sheet.getRow(0).getCell(i).getStringCellValue().trim().equals("First Name")){
//				colNum = i;
//			}
//		}		
//		String s2 = sheet.getRow(2).getCell(colNum).toString();
//		System.out.println(s2);
//		workbook.close();
//		fis.close();
		
		
		
		
		
		
//		// Set cell value
//		XSSFWorkbook workbook;
//		 FileOutputStream fos;
//		String path = "./documents\\setExcelData.xlsx";
//		File file = new File(path);
//		if(!file.exists()) {
//			 workbook = new XSSFWorkbook();
//			  fos = new FileOutputStream(path);	
//			  workbook.write(fos);
//		}		 
//		FileInputStream fis =  new FileInputStream(path);
//		workbook = new XSSFWorkbook(fis);
//		System.out.println(workbook.getSheetIndex("Sheet1"));
//		if(workbook.getSheetIndex("Sheet1") == -1)
//		{
//			workbook.createSheet("Sheet1");
//		}
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		if(sheet.getRow(0) == null) {
//			sheet.createRow(0);			
//		}
//		
//		XSSFRow row = sheet.getRow(0);
//		row.createCell(1).setCellValue("Pramod111");
//		  fos = new FileOutputStream(path);	
//		workbook.write(fos);
//		workbook.close();
//		fis.close();
		
		
		
		
//		// Set cell value without conditions
//		String path = "./documents\\setExcelData.xlsx";	
//		XSSFWorkbook workbook = new XSSFWorkbook();		
//		XSSFSheet sheet = workbook.createSheet("Sheet1");
//		sheet.createRow(0).createCell(0).setCellValue("jjj");
//		FileOutputStream fos=new FileOutputStream(path);
//		workbook.write(fos);
//		workbook.close();
//		fos.close();
		
		
		
		
		// Fill color
		FileInputStream fis =new FileInputStream("./documents\\excelData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(2);
		
		CellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		
		FileOutputStream fos = new FileOutputStream("./documents\\excelData.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();
		fis.close();
		
		
		
		
		
	}

}
