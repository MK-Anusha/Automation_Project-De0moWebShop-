package customer_service_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Recently_Viewed_Products_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Recently_Viewed_Products_010 extends Base_Test {
	
	@Test
	public void navigateToRecentlyViewedProductsPage() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Recently_Viewed_Products_Page rvp=new Recently_Viewed_Products_Page(driver);
		
		// Below method is written in Recent_Viewed_Products_Page
		rvp.recentlyViewedProductDetails();
		Thread.sleep(3000);
	}

}
