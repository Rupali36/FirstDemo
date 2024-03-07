package com.testingshastra;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestData {
	@DataProvider(name="pincode_data")
	
	public String [] [] pincodesdata() throws IOException  {
		
		//code to read excel file using Apache POI
		 String baseDir = System.getProperty("user.dir");//Current working Directory cwd pwd 
		 System.out.println(baseDir);
		FileInputStream fis = new FileInputStream(baseDir+"/src/test/resources/pincodesdata.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("pincodedata");
		String [][] pincodes = new String[sheet.getLastRowNum()][1];
		for (int i = 1; i <=sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(1);
		    int pincode = (int) cell.getNumericCellValue();
		    pincodes [i-1] [0] = pincode+"";
	    //	System.out.println(pincode);
		//Insert into an array
		
	}
		return pincodes;
		
}}
