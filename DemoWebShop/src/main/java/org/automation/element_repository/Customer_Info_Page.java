package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_Info_Page extends Base_Page {
	public Customer_Info_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//================Web elements or Property================
	
	@FindBy(linkText= "My account")
	private static WebElement myAccountPage;
	
	@FindBy(partialLinkText="Customer info")
	private WebElement customerInfoPage;
	
	@FindBy(id="gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id="gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement firstNameTextfield;
	
	@FindBy(id="LastName")
	private WebElement lastNameTextfield;
	
	@FindBy(id="Email")
	private WebElement emailTextfield;
	
	@FindBy(name="save-info-button")
	private WebElement saveButton;
	
	//================Getters or Public services================
	public static WebElement getMyAccountPage() {
		return myAccountPage;
		
	}
	
	public WebElement getCustomerInfo() {
		return customerInfoPage;
	}
	
	public WebElement getmaleRadioButton1() {
		return maleRadioButton;
	}
	
	public WebElement getfemaleRadioButton() {
		return femaleRadioButton;
	}
	
	public WebElement getfirstNameTextfield() {
		return firstNameTextfield;
	}
	
	public WebElement getlastNameTextfield() {
		return lastNameTextfield;
	}
	
	public WebElement getemailTextfield() {
		return emailTextfield;
		
	}
	
	public WebElement getsaveButtonOption() {
		return saveButton;
		
	}
	
	
	//================Business Logic or Action methods or Behavior================
	
	public void CustomerInfo(String gender, String firstName, String lastName, String email)
	{
		if(gender.equalsIgnoreCase("MALE"))
		
			maleRadioButton.click();
		
		else 
			femaleRadioButton.click();
		
		
		firstNameTextfield.sendKeys(firstName);
		lastNameTextfield.sendKeys(lastName);
		emailTextfield.sendKeys(email);
		saveButton.click();
		
		
	}
}
