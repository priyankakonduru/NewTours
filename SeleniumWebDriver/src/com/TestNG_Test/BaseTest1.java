package com.TestNG_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest1
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
