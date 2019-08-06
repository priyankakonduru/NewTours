package com.AutomationTesting;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Automation 
{
public static void main(String[]args)
{
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
//ChromeDriver driver=new ChromeDriver();
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\geckodriver.exe");
//FirefoxDriver driver=new FirefoxDriver();
System.setProperty("webdriver.edge.driver", ".//DriverFiles//msedgedriver.exe");
EdgeDriver driver=new EdgeDriver();
}
}
