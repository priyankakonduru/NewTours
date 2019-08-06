package com.Invalid_ValidData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest
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
