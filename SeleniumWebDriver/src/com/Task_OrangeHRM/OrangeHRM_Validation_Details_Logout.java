package com.Task_OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM_Validation_Details_Logout {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		String url="http://opensource-demo.orangehrmlive.com";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\New folder\\eclipse-workspace\\SeleniumWebDriver\\DriverFiles\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.navigate().to(url);
		//<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
       //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
		String expected_ResultLogIn="Welcome";
		System.out.println("The expected result login page is:"+expected_ResultLogIn);
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		WebElement actual_Element=driver.findElement(By.id("welcome"));
		String actual_Text=actual_Element.getText();
		System.out.println("The actual result login page is:"+actual_Text);
		if(actual_Text.contains(expected_ResultLogIn))
		{
			System.out.println("LogIn Matched - PASS");
		}
		else
		{
			System.out.println("LogIn Failed-FAIL");
		}
		//<a href="/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		WebElement PIM_Element=driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions act=new Actions(driver);
		act.moveToElement(PIM_Element).perform();
		//<a href="/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		driver.findElement(By.id("firstName")).sendKeys("Priyanka");
		//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		driver.findElement(By.id("lastName")).sendKeys("Konduru");
		//<input class="formInputText" maxlength="10" type="text" name="employeeId" value="0017" id="employeeId">
		//<input type="button" class="" id="btnSave" value="Save">
		driver.findElement(By.id("btnSave")).click();
		String expected_PIM_AddEmployee="Employee List";
		System.out.println("The Expected Page after Adding employee is:"+expected_PIM_AddEmployee);
		//<a href="/index.php/pim/viewEmployeeList/reset/1" id="menu_pim_viewEmployeeList">Employee List</a>
		WebElement actual_PIM_AddEmployee=driver.findElement(By.id("menu_pim_viewEmployeeList"));
		String Actual_PIM_Text=actual_PIM_AddEmployee.getText();
		System.out.println("The Actual Title is:"+Actual_PIM_Text);
		if(Actual_PIM_Text.contains(expected_PIM_AddEmployee))
		{
			System.out.println("PIM of Add Employee-PASS");
		}
		else
		{
			
			System.out.println("PIM of Add Employee-FAIL");
		}
		//<input value="0018" type="text" name="personal[txtEmployeeId]" maxlength="10" 
		//class="editable" id="personal_txtEmployeeId" disabled="disabled">
			WebElement Actual_EmployeeID=driver.findElement(By.id("personal_txtEmployeeId"));
			String Actual_EmployeeID_Text=Actual_EmployeeID.getText();
			System.out.println("The text of Actual Employee ID is:"+Actual_EmployeeID);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(10000);
		//<a href="/index.php/auth/logout">Logout</a>
		WebElement LogOut=driver.findElement(By.linkText("Logout"));
		LogOut.click();
		Thread.sleep(5000);
		driver.close();
		
	}
}
