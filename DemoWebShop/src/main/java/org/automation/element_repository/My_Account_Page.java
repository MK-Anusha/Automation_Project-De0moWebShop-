package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account_Page extends Base_Page {

	public My_Account_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	//================Web elements or Property================
	
   @FindBy(partialLinkText="My account")
   private WebElement myAccountlink;
   
	@FindBy(partialLinkText="Customer info")
	private WebElement customerInfolink;
	
	@FindBy(linkText="Wishlist") 
	private WebElement wishListLink;
	
	@FindBy(xpath="//a[@href=\"/customer/addresses\"]")
	private WebElement addressesLink;
	
	//================Getters or Public services================
	
	public WebElement getMyAccountPage() {
		return myAccountlink;
	}
	
	public WebElement getCustomerInfoPage() {
		return customerInfolink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}
	public WebElement getAddressLink() {
		return addressesLink;
	}
}
