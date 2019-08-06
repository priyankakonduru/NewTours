package com.Task_Excel_Operation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleData_Operation_Excel 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		WebDriver driver=null;
		String url="http://newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\Task_Excel_Operation\\WorkBook.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		Row row=sheet.getRow(1);
		//<input type="text" name="userName" size="10">
		WebElement UserName=driver.findElement(By.name("userName"));
		UserName.sendKeys(row.getCell(0).getStringCellValue());
		//<input type="password" name="password" size="10">
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys(row.getCell(1).getStringCellValue());
		WebElement LogIn=driver.findElement(By.name("login"));
		LogIn.click();
		String Expected_LogIn="Find";
		System.out.println("The Expected login is:"+Expected_LogIn);
		String Actual_LogIn=driver.getTitle();
		System.out.println("The Actual LogIn is:"+Actual_LogIn);
		
		if(Actual_LogIn.contains(Expected_LogIn))
		{
			System.out.println("PASS");
			row.createCell(2).setCellValue("PASS");
		}
		else
		{
			System.out.println("FAIL");
			row.createCell(2).setCellValue("FAIL");
		}
		FileOutputStream file1=new FileOutputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\Task_Excel_Operation\\WorkBook.xlsx");
		workbook.write(file1);
		Thread.sleep(5000);
		
		driver.close();
	}
}
