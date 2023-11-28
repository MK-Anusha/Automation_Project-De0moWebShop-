package customer_service_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.New_Products_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Customer_Service_006 extends Base_Test {
	
	@Test
	public void navigateToNewProductsPage() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		New_Products_Page newProducts=new New_Products_Page(driver);
		newProducts.getNewProductsOptions().click();
		newProducts.getNewProductsPageTitle();
		Thread.sleep(3000);
		
		
	}

}
