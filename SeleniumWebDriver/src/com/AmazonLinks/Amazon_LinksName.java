package com.AmazonLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_LinksName 
{

	public static void main(String[] args) 
	{
		WebDriver driver=null;
	String url="http://www.amazon.in";	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	List<WebElement>links=driver.findElements(By.tagName("a"));
	int linksCount=links.size();
	System.out.println("The total no of links are:"+linksCount);
	for(int p=0;p<linksCount;p++)
	{
		if(links.get(p).isDisplayed())
		{
		String linkName=links.get(p).getText();
		System.out.println(p+ "  " +linkName);
		}	
	}driver.close();
	}

}
