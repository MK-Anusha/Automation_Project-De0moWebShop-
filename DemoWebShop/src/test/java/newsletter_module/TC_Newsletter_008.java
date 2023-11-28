package newsletter_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Newsletter_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Newsletter_008 extends Base_Test {
	
	@Test
	public void SubscribeToNewsletterWithoutEmail() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Newsletter_Page newsletter=new Newsletter_Page(driver);
		String emailIdforNewsletter=" ";
		Thread.sleep(3000);
		newsletter.signUpWithOutEmailId(emailIdforNewsletter);
		
	    
		
	}

}
