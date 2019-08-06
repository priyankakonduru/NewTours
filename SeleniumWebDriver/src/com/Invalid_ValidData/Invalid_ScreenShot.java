package com.Invalid_ValidData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Invalid_ScreenShot extends BaseTest
{
	@Test
	public void LOGIN() throws IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\Invalid_ValidData\\Invalid Screenshot.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(f1);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int rowCount=sheet.getLastRowNum();
		for(int i=1;i<rowCount;i++)
		{
			Row row=sheet.getRow(i);
				//<input name="txtUsername" id="txtUsername" type="text">
				driver.findElement(By.id("txtUsername")).sendKeys(row.getCell(0).getStringCellValue());
				//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
				driver.findElement(By.id("txtPassword")).sendKeys(row.getCell(1).getStringCellValue());
				//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
				driver.findElement(By.id("btnLogin")).click();
				String expected_LogIn="Welcome";
				System.out.println("The expected title after login is:"+expected_LogIn);
				//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
				WebElement actual_Element=driver.findElement(By.id("welcome"));
				String actual_LogIn=actual_Element.getText();
				System.out.println("The actual title after login is:"+actual_LogIn);
				if(actual_LogIn.contains(expected_LogIn))
				{
					System.out.println("LogIn successful-PASS");
				}
				else
				{
					System.out.println("Login failed-FAIL");
					File OHRM_InvalidData=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(OHRM_InvalidData, new File("./ScreenShots/OHRM.png"));
					driver.navigate().back();
					}
				FileOutputStream f2=new FileOutputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\Invalid_ValidData\\Invalid Screenshot.xlsx");
				workbook.write(f2);
		}
	}

}
