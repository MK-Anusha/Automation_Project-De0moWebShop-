package orders_Module;

import org.automation.base.Base_Test;
import org.automation.element_repository.CheckOut_Page;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.Orders_Page;
import org.automation.element_repository.Shopping_Cart_Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_ReOrder_Product_031 extends Base_Test {

	@Test
	public void reOrderTheOrderedProduct() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Shopping_Cart_Page scp=new Shopping_Cart_Page(driver);
		CheckOut_Page cp=new CheckOut_Page(driver);
		Orders_Page op=new Orders_Page(driver);
		
		op.getMyOrders().click();
		Thread.sleep(2000);
		op.getDetailsButton().click();
		Thread.sleep(2000);
		op.getReOrderButton().click();
		Thread.sleep(2000);
		
		scp.getTermsOfServiceCheckbox().click();
		Thread.sleep(2000);
		cp.getCheckOutButton().click();
		Thread.sleep(2000);
		cp.getBillingAddressDropdown().click();
		Thread.sleep(2000);
		Select listBox=new Select(cp.getBillingAddressDropdown());
		listBox.selectByIndex(0);
		Thread.sleep(3000);
	    cp.getContinueButtonOfAddress().click();
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
	
		cp.getpickUpItemCheckbox().click();
		Thread.sleep(2000);
		
		cp.getContinueButtonOfShipping().click();
		Thread.sleep(4000);
		
		cp.getCOD_PaymentMethod().click();
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		
		cp.getContinueButtonOfPaymentMethod().click();
		Thread.sleep(2000);
		
		cp.getContinueButtonOfPaymentInfo().click();
		Thread.sleep(2000);
		
		cp.getConfirmButton().click();
		Thread.sleep(2000);
	
	    
	 
	 
	}
}
