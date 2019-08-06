package com.RadioButton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EchoEcho_RadioButton_Group2 
{

	WebDriver driver=null;
	String url="http://www.echoecho.com/htmlforms10.htm";
		
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void group2_RadioButtonTesting()
	{
		
	///html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td
			//<input type="radio" name="group2" value="Water">
			//<input type="radio" name="group2" value="Beer">
			//<input type="radio" name="group2" value="Wine" checked="">
			WebElement radiobutton_block=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
			List<WebElement>group2_radiobutton=radiobutton_block.findElements(By.name("group2"));
			int group2_radiobuttoncount=group2_radiobutton.size();
			System.out.println("The count of radio buttons are:"+group2_radiobuttoncount);
			for(int i=0;i<group2_radiobuttoncount;i++)
			{
				//String radiobuttonname=group1_radiobutton.get(i).getAttribute("value");
				//System.out.println(radiobuttonname);
				group2_radiobutton.get(i).click();
				for(int k=0;k<group2_radiobuttoncount;k++)
				{
					System.out.println(group2_radiobutton.get(k).getAttribute("value")+ " - " +group2_radiobutton.get(k).isSelected());
				}
			}
	}

	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
