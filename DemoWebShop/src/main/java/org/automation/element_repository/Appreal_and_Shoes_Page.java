package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Appreal_and_Shoes_Page extends Base_Page {

	public Appreal_and_Shoes_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	//================Web elements or Property================
	
	@FindBy(xpath="//a[@href=\"/apparel-shoes\"]")
	private WebElement apparelsAndShoesModule;
	
	@FindBy(id="products-orderby")
	private WebElement sortByDropdown;
	
	@FindBy(id="products-pagesize")
	private WebElement displaySizeDropdown;
	
	@FindBy(xpath="//img[@alt=\"Picture of 50's Rockabilly Polka Dot Top JR Plus Size\"]")
	private WebElement apprealAndshoesProduct;
	
	@FindBy(xpath="//input[@class=\"button-1 add-to-cart-button\"]")
	private WebElement addToCartButtonOfAS;

	//================Getters or Public services==================
	
	public WebElement getApparelsAndShoesModule() {
		return apparelsAndShoesModule;
	}
	
	public WebElement getsortByDropdownOption() {
		return sortByDropdown;
	}
	
	public WebElement getDisplaySizeDropdownOption() {
		return displaySizeDropdown;
	}
	
	public WebElement getApprealAndShoesProduct() {
		return apprealAndshoesProduct;
	}
      
	public WebElement getAddToCartButtonOfApprealAndShoes() {
		return addToCartButtonOfAS;
	}

	
	//================Business Logic or Action methods or Behavior================
	
	public void viewProductBasedOnSortByField() {
		getApparelsAndShoesModule().click();
		sortByDropdown.click();
		
		apprealAndshoesProduct.click();
		addToCartButtonOfAS.click();
		getShoppingCartLink().click();
		
	}
}
