package com.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_CheckAvailability_Click 
{

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=null;
	String url="https://www.tsrtconline.in/oprs-web/";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//<input type="button" name="searchBtn" id="searchBtn" 
	//class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">
	driver.findElement(By.name("searchBtn")).click();
	Alert alt=driver.switchTo().alert();
	String Alert_Text=alt.getText();
	System.out.println("The text of the alert is:"+Alert_Text);
	Thread.sleep(5000);
	alt.accept();
	driver.close();
	}

}
