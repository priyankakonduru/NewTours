package com.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_HomePage_XPath 
{

	public static void main(String[] args) 
	{
		WebDriver driver=null;
	String url="https://www.facebook.com/";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	//<input type="email" class="inputtext" name="email" id="email" value="danush.dashrath@gmail.com" data-testid="royal_email">
	driver.findElement(By.xpath("//*[@class='inputtext']")).sendKeys("testing");
	//<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
	driver.findElement(By.xpath("//*[@data-testid='royal_pass']")).sendKeys("testing");
	}

}
