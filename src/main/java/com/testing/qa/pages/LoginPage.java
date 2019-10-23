package com.testing.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.testing.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	
	@FindBy(xpath="//input[@id='email']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//p[@class='submit']//span[1]")
	WebElement signUpBtn;
	
	// Initializing the Page Objects:
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}

		// Actions:
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}

		public MyAccountPage login(String un, String pwd) {
			username.sendKeys(un);
			password.sendKeys(pwd);
			signUpBtn.click();

			return new MyAccountPage();
		}
		

}

