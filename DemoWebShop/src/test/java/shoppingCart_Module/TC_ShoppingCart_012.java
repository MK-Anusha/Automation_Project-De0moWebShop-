package shoppingCart_Module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Jewerly_Page;
import org.automation.element_repository.Shopping_Cart_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_ShoppingCart_012 extends Base_Test{

	@Test
	public void AddJewerlyProductToCart() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Shopping_Cart_Page scp=new Shopping_Cart_Page(driver);
		Jewerly_Page jp=new Jewerly_Page(driver);
		jp.addJewelryProductToCart();
		Thread.sleep(2000);
		scp.getShoppingCartLink().click();
		Thread.sleep(2000);
	    String ExceptedProductName="Black & White Diamond Heart";
		String ActualProductName=jp.getJewerlyProductName();
		if(driver.equals(ActualProductName)==driver.equals(ExceptedProductName))
		{
			System.out.println("Jewerly product is added successfully to Shopping Cart");
		}
		else {
			System.out.println("Jewerly product is not added successfully to Shopping Cart");
		}
}
	
}	
