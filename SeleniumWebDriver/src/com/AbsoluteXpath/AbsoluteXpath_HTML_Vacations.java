package com.AbsoluteXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbsoluteXpath_HTML_Vacations 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=null;
		String url="http://newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		//<a href="mercuryunderconst.php">Vacations</a>
		driver.findElement(By.linkText("Vacations")).click();
		///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
		WebElement backtohome=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img"));
		backtohome.click();
		Thread.sleep(5000);
		driver.close();
	}

}
