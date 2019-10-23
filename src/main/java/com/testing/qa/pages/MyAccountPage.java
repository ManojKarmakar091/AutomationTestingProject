package com.testing.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testing.qa.base.TestBase;

public class MyAccountPage extends TestBase {

	@FindBy(xpath = " //img[@class='logo img-responsive']")
	WebElement pageLogo;

	@FindBy(xpath = "//span[contains(text(),'Order history and details')]")
	WebElement orderHistory;

	@FindBy(xpath = "//span[contains(text(),'My credit slips')]")
	WebElement creditSlips;

	@FindBy(xpath = "//span[contains(text(),'My addresses')]")
	WebElement myAddress;

	@FindBy(xpath = "//span[contains(text(),'My personal information')]")
	WebElement personalInfo;

	@FindBy(xpath = "//span[contains(text(),'My wishlists')]")
	WebElement myWishlist;
	
	@FindBy(xpath="//span[contains(text(),'Home')]")
	WebElement homeButton;

	public MyAccountPage() {

		PageFactory.initElements(driver, this);

	}

	public String verifyPageTitle() {

		return driver.getTitle();

	}

	public boolean verifyPageLogo() {

		return pageLogo.isDisplayed();

	}

	public OrderHistoryPage clickOnorderHistoryLink() {

		orderHistory.click();

		return new OrderHistoryPage();

	}

	public CreditSlipsPage clickOnCreditSlips() {

		creditSlips.click();

		return new CreditSlipsPage();

	}

	public MyAddressPage clickOnMyAddressLink() {

		myAddress.click();

		return new MyAddressPage();

	}
	
	public PersonalInfoPage clickOnMyPersonalInfoLink() {

		personalInfo.click();

		return new PersonalInfoPage();
	

}
	
	
	
	public MyWishListPage clickOnMyWishListLink() {

		myWishlist.click();

		return new MyWishListPage();
	

}
	
	public HomePage clickOnHomeButton() {
		homeButton.click();
		
		return new HomePage();
		
		
		
		
	}
}
