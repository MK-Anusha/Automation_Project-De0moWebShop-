package my_Account_module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.My_Account_Page;
import org.automation.element_repository.Orders_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_ViewOrders_020 extends Base_Test {

	@Test
	public void viewOrders() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Orders_Page op=new Orders_Page(driver);
		op.getMyOrders().click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Account","Demo Web Shop. Account");
		
	}
}
