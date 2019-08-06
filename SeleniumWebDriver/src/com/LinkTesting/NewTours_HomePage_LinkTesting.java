package com.LinkTesting;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_HomePage_LinkTesting
{
	public static void main(String[]args) throws IOException, InterruptedException
	{
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int linksCount=links.size();
		System.out.println("The count of the links is:"+linksCount);
		for(int i=0;i<linksCount;i++)
		{
			String linkName=links.get(i).getText();
			System.out.println("The name of the link is:"+linkName);
			links.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			File NewTours_ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(NewTours_ScreenShot,new File("./ScreenShots" +linkName+ ".png"));
			System.out.println("=======================================================");
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
					
		}
		
		driver.close();
	}
}
