package com.OHRM.TestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OHRM.lib.LogInKeywords;

public class LogInTest 
{
	
	@Test
	public void LogIn() throws IOException
	{
		LogInKeywords keys=new LogInKeywords();
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\ExcelTestDataFiles\\ActionsKeyword.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		int rowCount=ws.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			r=ws.getRow(i);
			String runMode=r.getCell(4).getStringCellValue();
			if(runMode.equals("Y"))
			{
				String Keyword=r.getCell(3).getStringCellValue();
				if(Keyword.equals("Launch Browser"))
				{
					keys.LaunchBrowser();
				}
				else if(Keyword.equals("navigate"))
				{
					keys.navigate();
				}
				else if(Keyword.equals("enter Username"))
				{
					keys.enterUserName();
				}
				else if(Keyword.equals("enter Password"))
				{
					keys.enterPassword();
				}
				else if(Keyword.equals("ClickLogin"))
				{
					keys.ClickLogIn();
				}
			}
		}
	}
}