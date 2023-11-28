package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computers_Page extends Base_Page {

	public Computers_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}	
		//================Web elements or Property================
		
		@FindBy(xpath="//a[@href=\"/computers\"]")
		private WebElement computermodule;
		
		@FindBy(xpath="//a[@href=\"/desktops\"]")
		private WebElement desktopLink;
		
		@FindBy(xpath="//a[@href=\"/build-your-cheap-own-computer\"]")
		private WebElement desktopProduct;
	
		@FindBy(xpath="//input[@class=\"button-2 product-box-add-to-cart-button\"]")
		private WebElement addToCartOfComputers;
		
		@FindBy(xpath="//input[@value=\"Add to cart\"]")
		private WebElement addToCartOfDesktopProduct;
		
		//================Getters or Public services==================
		public WebElement getComputerModule() {
			return computermodule;
		}
	
		public WebElement getDesktopModule() {
			return desktopProduct;
		}
		
		public WebElement getDesktopProduct() {
			return desktopProduct;
		}
	 
		public WebElement getAddToCartButtonOfComputers() {
			return addToCartOfComputers;
		}
		
		public WebElement getAddToCartButtonOfDesktop() {
			return addToCartOfDesktopProduct;
		}

}
