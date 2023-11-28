package shoppingCart_Module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Books_Page;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.Shopping_Cart_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_ContinueShopping_029 extends Base_Test {

	@Test
	public void continueShoppingProductsfromShoppingCart() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Shopping_Cart_Page scp=new Shopping_Cart_Page(driver);
		Books_Page bp=new Books_Page(driver);
		Thread.sleep(2000);
		scp.getShoppingCartLink().click();
		Thread.sleep(2000);
		scp.getContinueShoppingButton().click();
		Thread.sleep(2000);
		bp.getBooksModule().click();
		Thread.sleep(2000);
		bp.getComputingAndInternetBook().click();
		Thread.sleep(2000);
		bp.getAddToCartButtonOfBooks().click();
		Thread.sleep(2000);
		scp.getShoppingCartLink().click();
		Thread.sleep(2000);
		
		
		
	}
}
