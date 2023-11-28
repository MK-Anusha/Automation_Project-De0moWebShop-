package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books_Page extends Base_Page {

	public Books_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	//================Web elements or Property================
	
	@FindBy(partialLinkText="BOOKS") 
	private WebElement booksModule;
	
     @FindBy(xpath="//div[@class=\"page category-page\"]")
     private WebElement booksCategoryPage;
     
     @FindBy(xpath="//img[@alt=\"Picture of Health Book\"]")
     private WebElement healthbookProduct;
     
     @FindBy(xpath="//img[@alt=\"Picture of Computing and Internet\"]")
     private WebElement computingAndInternetBook;
     
     @FindBy(xpath="//input[@class=\"button-2 product-box-add-to-cart-button\"]")
     private WebElement addToCartButtonOfBooks;
     
     @FindBy(xpath="//input[@class=\"button-2 add-to-wishlist-button\"]")
     private WebElement addToWishlistButtonOfBooks;
     
     @FindBy(xpath="//input[@value=\"Add to compare list\"]")
     private WebElement addToCompareListButton;
     
 	//================Getters or Public services==================
     public WebElement getBooksModule() {
 		return booksModule;
 	}
     
     public WebElement getBookCategoryPage() {
    	 return booksCategoryPage;
     }
     
     public WebElement getHealthBookProduct() {
    	 return healthbookProduct;
     }
      public WebElement getComputingAndInternetBook() {
    	  return computingAndInternetBook;
      }
      
      public WebElement getAddToCartButtonOfBooks() {
    	  return addToCartButtonOfBooks;
      }
     
      public WebElement getAddToWishlishButtonOfBooks() {
    	  return addToWishlistButtonOfBooks;
      }
      
      public WebElement getAddToCompareListButton() {
    	  return addToCompareListButton;
      }
      
    //================Business Logic or Action methods or Behavior================
      
      public void addBooksProductToWishlish() {
    	  getBooksModule().click();
    	  healthbookProduct.click();
    	  addToWishlistButtonOfBooks.click();
    	  if(getWishListLink().isDisplayed()==true) {
    		  System.out.println("books product is added to wishlist page");
    	  }
    	  else {
    		  System.out.println(" books product is not added to wishlist page ");
    	  };
    	  
  	
    	  
      }
      
      public void viewBooksProduct() {
    	  getBooksModule().click();
    	  
    	  if(booksCategoryPage.isDisplayed()==true) {
    		  System.out.println("All books product is displayed ");
    	  }
    	  else {
    		  System.out.println("No products available here");
    	  }
     }
      
      public void addBooksProductToCompareList() {
    	  getBooksModule().click();
    	  computingAndInternetBook.click();
    	  addToCompareListButton.click();
    	  Compare_Products_List_Page.viewCompareProductsListPage();
    	  
      }
}


