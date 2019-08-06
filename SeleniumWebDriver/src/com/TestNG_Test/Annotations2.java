package com.TestNG_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 
{
	@BeforeTest
	public void GmailApplicationLaunch()
	{
		System.out.println("Gmail Application Launch");
	}
	@Test(priority=1)
	public void Inbox()
	{
		System.out.println("Testing Inbox functionality");
	}
	@Test(priority=2)
	public void Sentmail()
	{
		System.out.println("Testing Sentmail functionality");
	}
	@Test(enabled=false)
	public void Composemail()
	{
		System.out.println("testing Composemail functionality");
	}
	@AfterTest
	public void GmailApplicationClose()
	{
		System.out.println("Closing Gmail Application");
	}
}


