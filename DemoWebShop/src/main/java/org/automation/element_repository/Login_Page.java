package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Sumanth
 *
 */
public class Login_Page extends Base_Page {
	
	public Login_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}


	//================Web elements or Property================
	
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	@FindBy(id="Email") 
	private WebElement emailTextField;
	
	@FindBy(id="Password") 
	private WebElement passwordTextField;
	
	@FindBy(xpath="//input[@value='Log in']") 
	private WebElement loginButton;
	
	@FindBy(xpath="//div[@class=\"message-error\"]")
	private WebElement loginUnsuccessfullMessage;
	
	@FindBy(xpath="//a[@href=\"/logout\"]")
	private WebElement logOutLink;
	//================Getters or Public services================
	public WebElement getLoginLink() {
		return loginLink;
	}
	
	public WebElement getEmailTextField(String emailId) {
		return emailTextField;
	}

	public WebElement getPasswordTextField(String password) {
		return passwordTextField;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getLoginUnsuccessfullMessage() {
		return loginUnsuccessfullMessage;
	}
	
	public WebElement getLogOutButton() {
		return logOutLink;
	}
	 	
	//================Business Logic or Action methods or Behavior================
	/*public void loginToApp(String emailId, String password) {
		getLoginLink().click();
		emailTextField.sendKeys(emailId);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}*/

	public void getEmailTextField1(String emailId) {
		
		emailTextField.sendKeys(emailId);
	}
	
public void getPasswordTextField1(String password) {
		
	passwordTextField.sendKeys(password);
	}

public void login(String emailId, String password) {
	getLoginLink().click();
	emailTextField.sendKeys(emailId);
	passwordTextField.sendKeys(password);
	loginButton.click();
	
}

public void loginWithInvalidCredentials(String emailId, String password) {
	getLoginLink().click();
	emailTextField.sendKeys(emailId);
	passwordTextField.sendKeys(password);
	loginButton.click();
	String actualMessage="Login was unsuccessful. Please correct the errors and try again.";
	if(loginUnsuccessfullMessage.equals(actualMessage)) {
		System.out.println("Login Successfull");
	}
	else {
		System.out.println("Login Unsuccessfull");
	}
	
	
}
	
}
