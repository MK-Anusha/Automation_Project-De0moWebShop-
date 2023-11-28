package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jewerly_Page extends Base_Page{

	public Jewerly_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//================Web elements or Property================
	@FindBy(xpath="//a[@href=\"/jewelry\"]")
	private WebElement jewelleryModule;
	
	@FindBy(xpath="//img[@alt=\"Picture of Black & White Diamond Heart\"]")
	private WebElement jewerlyProduct;
	
	@FindBy(partialLinkText="Black & White Diamond Heart")
	private String jewerlyProductName;
	
	@FindBy(xpath="//input[@class=\"button-1 add-to-cart-button\"]")
	private WebElement addToCartButtonOfJewerly;
	
	@FindBy(xpath="//input[@class=\"button-2 add-to-wishlist-button\"]")
	private WebElement addToWishlistButtonOfJewerly;
	
	@FindBy(xpath="//input[@class=\"button-2 add-to-compare-list-button\"]")
	private WebElement addToCompareListButtonOfJewerly;
	
	//================Getters or Public services==================
	public WebElement getJewelleryModule() {
		return jewelleryModule;
	}
	
	public WebElement getJewerlyProduct() {
		return jewerlyProduct;
	}
	public WebElement getaddToCartButtonOfJewerly() {
		return addToCartButtonOfJewerly;
	}
    
	public WebElement getaddToWishlistButtonOfJewerly() {
		return addToWishlistButtonOfJewerly;
	}
	
	public WebElement getaddToCompareListButtonOfJewerly() {
		return addToCompareListButtonOfJewerly;
	}
	
	public String getJewerlyProductName() {
		return jewerlyProductName;
	}
	
	//================Business Logic or Action methods or Behavior================
	
	public void addJewelryProductToCart() {
		getJewelleryModule().click();
		jewerlyProduct.click();
		addToCartButtonOfJewerly.click();
		
	}
	
	public void addJewerlyProductToWishlist() {
		getJewelleryModule().click();
		jewerlyProduct.click();
		addToWishlistButtonOfJewerly.click();
		
	}
	
	public void addJewerlyProductToCompareList() {
		getJewelleryModule().click();
		jewerlyProduct.click();
		addToCompareListButtonOfJewerly.click();
	}
}
