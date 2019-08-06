package com.Frames1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Operations_inJqueryUI {

	public static void main(String[] args) {
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
		//id="droppable"
		WebElement drop_Element=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag_Element, drop_Element).perform();
		driver.switchTo().defaultContent();
		////<a href="https://jqueryui.com/resizable/">Resizable</a>
		driver.findElement(By.linkText("Resizable")).click();
		driver.close();
			}

}
