package com.Task_OrangeHRM;

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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_OrangeHRM_EmployeeList
{
	WebDriver driver=null;
	String url="https://opensource-demo.orangehrmlive.com/";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void LogInOrangeHRM() throws InterruptedException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\Task_OrangeHRM\\Workbook7.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		//<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
	    Thread.sleep(5000);
		//<a href="/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(10000);
		//<a href="/index.php/pim/viewEmployeeList/reset/1" id="menu_pim_viewEmployeeList">Employee List</a>
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();	
		//id="frmList_ohrmListComponent"
		Thread.sleep(10000);
		////*[@id="resultTable"]/thead/tr/th[2]
		////*[@id="resultTable"]/thead/tr/th[3]
		////*[@id="resultTable"]/thead/tr/th[4]
		////*[@id="resultTable"]/thead/tr/th[8]
		
		////*[@id="resultTable"]/tbody/tr[1]/td[2]
		////*[@id="resultTable"]/tbody/tr[25]/td[8]
		////*[@id="resultTable"]/thead/tr/th[1]
		////*[@id="resultTable"]/tbody/tr[1]/td[1]
		for(int i=1;i<=25;i++)
		{
			Row row=sheet.createRow(i);
			for(int j=1;j<=8;j++)
			{
				Cell cell=row.createCell(j);
				String EmployeeList=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[" +i+ "]/td[" +j+ "]")).getText();
				cell.setCellValue(EmployeeList);
				FileOutputStream file1=new FileOutputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\Task_OrangeHRM\\Workbook7.xlsx");
				workbook.write(file1);
			}
		}
	}
		
	@AfterTest
	public void teardown() throws InterruptedException
	{
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(10000);
		//<a href="/index.php/auth/logout">Logout</a>
		WebElement LogOut=driver.findElement(By.linkText("Logout"));
		LogOut.click();
		Thread.sleep(5000);
		driver.close();
	}
}
