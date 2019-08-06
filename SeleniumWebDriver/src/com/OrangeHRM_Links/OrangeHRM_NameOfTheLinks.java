package com.OrangeHRM_Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_NameOfTheLinks 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		String url="http://opensource-demo.orangehrmlive.com";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.navigate().to(url);
		//<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
		String expected_ResultLogIn="Welcome";
		System.out.println("The expected result login page is:"+expected_ResultLogIn);
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		WebElement actual_Element=driver.findElement(By.id("welcome"));
		String actual_Text=actual_Element.getText();
		System.out.println("The actual result login page is:"+actual_Text);
		
		if(actual_Text.contains(expected_ResultLogIn))
		{
			System.out.println("LogIn Matched - PASS");
		}
		else
		{
			System.out.println("LogIn Failed-FAIL");
		}
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int linksCount=links.size();
		System.out.println("The Total no of links in OrangeHRM is:"+linksCount);
		for(int i=0;i<linksCount;i++)
		{
			if(links.get(i).isDisplayed())
			{
		String linksName=links.get(i).getText();
		System.out.println("The name of the links in the login page is:"+linksName);
		
			}
			
		}
		actual_Element.click();
		Thread.sleep(10000);
		//<a href="/index.php/auth/logout">Logout</a>
		WebElement LogOut=driver.findElement(By.linkText("Logout"));
	LogOut.click();
	Thread.sleep(5000);
	driver.close();
		
	}

}
