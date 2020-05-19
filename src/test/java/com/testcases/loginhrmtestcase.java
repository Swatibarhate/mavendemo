package com.testcases;

import java.io.IOException;
import java.io.InterruptedIOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.orangehrm.pages.orangehrmlogin;

    public class loginhrmtestcase extends Library {

	@BeforeMethod
	public void launchbrowser() {
		
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
		
	}
	

	@Test
	
	public void login() {
		
		orangehrmlogin lpage=new orangehrmlogin(driver);
		lpage.loginToApp_username("Admin");
		lpage.loginToApp_password("admin123");
		lpage.loginToApp_Loginbutton();
	}
	
	@AfterMethod
	public void close() throws IOException  {
		screenshot("src/test/resources/screenshots/orangehrm.png");
		quit();
	
	}






	
		
	
}


