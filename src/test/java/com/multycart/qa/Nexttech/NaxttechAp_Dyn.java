package com.multycart.qa.Nexttech;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NaxttechAp_Dyn {
    
	XSSFWorkbook wb;
    XSSFSheet sheet;
    
  public NaxttechAp_Dyn (String exelpath) {
	  try {
		File file= new File("C:\\Users\\New User\\Desktop\\Aexel.xlsx");
		  FileInputStream fls= new FileInputStream(file);
		  wb = new XSSFWorkbook(fls);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
  }
  
    public String getData(int row, int clm,int sheet1 ){
    	sheet = wb.getSheetAt(0);
    	String data1 = sheet.getRow(row).getCell(clm).getStringCellValue();
    	return data1;
    }
}
