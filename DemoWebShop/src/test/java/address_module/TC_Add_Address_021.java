package address_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Addresses_Page;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.My_Account_Page;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.UtilityMethods;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Add_Address_021 extends Base_Test {

	
	    @Test
	    public void addAddress() throws InterruptedException {	
		
	    WebDriverManager.chromedriver().setup();
	    UtilityMethods utilMethods=new UtilityMethods(driver);
		
		//Address Details
		String FirstName="Anusha";
		String LastName="MK";
		String Emailid="mjshivu@gmail.com";
		String Company="TY";
		String City="new York";
		String Address1="HM1 Street";
		String Address2="near high street";
		String ZipCode="TWAG16";
		String PhoneNo="9087654476";
		String FaxNo="908646";
		
		String ActualPageTitle="My account - Addresses";
		String pageTitle="My account - Addresses";
		
		Addresses_Page address=new Addresses_Page(driver);
		My_Account_Page myAccount=new My_Account_Page(driver);
		myAccount.getAddressLink().click();
		Thread.sleep(2000);
		address.getAddNewAddressButton().click();
		Thread.sleep(2000);
		
		address.getFirstNameOfAddress().sendKeys(FirstName);
		address.getLastNameOfAddress().sendKeys(LastName);
		address.getEmailAddress().sendKeys(Emailid);
		address.getCompanyAddress().sendKeys(Company);
		
		//Utility Method is used here for dropdown from UtilityMethod Class
		
		String index="1";
		utilMethods.selectDropDown(address.getCountryId(),index);
		utilMethods.selectDropDown(address.getStateProvinceId(),index);
		address.getCityName().sendKeys(City);
	    address.getAddress1Details().sendKeys(Address1);
		address.getAddress2Details().sendKeys(Address2);
		address.getZipCodeDetails().sendKeys(ZipCode);
		address.getPhoneNumberDetails().sendKeys(PhoneNo);
		address.getFaxNumberDetails().sendKeys(FaxNo);
		address.getSaveButton().click();
		Thread.sleep(2000);
		address.getAddresses().click();
		Thread.sleep(2000);
		if(ActualPageTitle.equals(pageTitle))
		{
			System.out.println("User Address added Successfully");
		}
		else {
			
			System.out.println("User Address not added Successfully");
		}
		
		
	}
}
