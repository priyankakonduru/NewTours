package com.GetTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_CapturingTitle 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".//DriverFiles//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("http://facebook.com");
		driver.navigate().to("http://facebook.com");
String facebooktitle=driver.getTitle();
System.out.println("The title of Facebook home page is:"+facebooktitle);
driver.close();
	}

}
