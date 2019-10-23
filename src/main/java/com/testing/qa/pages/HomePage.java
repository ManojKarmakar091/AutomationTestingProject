package com.testing.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testing.qa.base.TestBase;

public class HomePage extends TestBase{

	
	@FindBy(xpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]")
	WebElement womenlink;
	
	public HomePage() {

		PageFactory.initElements(driver, this);

	}
	
	
	public String verifyHomePageTitle() {
		
		return driver.getTitle();
	}
	
	public WomenCategoryPage clickOnTshirtsLink() {
		
		
		Actions action = new Actions(driver);
		action.moveToElement(womenlink).build().perform();
		
		driver.findElement(By.linkText("T-shirts")).click();
		
		
		
		return new WomenCategoryPage();
		
	}
	
	
	
	
}
