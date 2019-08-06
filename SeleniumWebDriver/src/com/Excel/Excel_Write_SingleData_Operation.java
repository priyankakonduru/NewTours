package com.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Write_SingleData_Operation 
{

	public static void main(String[] args) throws IOException 
	{
	FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\Excel\\WorkBook4.xlsx");	
	XSSFWorkbook workbook= new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	Row row=sheet.createRow(3);
	Cell cell=row.createCell(3);
	cell.setCellValue("LiveTech");
	FileOutputStream file1= new FileOutputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\Excel\\WorkBook4.xlsx");
	workbook.write(file1);
	
	}

}