package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newsletter_Page extends Base_Page {
	
	public String emailId="mjshivu@gmail.com";

	public Newsletter_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	// ================Web elements or Property================
	
	@FindBy(id="newsletter-email")
	private WebElement EmailIdTextfield;
	
	@FindBy(id="newsletter-subscribe-button")
	private WebElement SubscribeButton;
	
	@FindBy(id="newsletter-result-block")
	private boolean errormessage;
	
	@FindBy(id="newsletter-result-block")
	private boolean successmessage;
	
	//================Getters or Public services================
	
	public WebElement getEmailIdTextfield() {
		return EmailIdTextfield;
	}
   
	public WebElement getSubscribeButton() {
		return SubscribeButton;
	}
	
	public boolean getErrormessage() {
		return errormessage;
	}
	
	public boolean getSuccessmessage() {
		return successmessage;
	}
	//================Business Logic or Action methods or Behavior================
	
	public void newsletterSignUp(String emailId) {
		EmailIdTextfield.clear();
		EmailIdTextfield.sendKeys(emailId);
		SubscribeButton.click();
	}
	
	public void signUpWithOutEmailId(String emailIdforNewsletter) {
		
		SubscribeButton.click();
		if(emailIdforNewsletter==emailId) {
			System.out.println("Thank you for Subscribing to Newsletter");
			
		}
		else {
			System.out.println("Enter a Valid Email-ID");
		}
	}
}
