package com.Links;

import java.util.List;	

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

public class NewTours_HomePage_LinksCount 
{

	public static void main(String[] args) throws InterruptedException 
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
		 /* <a href="mercurysignon.php">SIGN-ON</a>
		 <a href="mercuryregister.php">REGISTER</a>
		 <a href="mercuryunderconst.php">SUPPORT</a>
		 
		 */
		 List<WebElement>links=driver.findElements(By.tagName("a"));
		 int linksCount=links.size();
		 System.out.println("The total no of links on NewTours Home Page is:"+linksCount);
		 for(int i=0;i<linksCount;i++)
		 {
			 if(links.get(i).isDisplayed())
			 {
				 String linkName=links.get(i).getText();
		 System.out.println("The link name of the current webpage is:" +linkName);
		 
		 }
		 }
		 //<a href="mercurysignoff.php">SIGN-OFF</a>
		 driver.findElement(By.linkText("SIGN-OFF")).click();
		 Thread.sleep(5000);
		 driver.close();
		 }
}


