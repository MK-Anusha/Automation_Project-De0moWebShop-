package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping_Cart_Page extends Base_Page {

	public Shopping_Cart_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	

	//================Web elements or Property================
	 // change option to link everywhere
	
	@FindBy(linkText="Shopping cart") 
	private WebElement shoppingCartLink;
	
	@FindBy(name="updatecart")
	private WebElement updateCartButton;
	
	@FindBy(name="continueshopping")
	private WebElement continueShoppingButton;
	
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	private WebElement removeFromCartCheckBox;
	
	@FindBy(xpath="//input[@class=\"qty-input\"]")
	private WebElement productQuantityCheckBox;
	
	@FindBy(id="termsofservice")
	private WebElement agreeCheckBox;
	
	@FindBy(id="checkout")
	private WebElement checkOutButton;
	
	//================Getters or Public services================
	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
	
	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}
	
	public WebElement getContinueShoppingButton() {
		return continueShoppingButton;
	}
	
	public WebElement getRemoveFromCartCheckbox() {
		return removeFromCartCheckBox;
	}
	
	public WebElement getProductQuantityCheckbox() {
		return productQuantityCheckBox;
	}
	
	public WebElement getTermsOfServiceCheckbox() {
		return agreeCheckBox;
	}
	
	public WebElement getCheckOutButton() {
		return checkOutButton;
	}
	

	//================Business Logic or Action methods or Behavior================
	
	public void viewShoppingCartProducts() {
		getShoppingCartLink().click();
	}
	
	public void removeShoppingCartProduct() {
		getShoppingCartLink().click();
		removeFromCartCheckBox.click();
		updateCartButton.click();
		agreeCheckBox.click();
		checkOutButton.click();
		
	}
	
	public void AddNewProductToShoppingCartPage()
	{
		getShoppingCartLink().click();
		continueShoppingButton.click();
		//need to write code for add a product from books page
		agreeCheckBox.click();
		checkOutButton.click();
		
	}
	
	public void IncreaseOrDecreaseProductQuantityInShoppingCartPage(String productQuantity) {
		getShoppingCartLink().click();  //this method is imported from Base_Page
		productQuantityCheckBox.clear();
		productQuantityCheckBox.sendKeys(productQuantity);
		updateCartButton.click();
		
		
		
	}
}
