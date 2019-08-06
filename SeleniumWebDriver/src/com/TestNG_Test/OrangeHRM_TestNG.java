package com.TestNG_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRM_TestNG 
{	
	WebDriver driver=null;
	String url="https://opensource-demo.orangehrmlive.com/";
	
	@BeforeTest
	public void LaunchOrangeHRM()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		System.out.println("Launch of OrangeHRM Application");
	}
	@Test
	public void LogIn() 
	{
		//<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("LogIn of OrangeHRM Application");
	}
	
	@AfterTest
	public void LogOut() throws InterruptedException
	{
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		driver.findElement(By.linkText("Welcome Admin")).click();
		Thread.sleep(5000);
		//<a href="/index.php/auth/logout">Logout</a>
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("LogOut of OrangeHRM Application");
	Thread.sleep(5000);
	driver.close();
	}
	
}
