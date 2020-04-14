package com.api.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility {
	
		
		
		
		public static FileInputStream fi;
		public static FileOutputStream fo;
		public static XSSFWorkbook workbook;
		public static XSSFCell cell;
		public static XSSFSheet sheet;
		public static XSSFRow row;
		public static File file;
		
		public static int intRowCount1(String xlfile,String xlsheet) throws IOException
		{
			fi = new FileInputStream(xlfile);
			workbook = new XSSFWorkbook(fi);
			sheet = workbook.getSheet(xlsheet);
			int rowcount = sheet.getLastRowNum();
			workbook.close();
			fi.close();
			
			return rowcount;
			
		}
		
		public static int intCellCount1(String xlfile ,String xlsheet,int rownum) throws IOException
		{
			fi = new FileInputStream(xlfile);
			workbook = new XSSFWorkbook(fi);
			sheet = workbook.getSheet(xlsheet);
			row = sheet.getRow(rownum);
			int cellcount = row.getLastCellNum();
			workbook.close();
			fi.close();
			return cellcount;
			
			
		}
		
		
		public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
		{
			
			fi = new FileInputStream(xlfile);
			workbook = new XSSFWorkbook(fi);
			sheet = workbook.getSheet(xlsheet);
			row = sheet.getRow(rownum);
			cell=row.getCell(colnum);
			
			String data;
			try {			
			DataFormatter formatter = new DataFormatter();
			String cellData =	formatter.formatCellValue(cell);
			return cellData;
			} catch (Exception e) {
				data ="";			
			}
			workbook.close();
			fi.close();
			
			return data;
		}
		
		public static String setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
		{
			
			fo = new FileOutputStream(xlfile);
			fi = new FileInputStream(xlfile);
			workbook = new XSSFWorkbook(fi);
			sheet = workbook.getSheet(xlsheet);
			row = sheet.getRow(rownum);
			cell = row.createCell(colnum);
			cell.setCellValue(data);
			workbook.write(fo);
			workbook.close();
			//fi.close();
			fo.close();
			return data;
			
		}
		
}
		
		
		
		
		
		
		
		
		
		


