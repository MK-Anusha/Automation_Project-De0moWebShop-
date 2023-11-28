package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Orders_Page extends Base_Page {

	public Orders_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}	
		//================Web elements or Property================
		
		@FindBy(linkText= "Orders")
		private WebElement myOrders;
	   
	   @FindBy(xpath="//input[@value=\"Details\"]")
	   private WebElement detailsButton;
	   
	   @FindBy(xpath="//input[@class=\"button-1 re-order-button\"]")
	   private WebElement reOrderButton;
	   
	   
	 //================Getters or Public services================
	   
	   public WebElement getMyOrders() {
		   return myOrders;
	   }
	   
	   

	   public WebElement getDetailsButton() {
		   return detailsButton;
	   }
	
	   public WebElement getReOrderButton() {
		   return reOrderButton;
	   }
	   
		//================Business Logic or Action methods or Behavior================
	   
	   public void ViewAllOrders() {
		   myOrders.click();
	   }
	   
	   public void orderDetails() {
		   
		   detailsButton.click();
	   }
	   
	    public void reOrder() {
		   reOrderButton.click();
	    }
	    
	   }


