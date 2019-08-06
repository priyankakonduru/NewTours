package com.TestNG_DateandTime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Capture_Allrows_AllColumns extends TestBase
{
@Test
public void CaptureAllRowsofAllColumns() throws IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\TestNG_DateandTime\\WorkBook6.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("sheet1");
	//first row of first column
	///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	//last row of last column
	///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
	for(int p=1;p<=36;p++)
	{
		Row row=sheet.createRow(p);
		for(int q=1;q<=8;q++)
		{
			Cell cell=row.createCell(q);
		String CityNames=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[" +p+ "]/td[" +q+ "]")).getText();
		cell.setCellValue(CityNames);
		FileOutputStream file1=new FileOutputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\TestNG_DateandTime\\WorkBook6.xlsx");
		workbook.write(file1);		
		}
		System.out.println();
	}
	
}
}
