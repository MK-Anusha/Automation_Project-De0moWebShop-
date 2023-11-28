package shoppingCart_Module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.Shopping_Cart_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Edit_And_Update_ShoppingCartProductQuantity_025 extends Base_Test {
	
	@Test
	public void editAndUpdateShoppingCartProduct() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Shopping_Cart_Page scp=new Shopping_Cart_Page(driver);
		String productQuantity="2";
		scp.IncreaseOrDecreaseProductQuantityInShoppingCartPage(productQuantity); //this method is in shoppingCart_Page.
		Thread.sleep(2000);
		
	}

}
