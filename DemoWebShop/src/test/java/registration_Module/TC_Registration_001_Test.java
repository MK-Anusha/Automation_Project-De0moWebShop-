package registration_Module;



import org.automation.base.Base_Page;
import org.automation.base.Base_Test;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Register_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TC_Registration_001_Test extends Base_Test {
	
	@Test
	public void Register() throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		Home_Page hp=new Home_Page(driver);
		hp.getLogoutButton().click();
		Thread.sleep(2000);
	    Register_Page registerPage=new Register_Page(driver);
	    registerPage.getRegisterLink().click();
	    Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Register","Demo Web Shop. Register");
		Thread.sleep(IMPLICIT_TIMEOUT);
		
	}	
}	    
	    
		
		
		
		
		
		


