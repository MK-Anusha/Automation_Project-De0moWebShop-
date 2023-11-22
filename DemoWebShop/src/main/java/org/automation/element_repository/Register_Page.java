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
public class Register_Page extends Base_Page {

	public Register_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// ================Web elements or Property================
	
	@FindBy(linkText="Register") 
	private WebElement registerLink;
	
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;

	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;

	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;

	@FindBy(id = "LastName")
	private WebElement lastNameTextField;

	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextField;

	@FindBy(id = "register-button")
	private WebElement registerButton;

	//================Getters or Public services================
	
	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	//================Business Logic or Action methods or Behavior================
	public void registerUser(String gender,String firstName,String lastName,String emailId,String password,String confirmPassword) {
		if(gender.equalsIgnoreCase("MALE")) 
			maleRadioButton.click();
		else 
			femaleRadioButton.click();
		firstNameTextField.clear();
		firstNameTextField.sendKeys(firstName);
		lastNameTextField.clear();
		lastNameTextField.sendKeys(lastName);
		emailTextField.clear();
		emailTextField.sendKeys(emailId);
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		confirmPasswordTextField.clear();
		confirmPasswordTextField.sendKeys(confirmPassword);
		registerButton.click();		
	}
}
