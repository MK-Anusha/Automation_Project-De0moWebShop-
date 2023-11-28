package wishList_Module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.WishList_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_RemoveWishListProduct_026 extends Base_Test{

	@Test
	public void removeProductFromWishList() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Thread.sleep(2000);
	    WishList_Page wp=new WishList_Page(driver);
	    wp.removeItemFromWishList(); //this method is in WishList_Page.
		Thread.sleep(2000);
		
	}
	
}
