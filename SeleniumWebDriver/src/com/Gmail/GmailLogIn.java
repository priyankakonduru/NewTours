package com.Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogIn
{
	

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
		

	 String url="http://www.gmail.com";
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	 //<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" spellcheck="false" tabindex="0" 
	//aria-label="Email or phone" name="identifier" autocapitalize="none" id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="" badinput="false">
	 driver.findElement(By.id("identifierId")).sendKeys("priyasparks26@gmail.com");
    ////*[@id="identifierNext"]/span/span
	 driver.findElement(By.id("identifierNext")).click();
	 
	}
}
