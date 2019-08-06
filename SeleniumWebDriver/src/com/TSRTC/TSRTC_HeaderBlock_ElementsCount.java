package com.TSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlock_ElementsCount {

	public static void main(String[] args) {
		WebDriver driver=null;
		 String url="http://transport.telangana.gov.in/";
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
		 driver.manage().window().maximize();
		 //class="topmenuwrap"
		 WebElement HeaderBlock=driver.findElement(By.className("topmenuwrap"));
		 List<WebElement>HeaderBlocklink=HeaderBlock.findElements(By.tagName("a"));
		int HeaderBlocklinkCount=HeaderBlocklink.size();
		System.out.println("The count in the HeaderBlock id:"+HeaderBlocklinkCount);
		for(int h=0;h<HeaderBlocklinkCount;h++)
		{
			if(HeaderBlocklink.get(h).isDisplayed())
			{
			String HeaderBlocklinkName=HeaderBlocklink.get(h).getText();
			System.out.println(h+ " -  " +HeaderBlocklinkName);
		}
		}
		driver.close();
		
	}

}
