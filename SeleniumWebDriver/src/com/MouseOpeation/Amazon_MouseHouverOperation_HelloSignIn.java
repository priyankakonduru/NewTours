package com.MouseOpeation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_MouseHouverOperation_HelloSignIn
{

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=null;
	String url="http://amazon.in";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//id=nav-link-accountList
	WebElement helloSignIn=driver.findElement(By.id("nav-link-accountList"));
	Actions act=new Actions(driver);
	act.moveToElement(helloSignIn).perform();
	//<span class="nav-text">Your Wish List</span>
	driver.findElement(By.linkText("Your Wish List")).click();
	Thread.sleep(5000);
	driver.close();
	}

}
