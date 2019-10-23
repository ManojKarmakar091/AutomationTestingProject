package com.testing.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testing.qa.base.TestBase;
import com.testing.qa.pages.CreditSlipsPage;
import com.testing.qa.pages.MyAccountPage;
import com.testing.qa.pages.LoginPage;

public class CreditSlipsPageTest extends TestBase{

	LoginPage loginpage;
	MyAccountPage myaccountpage;
	CreditSlipsPage creditslipspage;
	
	public CreditSlipsPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
	initialization();
	 loginpage = new LoginPage();
	 myaccountpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	 creditslipspage =myaccountpage.clickOnCreditSlips();
	 
	}
	
	@Test(priority=1)
	public void verifyCreditSlipsPageLabelTest(){
		boolean creditSlipsPageLabel = creditslipspage.verifyCreditSlipsPageLabel();
	    Assert.assertTrue(creditSlipsPageLabel, "Credit slips label is not matched");
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
}
