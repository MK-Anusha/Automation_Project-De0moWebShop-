package appreal_and_shoes_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Appreal_and_Shoes_Page;
import org.automation.element_repository.Shopping_Cart_Page;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_APPREAL_and_SHOES_015 extends Base_Test{

	@Test
	public void ViewApperalAndShoesProductInCart() throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 Appreal_and_Shoes_Page asp=new Appreal_and_Shoes_Page(driver);
		 Shopping_Cart_Page scp=new Shopping_Cart_Page(driver);
		 UtilityMethods utilMethods=new UtilityMethods(driver);
		 asp.getApparelsAndShoesModule().click();
		 Thread.sleep(3000);
		 asp.getsortByDropdownOption().click();
		 Thread.sleep(3000);
		
		 //Utility Method is used here for drop down from UtilityMethod Class
		 
		 String index="1";
		 utilMethods.selectDropDown(asp.getsortByDropdownOption(),index);
		 asp.getApprealAndShoesProduct().click();
		 Thread.sleep(2000);
		 asp.getAddToCartButtonOfApprealAndShoes().click();
		 Thread.sleep(2000);
		 scp.getShoppingCartLink().click();
		 driver.quit();
		 
		
		
	}
}
