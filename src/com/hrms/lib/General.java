 package com.hrms.lib;
 import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
	//re-usable fun
	public void openApplication() {
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Reporter.log("Application opened");
		Log.info("Application opened");
	}
	public void closeApplication() {
		driver.quit();
		System.out.println("Application Closed");
		Log.info("Application Closed");
	}
	public void login() throws Exception{
       driver.findElement(By.name(txt_loginname)).sendKeys(un);
	   driver.findElement(By.xpath(txt_passwaord)).sendKeys(pw);
	   driver.findElement(By.name(btn_login)).click();	
	   Thread.sleep(3000);
	   System.out.println("Login completed");
	   Log.info("Login Completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Log.info("Logout Completed");
	}
	public void addEmp() {
		System.out.println("Add emp");
	}
	public void delemp() {
		System.out.println("Delete emp"); 
	}
	
		
	
		  
		 
		
		
	}
	


