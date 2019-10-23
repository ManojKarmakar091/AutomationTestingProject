package com.testing.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testing.qa.base.TestBase;

public class OrderHistoryPage extends TestBase{

	
	@FindBy(xpath="//h1[@class='page-heading bottom-indent']")
	WebElement OrderHistoryPageLabel;
	
	
	public OrderHistoryPage() {

		PageFactory.initElements(driver, this);

	}
	
	
	public boolean verifyOrderHistoryPageLabel() {
		return OrderHistoryPageLabel.isDisplayed();
		
		
	}
}
