package com.TestNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Capturing_Data_FirstRowofFirstCloumn
{
	WebDriver driver=null;
	String url="https://www.timeanddate.com/worldclock/";
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
public void CaptureFirstRowofFirstColumnData()
{
	//<a href="/worldclock/ghana/accra">Accra</a>
 WebElement data=driver.findElement(By.linkText("Accra"));
 data.getText();
}
@AfterTest
public void teardown()
{
	driver.close();
}
}
