package com.NewTours1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LogInPageTest extends TestBase
{
	LogInPage LogIn=PageFactory.initElements(driver, LogInPage.class);
	
	@Test(priority=1)
	public void logIn()
	{
		LogIn.SignOn();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
	}
	
	@Test(priority=2)
	public void register()
	{
		LogIn.Register();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
	}
	
	@Test(priority=3)
	public void support()
	{
		LogIn.Support();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
	}
	
	@Test(priority=4)
	public void LogIn() throws IOException
	{
	FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\NewTours1\\LogIn.POM.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int rowCount=sheet.getLastRowNum();
	for(int i=1;i<rowCount;i++)
	{
		Row row=sheet.getRow(i);
		LogIn.LogIn(row.getCell(0).getStringCellValue(),row.getCell(1).getStringCellValue());
		String expected_Title="Find";
		System.out.println("The expected title is:"+expected_Title);
		String actual_Title=driver.getTitle();
		System.out.println("The actual title is:"+actual_Title);
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("LogIn successful - PASS");
			row.createCell(2).setCellValue("LogIn successful - PASS");
		}
		else
		{
			System.out.println("LogIn failed - FAIL");
			row.createCell(2).setCellValue("LogIn failed - FAIL");
		}
		
		driver.navigate().back();
		FileOutputStream file1=new FileOutputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\NewTours1\\LogIn.POM.xlsx");
		workbook.write(file1);
	}
	}
	}
