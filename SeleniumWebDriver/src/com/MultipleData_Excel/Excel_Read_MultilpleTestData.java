package com.MultipleData_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultilpleTestData 
{

	public static void main(String[] args) throws IOException 
	{
	FileInputStream fis= new FileInputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\MultipleData_Excel\\WorkBook4.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("sheet1");
	int rowcount=sheet.getLastRowNum();
	for(int i=0;i<=rowcount;i++)
	{
		Row row=sheet.getRow(i);
		int cellcount=row.getLastCellNum();
		for(int j=0;j<cellcount;j++)
		{
			String data=row.getCell(j).getStringCellValue();
			System.out.println(data+ "  ");
		}
		System.out.println();
	}
	}
}
