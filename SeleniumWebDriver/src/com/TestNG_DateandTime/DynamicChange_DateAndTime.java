package com.TestNG_DateandTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicChange_DateAndTime extends TestBase

{
	@Test
      public void DynamicWebTable_DataCapture()
	{
	///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table
	WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
	
	
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	for(int i=0;i<rows.size();i++)
	{
		List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
		for(int k=0;k<cols.size();k++)
		{
			String data=cols.get(k).getText();
			System.out.print(data+ "  ");
		}
		System.out.println();
	}
	}
   
	
	
}
