package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_BingHomePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//DriverFiles//chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.bing.com");
		//driver.navigate().to("http://bing.com");
		String expected_BingHome_PageTitle="Bing";
		System.out.println("The expected title home page of bing is:"+expected_BingHome_PageTitle);
		String actual_BingHome_PageTitle="Bing";
		System.out.println("The actual title home page of bing is:"+actual_BingHome_PageTitle);
		if(actual_BingHome_PageTitle.equals(expected_BingHome_PageTitle))
		{
			System.out.println("The Title matched- Pass");
		}
		else
		{
			System.out.println("The Title not matched- Fail");
		}
		
driver.close();
}

}