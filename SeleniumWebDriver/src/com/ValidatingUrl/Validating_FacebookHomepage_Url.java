package com.ValidatingUrl;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_FacebookHomepage_Url 
{
public static void main(String[]args)
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.gmail.com");
String gmailTitle=driver.getTitle();
System.out.println("The title is:"+gmailTitle);
String actualresult_gmailhomepage=driver.getTitle();
System.out.println("The title of actual gmail homepage:"+actualresult_gmailhomepage);
String expectedresult_gmailhomepage="Gmail";
System.out.println("The title of expected gmail home page is:"+expectedresult_gmailhomepage);
if(actualresult_gmailhomepage.contains(expectedresult_gmailhomepage))
{
	System.out.println("Title matched-Pass");
}
else
{
	System.out.println("Title not matched-Fail");
}
driver.get("http://www.gmail.com");
String actualresult_gmailUrl=driver.getCurrentUrl();
System.out.println("The actual Url of gmail is:"+actualresult_gmailUrl);
String expectedresult_gmailUrl="http://www.Gmail.com";
System.out.println("The expected Url of gmail is:"+expectedresult_gmailUrl);
if(actualresult_gmailUrl.contains(expectedresult_gmailUrl))
{
	System.out.println("The Url matched-Pass");
}
else
{
	System.out.println("The Url not matched-Fail");
}
driver.close();
}
}
