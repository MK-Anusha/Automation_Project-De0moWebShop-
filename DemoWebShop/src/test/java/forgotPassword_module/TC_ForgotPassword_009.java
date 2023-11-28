package forgotPassword_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.ForgotPassword_Page;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_ForgotPassword_009 extends Base_Test {
	
	@Test
	public void navigateToForgotPasswordPage() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ForgotPassword_Page forgotPswd=new ForgotPassword_Page(driver);
		homePage.getLogoutButton().click();
		Thread.sleep(2000);
		loginPage.getLoginLink().click();
		Thread.sleep(2000);
		forgotPswd.getForgotPasswordPage().click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Password Recovery","Demo Web Shop. Password Recovery");
	}

}
