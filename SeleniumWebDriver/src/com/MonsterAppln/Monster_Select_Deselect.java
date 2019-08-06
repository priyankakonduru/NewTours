package com.MonsterAppln;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_Select_Deselect 
{

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="https://my.monsterindia.com/sponsored_popup.html";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		//<span class="filter-option pull-left">Industry</span>
		WebElement Industry=driver.findElement(By.linkText("Industry"));
		Select Selection1=new Select(Industry);
		Selection1.selectByIndex(1);
		Selection1.selectByVisibleText("Chemicals/Petrochemicals");
		Selection1.selectByValue("4");
	}

}
