package com.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.Facebooklogin;


public class Logintestcases  extends Library  {
	
	@BeforeClass
	public void startUp() {
		
		launchApplication("chrome","https://www.facebook.com/");
		
	}
	


	@Test
	
	public void login() {
	
		WebDriver driver = null;
		Facebooklogin lpage=new Facebooklogin(driver);
		lpage.loginToApp_username("swati@gmail.com");
		lpage.loginToApp_password("abcd");
		lpage.loginToApp_Loginbutton();
	}
	
	@AfterClass
	public void close() throws IOException {
		screenshot("src/test/resources/screenshots/facebook.png");
		quit();
	
	}
}

	


