package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList_Page extends Base_Page {

	public WishList_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	//================Web elements or Property================
	
	
	@FindBy(xpath="//input[@value=\"Update wishlist\"]")
	private WebElement updateWishlistButton;
	
	@FindBy(xpath="//input[@value=\"Add to cart\"]")
	private WebElement addToCartButtonInWishlist;
	
	@FindBy(name="itemquantity3622211")
	private WebElement quantityOfItem;
	
	@FindBy(name="removefromcart")
	private WebElement removeCheckbox;
	
	@FindBy(name="addtocart")
	private WebElement addToCartCheckbox;
	
	@FindBy(xpath="//input[@class=\"button-2 wishlist-add-to-cart-button\"]")
	private WebElement addToCartButtonOfWishList;
	
	
	//================Getters or Public services================
	
	
	
	public WebElement getUpdateWishlistOption() {
		return updateWishlistButton;
	}
	
	public WebElement getAddToCartButtonInWishlist() {
		return addToCartButtonInWishlist;
	}
	
	public WebElement getItemQuantity() {
		return quantityOfItem;
	}
	
	public WebElement getRemoveCheckboxOption() {
		return removeCheckbox;
	}
	
	public WebElement getAddToCartCheckbox() {
		return addToCartCheckbox;
	}
	
	public WebElement getAddToCartButtonOfWishLish() {
		return addToCartButtonInWishlist;
	}
	
	//================Business Logic or Action methods or Behavior================
	
	public void viewWishlishedItems() {
		getWishListLink().click();
	}
	
	public void removeItemFromWishList() {
		getWishListLink().click();
		removeCheckbox.click();
		updateWishlistButton.click();
	}
	
	public void AddWishlishedItemToCart() {
		getWishListLink().click();
		addToCartCheckbox.click();
		addToCartButtonInWishlist.click();
		
		
		
	}
	public void IncreaseOrDecreaseQuantitySize(CharSequence[] quantity) {
		getWishListLink().click();  //this method is imported from Base_Page
		quantityOfItem.clear();
		quantityOfItem.sendKeys(quantity);
	}

}
