package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingFacebookLogIn 
{

	public static void main(String[] args) 
	{
		String url ="http://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		driver.findElement(By.id("email")).sendKeys("danush.dashrath@gmail.com");
		//<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		driver.findElement(By.id("pass")).sendKeys("priyankad9");
		//<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_a">
		driver.findElement(By.id("u_0_a")).click();
		String expresult_fblogin="Facebook";
		System.out.println("The Expected login page of facebook is:"+expresult_fblogin);
		String actresult_fblogin=driver.getTitle();
		System.out.println("The Actual login page of facebook is:"+actresult_fblogin);
		if(actresult_fblogin.contains(expresult_fblogin))
		{
			System.out.println("The Title matched-PASS");
		}
		else
			
		{
			System.out.println("The Title not matched-FAIL");
		}
		
		
		
		}

}
