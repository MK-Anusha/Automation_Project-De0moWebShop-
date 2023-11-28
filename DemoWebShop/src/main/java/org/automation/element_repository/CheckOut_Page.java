package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut_Page extends Base_Page {

	public CheckOut_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	//================Web elements or Property================
	
	@FindBy(id="checkout")
	private WebElement checkOutButton;
	
	@FindBy(id="billing-address-select")
	private WebElement billingAddressDropdown;
	
	@FindBy(id="shipping-address-select")
	private WebElement shillingAddressDropdown;
	
	@FindBy(xpath="//input[@class=\"button-1 new-address-next-step-button\"]")
	private WebElement continueButtonOfAddress;
	
	
	@FindBy(xpath="//input[@onclick=\"Shipping.save()\"]")
	private WebElement continueButtonOfShipping;
	
	@FindBy(xpath="//input[@value=\"Payments.CashOnDelivery\"]")
	private WebElement codRadioButton;
	
	@FindBy(id="paymentmethod_1")
	private WebElement checkAndMoneyOrder;
	
	
	@FindBy(xpath="//input[@class=\"button-1 shipping-method-next-step-button\"]")
	private WebElement continueButtonOfShippingMethod;

    @FindBy(xpath="//input[@onclick=\"PaymentMethod.save()\"]")
    private WebElement continueButtonOfPaymentmethod;
    
    @FindBy(xpath="//input[@class=\"button-1 payment-info-next-step-button\"]")
    private WebElement continueButtonOfPaymentInfo;
    
    @FindBy(xpath="//input[@class=\"button-1 confirm-order-next-step-button\"]")
    private WebElement confirmButton;
    
    @FindBy(xpath="//div[@class=\"title\"]")
    private WebElement orderConfirmationMessage;
    
    @FindBy(id="PickUpInStore")
    private WebElement pickUpItemCheckBox;
    
  //================Getters or Public services================
    
    public WebElement getCheckOutButton() {
    	return checkOutButton;
    }
    
    public WebElement getBillingAddressDropdown() {
    	return billingAddressDropdown;
  }
    
    
    public WebElement getContinueButtonOfAddress() {
    	return continueButtonOfAddress;
    }
    
    public WebElement getContinueButtonOfShipping() {
    	return continueButtonOfShipping;
    }
    
    public WebElement getCOD_PaymentMethod() {
    	return codRadioButton;
    }
    
    public WebElement getCheckAndMoney_PaymentMethod() {
    	return codRadioButton;
    }
    public WebElement getContinueButtonOfShippingMethod() {
    	return continueButtonOfShippingMethod;
    }
    
    public WebElement getContinueButtonOfPaymentMethod() {
    	return continueButtonOfPaymentmethod;
    }
    
    public WebElement getContinueButtonOfPaymentInfo() {
    	return continueButtonOfPaymentInfo;
    }
    
    public WebElement getConfirmButton() {
    	return confirmButton;
    }
    
    public WebElement getOrderConfirmationMessage() {
    	return orderConfirmationMessage;
    }
    
    public WebElement getShippingAddressDropdown() {
    	return shillingAddressDropdown;
    }
    
    public WebElement getpickUpItemCheckbox() {
    	return pickUpItemCheckBox;
    }
  //================Business Logic or Action methods or Behavior================
    
    public void checkOut(String paymentMethod) {
    	checkOutButton.click();
    	billingAddressDropdown.click();
    	continueButtonOfAddress.click();
    	//shillingAddressDropdown.click();
    	pickUpItemCheckBox.click();
    	continueButtonOfShipping.click();
    	continueButtonOfShippingMethod.click();
    	if(paymentMethod.equalsIgnoreCase("Cash On Delivery")) {
    	codRadioButton.click();
    }
    	continueButtonOfPaymentmethod.click();
    	continueButtonOfPaymentInfo.click();
    	confirmButton.click();
    	if(orderConfirmationMessage.isDisplayed()==true) {
    		System.out.println("Your Order placed successfully");
    		
    	}
    	else {
    		System.out.println("Your Order is not Placed");
    	}
    	}
    	
    	
}	
    	
    	
    	
    	
    	
    

