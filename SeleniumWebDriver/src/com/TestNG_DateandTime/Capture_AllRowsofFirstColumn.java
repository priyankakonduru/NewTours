package com.TestNG_DateandTime;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Capture_AllRowsofFirstColumn extends TestBase
{
@Test
public void CaptureAllRowsofFirstColumn()
{
	//first row of first column
	///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	//last row of first column
	///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
	//String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	//String part2="]/td[1]";
	
	for(int p=1;p<=36;p++)
	{
		String data=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+p+"]/td[1]")).getText();
		System.out.println(data);
	}
}
}
