package categories_module;


import org.automation.base.Base_Test;
import org.automation.element_repository.Books_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Categories_003 extends Base_Test {
	
	@Test
	public void navigateToBooksTab() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Books_Page bp=new Books_Page(driver);
		bp.getBooksModule().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books","Demo Web Shop. Books");
		Thread.sleep(2000);
		driver.quit();
	}

}
