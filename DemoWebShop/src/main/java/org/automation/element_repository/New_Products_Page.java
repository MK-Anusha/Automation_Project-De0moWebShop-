package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_Products_Page extends Base_Page {

	public New_Products_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//================Web elements or Property================
	
	@FindBy(partialLinkText="New products")
	private WebElement NewProductOption;
	
	
	@FindBy(xpath="//div[@class=\"page-title\"]")
	private WebElement NewProductsPageTitle;
	
	//=================Getters or Public services================
	
	public WebElement getNewProductsOptions() {
		return NewProductOption;
	}
	
	public WebElement getNewProductsPageTitle() {
		return NewProductsPageTitle;
	}
	
	//================Business Logic or Action methods or Behavior================
	
	//  this method is to view all the new products released in the application.
	
	public void ViewNewProductsPage() {
		NewProductOption.click();
	     if(NewProductsPageTitle.isDisplayed()==true) {
	    	 System.out.println("New Products page is displayed ");
	     }
	     else {
	    	 System.out.println("New Products is not displayed");
	     }
	}

}
