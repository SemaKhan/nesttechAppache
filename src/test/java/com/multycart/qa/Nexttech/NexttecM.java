package com.multycart.qa.Nexttech;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NexttecM {

	public static void main(String[] args) throws Exception {
		File file= new File("C:\\Users\\New User\\Desktop\\Aexel.xlsx");
		FileInputStream fls = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fls);
		XSSFSheet sheet = wb.getSheetAt(0);
		String Data = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(Data);
		String data2=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(Data+" "+data2);
		
	}

}
