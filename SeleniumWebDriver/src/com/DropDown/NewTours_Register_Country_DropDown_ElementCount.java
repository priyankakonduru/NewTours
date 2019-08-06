package com.DropDown;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class NewTours_Register_Country_DropDown_ElementCount 
{

	public static void main(String[] args) throws IOException 
	{
		
      WebDriver driver=null;
      String url="http://newtours.demoaut.com/";
      System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe" );
      driver=new ChromeDriver();
      driver.get(url);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //<a href="mercuryregister.php">REGISTER</a>
      WebElement register=driver.findElement(By.linkText("REGISTER"));
      register.click();
      //name=country
      WebElement country=driver.findElement(By.name("country"));
      List<WebElement>countries=country.findElements(By.tagName("option"));
      int CountriesCount=countries.size();																
      System.out.println("The total number of countries are:"+CountriesCount);
      FileInputStream file=new FileInputStream("C:\\\\Users\\\\hp\\\\Desktop\\\\New folder\\\\eclipse-workspace\\\\SeleniumWebDriver\\\\src\\\\com\\\\DropDown\\\\WorkBook5.xlsx");
      XSSFWorkbook workbook=new XSSFWorkbook(file);
      XSSFSheet sheet=workbook.getSheet("sheet1");
      for(int k=0;k<CountriesCount;k++)
      {
    	  Row row=sheet.createRow(k);
    	  Cell cell=row.createCell(0);
    	   String CountryName=countries.get(k).getText();
    	  System.out.println(k+"   "+CountryName);
    	  cell.setCellValue(CountryName);
    	  FileOutputStream file1=new FileOutputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\com\\DropDown\\WorkBook5.xlsx");
    	  workbook.write(file1);
     }
      driver.quit();
	}

}
