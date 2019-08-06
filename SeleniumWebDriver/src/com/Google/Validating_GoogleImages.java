package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_GoogleImages
{

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://www.google.com";
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.navigate().to(url);
		//<a class="gb_d" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=ri0&amp;ogbl">Images</a>
		WebElement img=driver.findElement(By.linkText("Images"));
		String Images_Text=img.getText();
		System.out.println("The Text of Google Images is:"+Images_Text);
		img.click();
		System.out.println("The Title of Google Images is:"+driver.getTitle());

	driver.close();
	}

}
