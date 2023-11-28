package wishList_Module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.Shopping_Cart_Page;
import org.automation.element_repository.WishList_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_AddWishLishProductToShoppingCart_027 extends Base_Test{

	@Test
	public void addWishLishProductToCart() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Shopping_Cart_Page scp=new Shopping_Cart_Page(driver);
	    WishList_Page wp=new WishList_Page(driver);
	    Thread.sleep(2000);
		wp.AddWishlishedItemToCart(); //this method is in WishList_Page.
		Thread.sleep(2000);
		scp.getShoppingCartLink().click();
		Thread.sleep(2000);
		
	}
}
