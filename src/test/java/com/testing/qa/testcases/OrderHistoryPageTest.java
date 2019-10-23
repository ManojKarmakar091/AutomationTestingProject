package com.testing.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testing.qa.base.TestBase;
import com.testing.qa.pages.MyAccountPage;
import com.testing.qa.pages.LoginPage;
import com.testing.qa.pages.OrderHistoryPage;

public class OrderHistoryPageTest extends TestBase{

	
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	OrderHistoryPage orderhistorypage;
	
	public OrderHistoryPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
	initialization();
	 loginpage = new LoginPage();
	 myaccountpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	 orderhistorypage=myaccountpage.clickOnorderHistoryLink();
	 
	}
	
	@Test(priority=1)
	public void verifyOrderHistoryPageTitleTest(){
		boolean OrderHistoryPageLabel = orderhistorypage.verifyOrderHistoryPageLabel();
	    Assert.assertTrue(OrderHistoryPageLabel, "Label is not matched");
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
	
	
	
}
