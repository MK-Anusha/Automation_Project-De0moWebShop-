package login;

import org.automation.base.Base_Test;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.automation.base.Base_Page;

public class TC_Login_001_Test extends Base_Test {
	
	@Test
	public void loginPage() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Login_Page login_page=new Login_Page(driver);
		
		homePage.getLogoutButton().click();
		Thread.sleep(2000);	
		login_page.getLoginLink().click();
		Thread.sleep(2000);
		
		
		//Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","Demo Web Shop. Login");
		
	}
}



		
	
		

