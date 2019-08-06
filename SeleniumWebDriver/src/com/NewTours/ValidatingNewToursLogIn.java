package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingNewToursLogIn 
{

	public static void main(String[] args)
	{
	WebDriver driver=null;
	String url="http://newtours.demoaut.com";
	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe" );
	 driver=new ChromeDriver();
	 driver.get(url);
	 //<input type="text" name="userName" size="10">
	 driver.findElement(By.name("userName")).sendKeys("tutorial");
	 //<input type="password" name="password" size="10">
	 driver.findElement(By.name("password")).sendKeys("tutorial");
	 //<input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">
	 driver.findElement(By.name("login")).click();
	 String expected_resultLogIn="Find";
	System.out.println("The expected result login is:"+expected_resultLogIn);
	 String actual_resultLogIn=driver.getTitle();
	 System.out.println("The actual result is:"+actual_resultLogIn);
	 if(actual_resultLogIn.contains(expected_resultLogIn))
	 {
		 System.out.println("The Title Matched-PASS");
		 	 }
	 else
	 {
		 System.out.println("The Title not Matched-FAIL");
	 }
	 driver.quit();
	}

}
