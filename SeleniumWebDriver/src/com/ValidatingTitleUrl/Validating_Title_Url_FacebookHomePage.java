package com.ValidatingTitleUrl;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_Title_Url_FacebookHomePage 
{
	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.chrome.driver", ".//DriverFiles//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		String expected_facebookHome_PageTitle="Facebook – log in or sign up";
		System.out.println("The expected title home page of facebook is:"+expected_facebookHome_PageTitle);
		String actual_facebookHome_PageTitle=driver.getTitle();
		System.out.println("The actual title home page of facebook is:"+actual_facebookHome_PageTitle);
		if(actual_facebookHome_PageTitle.equals(expected_facebookHome_PageTitle))
		{
			System.out.println("The Title matched- Pass");
		}
		else
			
		{
			System.out.println("The Title not matched- Fail");
		}
		String Url="http://facebook.com";
		driver.get(Url);
		String expected_facebookHome_PageUrl="facebook.com";
		System.out.println("The expected URL home page of facebook is:"+expected_facebookHome_PageUrl);
		String actual_facebookHome_PageUrl=driver.getCurrentUrl();
		System.out.println("The actual URL home page of facebook is:"+actual_facebookHome_PageUrl);
		if(actual_facebookHome_PageUrl.contains(expected_facebookHome_PageUrl))
		{
			System.out.println("URl matched- Pass");
		}
		else
		{
			System.out.println("URL not matched- Fail");
		}
		driver.close();
		
	}

}
