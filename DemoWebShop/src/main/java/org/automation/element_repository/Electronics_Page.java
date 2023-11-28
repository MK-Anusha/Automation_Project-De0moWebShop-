package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronics_Page extends Base_Page{

	public Electronics_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//================Web elements or Property================
	@FindBy(xpath="//a[@href=\"/electronics\"]") 
	private WebElement electronicsModule;
	
	@FindBy(xpath="//a[@href=\"/camera-photo\"]")
	private WebElement cameraOrPhotoModule;
	
	@FindBy(xpath="//a[@href=\"/cell-phones\"]")
	private WebElement cellPhoneModule;
	
	 @FindBy(xpath="//input[@value=\"Add to compare list\"]")
     private WebElement addToCompareListButton;
	 
	 @FindBy(xpath="//a[@href=\"/smartphone\"]")
	 private WebElement cellPhoneProduct;
	 
	 @FindBy(xpath="//a[@href=\"https://demowebshop.tricentis.com/camera-photo?price=-500\"]")
	 private WebElement filterByPriceOption;
	 
	 @FindBy(xpath="//a[@href=\"/hard-drive-handycam-camcorder\"]")
	 private WebElement cameraPhoneProduct;
	 
	 @FindBy(xpath="//a[@href=\"/hard-drive-handycam-camcorder\"]")
	 private String cameraProductName;
	 
	 @FindBy(xpath="//input[@class=\"button-1 add-to-cart-button\"]")
	 private WebElement addToCartButtonOfElectronics;
	//================Getters or Public services==================
	 public WebElement getElectronicsModule() {
			return electronicsModule;
		}
	 
	 public WebElement getCameraAndPhotoModule() {
		 return cameraOrPhotoModule;
	 }
	
	  public WebElement getCellPhoneModule() {
		  return cellPhoneModule;
	  }
	   
	  public WebElement getCellPhoneProduct() {
		  return cellPhoneProduct;
	  }
	  
	  public WebElement getFilterByPriceOption() {
		  return filterByPriceOption;
		  
	  } 
		  public WebElement getCameraAndPhoneProduct() {
			  return cameraPhoneProduct;
		  }
	  
	 public WebElement getAddToCompareListButton() {
   	  return addToCompareListButton;
     }
	 
	 public String getCameraProductName() {
		 return cameraProductName;
	 }
	 
	 public WebElement getAddToCartButtonOfElectronics() {
		 return addToCartButtonOfElectronics;
	 }
	 
	//================Business Logic or Action methods or Behavior================
	 public void addElectonicsProductToCompareList() {
	 getElectronicsModule();
	 cameraPhoneProduct.click();
   	 Compare_Products_List_Page.viewCompareProductsListPage();
   	  
     }
	 
	 public void viewProductByFilterOption() {
		 getElectronicsModule();
		 cameraOrPhotoModule.click();
		 filterByPriceOption.click();
		 if(cameraPhoneProduct.isDisplayed()==true) {
			 System.out.println("Electronics  products is displayed based on filter");
		 }
		 else {
			 System.out.println("Electonics products s not displayed based on filter");
		 }
	 }		 
}
