package com.GetURL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_GetUrl {

	public static void main(String[] args) 
	{
	String url="http://www.facebook.com";
	System.setProperty("webdriver.chrome.driver", ".//DriverFiles//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get(url);
	String facebook_url=driver.getCurrentUrl();
	System.out.println("The current URL of facebook is:"+facebook_url);
	String facebook_Title=driver.getTitle();
	System.out.println("The Title of facebook is:"+facebook_Title);
	driver.close();
	}

}
