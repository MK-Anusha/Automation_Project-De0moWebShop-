package login;

import org.automation.base.Base_Test;
import org.automation.element_repository.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login_007 extends Base_Test {

	@Test
	public void loginWithInvalidCredentials() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		homePage.getLogoutButton().click();
		Login_Page login_page=new Login_Page(driver);
		String emailId="abccc@gmail.com";
		String password="vhvjb1567";
		Thread.sleep(3000);
		login_page.loginWithInvalidCredentials(emailId, password);
		Thread.sleep(3000);
		
		
		
	}
}
