package compareProductList_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Compare_Products_List_Page;
import org.automation.element_repository.Electronics_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_CompareProductList_014 extends Base_Test{

	@Test
	public void AddElectronicsProductToCompareProductsList() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		Electronics_Page ep=new Electronics_Page(driver);
		Compare_Products_List_Page cpl=new Compare_Products_List_Page(driver);
		Actions actions=new Actions(driver);
		
		actions.moveToElement(ep.getElectronicsModule()).perform();
		Thread.sleep(2000);
		actions.moveToElement(ep.getCellPhoneModule()).click().perform();
		Thread.sleep(2000);
		ep.getCellPhoneProduct().click();
		Thread.sleep(2000);
		ep.getAddToCompareListButton().click();
		Thread.sleep(2000);
		cpl.getCompareProductsListOption().click();
		
	}
}
