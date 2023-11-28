package address_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Addresses_Page;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.My_Account_Page;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_DeleteAddress_023 extends Base_Test {
	
	@Test
	public void DeleteAddress() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        Addresses_Page address=new Addresses_Page(driver);
		My_Account_Page myAccount=new My_Account_Page(driver);
		myAccount.getAddressLink().click();
		Thread.sleep(2000);
		address.getDeleteAddressButton().click();
		Thread.sleep(2000);
		Alert alertPopup = driver.switchTo().alert();
		alertPopup.accept();
		
	}

}
