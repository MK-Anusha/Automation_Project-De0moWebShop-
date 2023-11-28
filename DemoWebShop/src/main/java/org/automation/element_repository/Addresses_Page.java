package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresses_Page extends Base_Page {

	public Addresses_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//================Web elements or Property================
	
	@FindBy(linkText="Addresses")
	private WebElement addressesDetails;
	
	@FindBy(xpath="//input[@value=\"Add new\"]")
	private WebElement addNewButton;
	
	@FindBy(xpath="//input[@value=\"Edit\"]")
	private WebElement editAddress;
	
	@FindBy(id="Address_FirstName")
	private WebElement firstNameOfAddress;
	
	@FindBy(id="Address_LastName")
	private WebElement lastNameOfAddress;
	
	@FindBy(id="Address_Email")
    private WebElement emailAddress;
	
	@FindBy(id="Address_Company")
	private WebElement CompanyAddress;
	
	@FindBy(id="Address_CountryId")
	private WebElement countryId;
	
	@FindBy(id="Address_StateProvinceId")
	private WebElement StateProvinceId;
	
	@FindBy(id="Address_City")
	private WebElement cityName;
	
	@FindBy(id="Address_Address1")
	private WebElement address1_Description;
	
	@FindBy(name="Address.Address2")
	private WebElement address2_Description;
	
	@FindBy(name="Address.ZipPostalCode")
	private WebElement zipCodeNumber;
	
	@FindBy(id="Address_PhoneNumber")
	private WebElement phoneNumber;
	
	@FindBy(name="Address.FaxNumber")
	private WebElement faxNumber;
	
	@FindBy(xpath="//input[@class=\"button-1 save-address-button\"]")
	private WebElement saveButton;
	
	@FindBy(xpath="//div[@class=\"page-title\"]")
	private String addressPageTitle;
	
	@FindBy(xpath="//input[@value=\"Delete\"]")
	private WebElement deleteAddressButton;
	//================Getters or Public services================
	
	public WebElement getAddresses() {
		return addressesDetails;
	}
	
	public WebElement getAddNewAddressButton() {
		return addNewButton;
		}
	
	public WebElement EditAddress() {
		return editAddress;
	}
	
	public WebElement getFirstNameOfAddress() {
		return firstNameOfAddress;
		
	}
	
	public WebElement getLastNameOfAddress() {
		return lastNameOfAddress;
	}
	
	public WebElement getEmailAddress() {
		return emailAddress;
	}
	
	public WebElement getCompanyAddress() {
		return CompanyAddress;
	}
	
	public WebElement getCountryId() {
		return countryId;
	}
	
	public WebElement getStateProvinceId() {
		return StateProvinceId;
	}
	
	public WebElement getCityName() {
		return cityName;
	}
	
	public WebElement getAddress1Details() {
		return address1_Description;
	}
	
	public WebElement getAddress2Details() {
		return address2_Description;
	}
	
	public WebElement getZipCodeDetails() {
		return zipCodeNumber;
	}
	
	public WebElement getPhoneNumberDetails() {
		return phoneNumber;
	}
	
	public WebElement getFaxNumberDetails() {
		return faxNumber;
	}
	
	public WebElement getSaveButton() {
		return saveButton;
	}

	public String getAddressPageTitle() {
		return addressPageTitle;
	}
	
	public WebElement getDeleteAddressButton() {
		return deleteAddressButton;
	}
	//================Business Logic or Action methods or Behavior================
	
	public void viewAddress() {
		addressesDetails.click();
	}
	
	public void AddNewAddress(String firstName,String lastName,String Email, String companyname,String countryid,String StateProvinceid,String cityname,String address1_description,String address2_description,String zipCodeNumber,String phoneNumber,String faxNumber) {
		addNewButton.click();
		firstNameOfAddress.sendKeys(firstName);
		lastNameOfAddress.sendKeys(lastName);
		emailAddress.sendKeys(Email);
		CompanyAddress.sendKeys(companyname);
		countryId.sendKeys(countryid);
		StateProvinceId.sendKeys(StateProvinceid);
		cityName.sendKeys(cityname);
		address1_Description.sendKeys(address1_description);
		address2_Description.sendKeys(address2_description);
		
		//not able add zipcode element here
		
		
		
		
		
	}
	
	public void editAddressDetails(String firstName,String lastName,String companyname,String countryid,String StateProvinceid,String cityname,String address1_description,String address2_description, Integer zipCodeNumber,String phoneNumber,String faxNumber) {
		editAddress.click();
		firstNameOfAddress.sendKeys(firstName);
		lastNameOfAddress.sendKeys(lastName);
		CompanyAddress.sendKeys(companyname);
		countryId.sendKeys(countryid);
		StateProvinceId.sendKeys(StateProvinceid);
		cityName.sendKeys(cityname);
		address1_Description.sendKeys(address1_description);
		address2_Description.sendKeys(address2_description);
		
	
	}
		
		
		
		
		
		
		
		
		
	}

