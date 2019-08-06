package com.RediffMail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMail_Xpath_Dynamic 
{

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://register.rediff.com/register/register.php?FormName=user_details";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		//<input type="text" onblur="fieldTrack(this);" name="name1fa64ddd" value="" style="width:185px;" maxlength="61">
		//<input type="text" onblur="fieldTrack(this);" name="name433d93ef" value="" style="width:185px;" maxlength="61">
		//<input type="text" onblur="fieldTrack(this);" name="name6ccdc319" value="" style="width:185px;" maxlength="61">
		driver.findElement(By.xpath("//*[starts-with(@name,'name')]")).sendKeys("Testing");

	}

}
