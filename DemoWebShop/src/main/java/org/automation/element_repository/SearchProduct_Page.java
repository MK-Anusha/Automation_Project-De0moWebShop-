package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProduct_Page extends Base_Page {

	public SearchProduct_Page(WebDriver driver) {
		super(driver);
		
	}
	
	//================Web elements or Property================
	
	
	@FindBy(xpath="//input[@class=\"search-text valid\"]")
	private WebElement searchProductBykeyword;
	
	@FindBy(id="As")
	private WebElement advanceSearchCheckBox;
	
	
	//================Getters or Public services================
	
	
	
	public WebElement getSearchProductByKeyword() {
		return searchProductBykeyword;
	}
	
	public WebElement getAdvanceSearchCheckBox() {
		return advanceSearchCheckBox;
	}
	
	//================Business Logic or Action methods or Behavior================
	
	public void searchProduct(String productName) {
		getSearchStoreTextBox().clear(); //this method is imported from Base_Page
		getSearchStoreTextBox().click();
		getSearchStoreTextBox().sendKeys(productName);
		getSearchButton().click();  // this method is imported from Base_Page
	}
	

}
