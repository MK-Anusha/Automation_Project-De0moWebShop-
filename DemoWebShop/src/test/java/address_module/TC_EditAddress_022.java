package address_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Addresses_Page;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.My_Account_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_EditAddress_022 extends Base_Test {

	@Test
	public void editAddressDetails() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		String Address1="brentfort Lane";
		String Address2="near Tesco Mall";
		String ZipCode="TWAG16";
		
		Addresses_Page address=new Addresses_Page(driver);
		My_Account_Page myAccount=new My_Account_Page(driver);
		
		myAccount.getAddressLink().click();
		Thread.sleep(2000);
		address.EditAddress().click();
		Thread.sleep(2000);
		
		address.getAddress1Details().clear();
		address.getAddress1Details().sendKeys(Address1);
		address.getAddress2Details().clear();
		address.getAddress2Details().sendKeys(Address2);
		address.getZipCodeDetails().clear();
		address.getZipCodeDetails().sendKeys(ZipCode);
		address.getSaveButton().click();
		Thread.sleep(2000);
		
	}
}
