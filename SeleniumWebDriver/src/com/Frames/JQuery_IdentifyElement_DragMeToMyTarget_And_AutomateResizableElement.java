package com.Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuery_IdentifyElement_DragMeToMyTarget_And_AutomateResizableElement
{

	public static void main(String[] args) 
	{
	WebDriver driver=null;
	String url="https://jqueryui.com/droppable";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	//id="draggable"
	WebElement drag_Element=driver.findElement(By.id("draggable"));
	String drag_Element_Text=drag_Element.getText();
	System.out.println("The Text of drag element is:"+drag_Element_Text);
	driver.switchTo().defaultContent();
	//<a href="https://jqueryui.com/resizable/">Resizable</a>
	driver.findElement(By.linkText("Resizable")).click();
	System.out.println("The Title of Resizable WebPage is:" +driver.getTitle());
	driver.close();
	}

}
