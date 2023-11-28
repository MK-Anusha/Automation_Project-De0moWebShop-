package my_Account_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.My_Account_Page;
import org.automation.generic_utilities.ReadTestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_MyAccount_004_Test extends Base_Test {
	
	@Test
	public void navigateToMyAccountPage() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    My_Account_Page myAccount=new My_Account_Page(driver);
		Thread.sleep(3000);
		myAccount.getMyAccountPage().click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Account","Demo Web Shop. Account");
	}
	
}

