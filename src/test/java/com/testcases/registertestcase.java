package com.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.Facebookregister;

public class registertestcase extends Library {
	@BeforeClass
	public void startUp() {
		
		launchApplication("chrome","https://www.facebook.com/");
		
	}
	@Test
	public void signup() {
		WebDriver driver=null;
		Facebookregister regpage=new Facebookregister(driver);
		regpage.fname("rati");
		regpage.lname("shah");
		regpage.mno("123456");
		regpage.newpwd("swati");
		regpage.birthday("Feb", 14, "2007");
	}
	@AfterClass
	public void close() throws IOException {
		screenshot("src/test/resources/screenshots/facebookreg.png");
		quit();
				
			
	}

}
