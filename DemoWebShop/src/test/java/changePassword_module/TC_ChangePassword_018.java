package changePassword_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Change_Password_Page;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.My_Account_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_ChangePassword_018 extends Base_Test {

	@Test
	public void changePassword() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Change_Password_Page cp=new Change_Password_Page(driver);
		My_Account_Page myAccount=new My_Account_Page(driver);
		
		String password="Welcome@96";
		String new_password="Sunshine@6";
		String confirm_password="Sunshine@6";
		
		myAccount.getMyAccountPage().click();
	    Thread.sleep(2000);
		cp.getChangePasswordOption().click();
		Thread.sleep(2000);
		cp.getOldPassword().sendKeys(password);
		cp.getNewPassword().sendKeys(new_password);
		cp.getConfirmPassword().sendKeys(confirm_password);
		cp.getChangePasswordButton();
		
	}
}
