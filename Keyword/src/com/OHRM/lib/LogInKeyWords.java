package com.OHRM.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInKeyWords 
{
	WebDriver driver=null;
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public void navigate()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	public void enterUserName()
	{
		//<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	public void enterPassword()
	{
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	public void LogIn()
	{
		//#btnLogin
		driver.findElement(By.cssSelector("#btnLogin")).click();	
	}


}
