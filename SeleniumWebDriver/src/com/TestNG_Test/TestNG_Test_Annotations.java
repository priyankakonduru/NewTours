package com.TestNG_Test;

import org.testng.annotations.Test;

public class TestNG_Test_Annotations 
{
	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("Launch of Browser");
	}
	@Test(priority=2)
	public void NavigateToGmailApplication()
	{
		System.out.println("Navigated to Gmail Application");
	}
	@Test(enabled=false)
	public void LogIn()
	{
		System.out.println("LogIn to Gmail Application");
	}
	@Test(priority=3)
	public void Inbox()
	{
		System.out.println("Testing Inbox Finctionality");
	}
}
