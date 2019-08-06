package com.TestNG_Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 
{
	@BeforeMethod
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
	@AfterMethod
	public void GmailApplicationClose()
	{
		System.out.println("Closing Gmail Application");
	}

}
