package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword_Page extends Base_Page {

	public ForgotPassword_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	//================Web elements or Property================
	
	@FindBy(partialLinkText="Forgot password?")
	private WebElement forgotPasswordlink;
	
	@FindBy(name="Email")
	private WebElement enterAnotherRecoverEmailId;
	
	@FindBy(xpath="//input[@value=\"Recover\"]")
	private WebElement recoverButton;
	
	
	//================Getters or Public services================
	public WebElement getForgotPasswordPage() {
		return forgotPasswordlink;
	}
	
	public WebElement getAnotherRecoverEmailId() {
		return enterAnotherRecoverEmailId;
	}
	
	public WebElement getRecoverButton() {
		return recoverButton;
	}
	
	//================Business Logic or Action methods or Behavior================
	
	public void recoverForgotPassword(String EmailId) {
		forgotPasswordlink.click();
		enterAnotherRecoverEmailId.sendKeys(EmailId);
		recoverButton.click();
	}
	
	

}
