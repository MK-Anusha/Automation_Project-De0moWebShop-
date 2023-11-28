package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compare_Products_List_Page extends Base_Page {

	public Compare_Products_List_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//================Web elements or Property================
	
	@FindBy(partialLinkText="Compare products list")
	private static WebElement compareProductsListOption;
	
	@FindBy(xpath="//div[@class=\"page-title\"]")
	private static WebElement compareProductsListTitle;
	
	//=================Getters or Public services================
	
	public WebElement getCompareProductsListOption() {
		return compareProductsListOption;
	}
   
	public WebElement getCompareProductsListTitle() {
		return compareProductsListTitle;
	}
	
	//================Business Logic or Action methods or Behavior================

	//this method is used to view the compare products list page.
	
	public static void viewCompareProductsListPage() {
		compareProductsListOption.click();
		
		try {
			if(compareProductsListTitle.isDisplayed()==true) {
				System.out.println("Compare Products list page is displayed");
			}
			else {
				System.out.println("CompareProducts list page is not displayed");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
