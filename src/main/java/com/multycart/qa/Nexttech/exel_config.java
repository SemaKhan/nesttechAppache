package com.multycart.qa.Nexttech;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exel_config {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public exel_config(String exelpath) {
		
			try {
				//create a object for file path
				File src= new File("C:\\Users\\New User\\Desktop\\Aexel.xlsx");
				//FileInputStream for add file in java
				FileInputStream fls = new FileInputStream (src);
				//its coming ton xxsworkbook file
				wb=new XSSFWorkbook(fls);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	//create a return method for data
		public String getData(int Sheetnumbeer,int rownumber, int colmnnumber) {
			//create obj for sheet
			sheet= wb.getSheetAt(0);
			String data1= sheet.getRow( rownumber).getCell(colmnnumber).getStringCellValue();
		return data1;
	}
}