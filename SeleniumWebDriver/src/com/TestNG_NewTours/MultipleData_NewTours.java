package com.TestNG_NewTours;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleData_NewTours
{
	WebDriver driver=null;
	String url="http://newtours.demoaut.com/";
		
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void MultipleData_Capture() throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\TestNG_NewTours\\WorkBook8.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int rowcount=sheet.getLastRowNum();
		for(int i=1;i<rowcount;i++)
		{
			Row row=sheet.getRow(i);
			int cellcount=row.getLastCellNum();
			for(int k=0;k<cellcount;k++)
			{
				driver.findElement(By.name("userName")).sendKeys("Tutorial");
				String data=row.getCell(k).getStringCellValue();
				System.out.println(data+ "  ");
				String expected_Title="Find";
				System.out.println("The Expected title is:" +expected_Title);
				String actual_Title=driver.getTitle();
				System.out.println("The Actual Title is:" +actual_Title);
				if(actual_Title.contains(expected_Title))
				{
					System.out.println("PASS");
					row.createCell(2).setCellValue("PASS");
				}
				else
				{
					System.out.println("FAIL");
				    row.createCell(2).setCellValue("FAIL");
				}
				FileOutputStream file1=new FileOutputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\TestNG_NewTours\\WorkBook8.xlsx");
				workbook.write(file1);
			}
			driver.navigate().back();
		System.out.println();
		}
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

	}

