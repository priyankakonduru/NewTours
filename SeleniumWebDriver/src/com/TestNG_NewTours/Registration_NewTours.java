package com.TestNG_NewTours;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Registration_NewTours extends BaseTest
{
	@Test(priority=1)
	public void Register()
	{
		//<a href="mercuryregister.php?osCsid=d0c5292c4add16c30cacbd702f6a6988">REGISTER</a>
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();		
	}
	
	@Test(priority=2)
	public void UserRegistration() throws IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\TestNG_NewTours\\WorkBook9.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rowcount=sheet.getLastRowNum();
		for(int i=1;i<rowcount;i++)
		{
			Row row=sheet.getRow(i);
			//<input maxlength="60" name="firstName" size="20">
			driver.findElement(By.name("firstName")).sendKeys(row.getCell(0).getStringCellValue());
			
			//<input maxlength="60" name="lastName" size="20">
			driver.findElement(By.name("lastName")).sendKeys(row.getCell(1).getStringCellValue());
			
			//<input maxlength="20" name="phone" size="15">
			double phone =row.getCell(2).getNumericCellValue();
			long phoneno=(long)phone;
			String phonenum=Long.toString(phoneno);
			driver.findElement(By.name("phone")).sendKeys(phonenum);
			
			//<input name="userName" id="userName" size="35" maxlength="64">
			driver.findElement(By.name("userName")).sendKeys(row.getCell(3).getStringCellValue());
			
			//<input maxlength="60" name="address1" size="40">
			driver.findElement(By.name("address1")).sendKeys(row.getCell(4).getStringCellValue());
			
			//<input maxlength="60" name="city" size="15">
			driver.findElement(By.name("city")).sendKeys(row.getCell(5).getStringCellValue());
			
			//<input maxlength="40" name="state">
			driver.findElement(By.name("state")).sendKeys(row.getCell(6).getStringCellValue());
			
			//<input maxlength="20" name="postalCode" size="15">
			double postal=row.getCell(7).getNumericCellValue();
			long postalno=(long)postal;
			String postalcode=Long.toString(postalno);
			driver.findElement(By.name("postalCode")).sendKeys(postalcode);
			
			//name="country"
			driver.findElement(By.name("country")).sendKeys(row.getCell(8).getStringCellValue());
			
			//<input name="email" id="email" size="20" maxlength="60">
			driver.findElement(By.name("email")).sendKeys(row.getCell(9).getStringCellValue());
			
			//<input maxlength="60" name="password" size="20" type="password">
			driver.findElement(By.name("password")).sendKeys(row.getCell(10).getStringCellValue());
			
			//<input maxlength="60" name="confirmPassword" size="20" type="password">
			driver.findElement(By.name("confirmPassword")).sendKeys(row.getCell(11).getStringCellValue());
			
			Thread.sleep(5000);
			//<input type="image" name="register" src="/images/forms/submit.gif" width="60" height="23" border="0">
			driver.findElement(By.name("register")).click();
			
			String expected_UserName=row.getCell(9).getStringCellValue();
			System.out.println("The expected username is:" +expected_UserName);
			String actual_UserName=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			
			if(actual_UserName.contains(expected_UserName))
			{
				System.out.println("User Registration Successfully-PASS");
				row.createCell(12).setCellValue("User Registration Successfully-PASS");
			}
			else
			{
				System.out.println("User registration not successful-FAIL");
				row.createCell(12).setCellValue("User registration not successful-FAIL");
			}
			Thread.sleep(5000);
			driver.navigate().back();
			
			Thread.sleep(5000);
			FileOutputStream file1=new FileOutputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\TestNG_NewTours\\WorkBook9.xlsx");
			workbook.write(file1);			
			
		}
			
	}
}
