package com.testcases;

import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.loginorangehrm;
import com.seleniumutils.Sellutils;

public class orangetest extends Library {
	Sellutils util;

	@BeforeClass
	public void startup() {
	launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
	
}
@Test
public void loginpage() {
	loginorangehrm hrm= new loginorangehrm(driver);
	hrm.login("Admin","admin123");
	
}	
	
@AfterClass
public void close() {
	

 util=new Sellutils(driver);
 
 util.getTitle();
 util.screenshot("src/test/resources/screenshots/orangetest.png");
 
 quit();
	
	
}
}
