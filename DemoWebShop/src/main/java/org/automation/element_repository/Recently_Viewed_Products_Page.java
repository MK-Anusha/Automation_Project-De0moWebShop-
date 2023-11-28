package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recently_Viewed_Products_Page extends Base_Page {

	public Recently_Viewed_Products_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//================Web elements or Property================
	
	@FindBy(partialLinkText="Recently viewed products")
	private WebElement RecentlyViewedProductsOption;
	
	@FindBy(xpath="//div[@class=\"page-title\"]")
	private WebElement RecentlyViewedProductsPageTitle;
	
	@FindBy(xpath="//div[@class=\"page-body\"]")
	private WebElement RecentlyViewedProductItems;
	
	//================Getters or Public services================
	
	public WebElement getRecentlyViewedProductsPage()
	{
	return RecentlyViewedProductsOption;
	}
	
	public WebElement getRecentlyViewedProductsItems() {
		return RecentlyViewedProductItems;
	}
	
	public WebElement getRecentlyViewedProductsTitle() {
		return RecentlyViewedProductsPageTitle;
	}

	//================Business Logic or Action methods or Behavior================
	public void recentlyViewedProductDetails() {
		RecentlyViewedProductsOption.click();
		if(RecentlyViewedProductItems.isDisplayed()==true) {
			System.out.println("All recently viewed products is  displayed ");
		}
		else {
			System.out.println("No recently viewed products present here");
			
		}
	}
}
