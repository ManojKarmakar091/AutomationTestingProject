package com.testing.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testing.qa.base.TestBase;
import com.testing.qa.pages.MyAccountPage;
import com.testing.qa.pages.LoginPage;



public class LoginPageTest extends TestBase{
	
	
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=2)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login - My Store");
	}
	
	
	
	@Test(priority=1)
	public void loginTest(){
		myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
	
	
	

}
