package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_ScreenShot 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=null;
		String url="http://bing.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		File Bing_ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Bing_ScreenShot,new File("./ScreenShots/Bing.png"));
		
		
		
		
		
		
		
	}

}
