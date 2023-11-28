package my_Account_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.My_Account_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_CustomerInfo_019 extends Base_Test{

	@Test
	public void ViewPersonalDetails() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		My_Account_Page myAccount=new My_Account_Page(driver);
		myAccount.getMyAccountPage().click();
		Thread.sleep(3000);
		myAccount.getCustomerInfoPage().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Account","Demo Web Shop. Account");
	}
}
