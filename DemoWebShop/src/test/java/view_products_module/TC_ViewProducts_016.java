package view_products_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Compare_Products_List_Page;
import org.automation.element_repository.Electronics_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_ViewProducts_016 extends Base_Test {

	@Test
	public void viewProductsBasedOnFilter() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		Electronics_Page ep=new Electronics_Page(driver);
		Compare_Products_List_Page cpl=new Compare_Products_List_Page(driver);
		Actions action=new Actions(driver);
		action.moveToElement(ep.getElectronicsModule()).perform();
		Thread.sleep(2000);
		action.moveToElement(ep.getCameraAndPhotoModule()).click().perform();
		Thread.sleep(2000);
		ep.getFilterByPriceOption().click();
		Thread.sleep(2000);
		ep.getCameraAndPhoneProduct().click();
		Thread.sleep(2000);
		ep.getAddToCompareListButton().click();
		Thread.sleep(2000);
		cpl.getCompareProductsListOption().click();
		Thread.sleep(2000);
		String ExceptedProductName="1MP 60GB Hard Drive Handycam Camcorder";
		String ActualProductName=ep.getCameraProductName();
		if(driver.equals(ActualProductName)==driver.equals(ExceptedProductName))
		{
			System.out.println("Electronics product is added successfully to CompareProductList");
		}
		else {
			System.out.println("Electronics product is not added successfully to CompareProductList");
		}
}
	}


