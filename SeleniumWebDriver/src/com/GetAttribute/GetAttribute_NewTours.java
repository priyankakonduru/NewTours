package com.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_NewTours 
{

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//<a href="mercuryregister.php">REGISTER</a>
		String Register_URL=driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		System.out.println("The URL of Register page is:"+Register_URL);
		//<input type="text" name="userName" size="10">
		String UserName=driver.findElement(By.name("userName")).getAttribute("name");
		System.out.println("The User name is:"+UserName);
		driver.close();
	}
}
