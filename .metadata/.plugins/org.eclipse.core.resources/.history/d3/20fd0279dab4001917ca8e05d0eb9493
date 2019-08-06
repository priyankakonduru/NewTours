package com.TestNG_NewTours;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTours_Properties_Config extends BaseTest
{
	
	@Test
	public void NewTours_Properties() throws IOException 
	{
		FileInputStream file= new FileInputStream("C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\src\\Config\\NewTours.properties");
		Properties prop=new Properties();
		prop.load(file);
		WebElement userName=driver.findElement(By.name(prop.getProperty("uName")));
		userName.sendKeys(prop.getProperty("UserName"));
		WebElement password=driver.findElement(By.name(prop.getProperty("pwd")));
		password.sendKeys(prop.getProperty("Password"));
		WebElement signIn=driver.findElement(By.name(prop.getProperty("signIn")));
		signIn.click();
		String expected_Title="Find";
		System.out.println("The expected title is:"+expected_Title);
		String actual_Title=driver.getTitle();
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
			
		}
	}

}
