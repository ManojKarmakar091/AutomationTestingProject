package com.testing.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testing.qa.base.TestBase;

public class CreditSlipsPage extends TestBase{

	
	@FindBy(xpath="//h1[@class='page-heading bottom-indent']")
	WebElement CredirSlipsPageLabel;
	
	
	public CreditSlipsPage() {

		PageFactory.initElements(driver, this);

	}
	
	
	public boolean verifyCreditSlipsPageLabel() {
		return CredirSlipsPageLabel.isDisplayed();
		
		
	}
}
