package com.testing.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testing.qa.base.TestBase;
import com.testing.qa.pages.MyAccountPage;
import com.testing.qa.pages.LoginPage;



public class MyAccountPageTest extends TestBase{
	
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	
	public MyAccountPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
	initialization();
	 loginpage = new LoginPage();
	 myaccountpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	 
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String myaccountPageTitle = myaccountpage.verifyPageTitle();
	    Assert.assertEquals(myaccountPageTitle, "My account - My Store", "Title is not matched");
		
	}

	@Test(priority=2)
	public void verifyMyAccountPageLogoTest(){
		Boolean bol = myaccountpage.verifyPageLogo();
		
	Assert.assertTrue(bol);
		
	}
	
	@Test(priority=3)
	public void clickOnorderHistoryLinkTest(){
		
	
		myaccountpage.clickOnorderHistoryLink();
		
		
	}
	
	@Test(priority=4)
	public void clickOnCreditSlipsTest() {
		
		
		myaccountpage.clickOnCreditSlips();
	}
	
	@Test(priority=5)
	public void clickOnMyAddressTest() {
		
		
		myaccountpage.clickOnMyAddressLink();
	}
	
	@Test(priority=6)
	public void clickOnMyPersonalInfoTest() {
		
		
		myaccountpage.clickOnMyPersonalInfoLink();
	}
	
	@Test(priority=7)
	public void clickOnMyWishListTest() {
		
		
		myaccountpage.clickOnMyWishListLink();
	}
	
	@Test
	public void clickOnHomeButtonTest() {
		
		
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.close();
	}

	
	
	
	
	
	
	

}
