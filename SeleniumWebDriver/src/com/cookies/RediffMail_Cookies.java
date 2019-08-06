package com.cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMail_Cookies 
{

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://register.rediff.com/register/register.php?FormName=user_details";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		Set<Cookie>RediffMailHomePageCookies=driver.manage().getCookies();
		int CookiesCount=RediffMailHomePageCookies.size();
		System.out.println("The total no of cookies are:"+CookiesCount);
		for(Cookie var:RediffMailHomePageCookies)
		{
			System.out.println(var);
		}
		driver.manage().deleteAllCookies();
		RediffMailHomePageCookies=driver.manage().getCookies();
		CookiesCount=RediffMailHomePageCookies.size();
		System.out.println("The total no of cookies are:"+CookiesCount);
	}

}
