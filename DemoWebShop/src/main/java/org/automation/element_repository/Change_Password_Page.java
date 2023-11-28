package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Change_Password_Page extends Base_Page {

	public Change_Password_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
  }
	
	//================Web elements or Property================
	
//	@FindBy(linkText= "My account")
//	private WebElement myAccountPage;
	
	@FindBy(xpath="//a[@href=\"/customer/changepassword\"]")
	private WebElement changePasswordOption;
	
	@FindBy(id="OldPassword")
	private WebElement OldPasswordTextfield;
	
	@FindBy(id="NewPassword")
	private WebElement NewPasswordTextfield;
	
	@FindBy(id="ConfirmNewPassword")
	private WebElement ConfirmPasswordTextfield;
	
	@FindBy(xpath="//input[@value=\"Change password\"]")
	private WebElement ChangePasswordButton;
	
	

	//================Getters or Public services================
	//public WebElement getMyAccountPage() {
		//return myAccountPage;
		
	//}
	
	public WebElement getChangePasswordOption() {
		return changePasswordOption; 
	}
	
	public WebElement getOldPassword() {
		return OldPasswordTextfield;
	}
	 public WebElement getNewPassword() {
		 return NewPasswordTextfield;
	 }
     public WebElement getConfirmPassword() {
    	 return ConfirmPasswordTextfield;
     }
      public WebElement getChangePasswordButton() {
    	  return ChangePasswordButton;
      }
      
    //================Business Logic or Action methods or Behavior================
      
      public void changePassword(String oldPasswordName,String newPasswordName,String confirmPasswordName) {
    	  Customer_Info_Page.getMyAccountPage().click();
    	  changePasswordOption.click();
    	  OldPasswordTextfield.sendKeys(oldPasswordName);
    	  NewPasswordTextfield.sendKeys(newPasswordName);
    	  ConfirmPasswordTextfield.sendKeys(confirmPasswordName);
    	  ChangePasswordButton.click();
    	  
    }
      
}
