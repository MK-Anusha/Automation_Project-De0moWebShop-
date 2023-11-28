package wishList_Module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Books_Page;
import org.automation.element_repository.WishList_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_WishList_013 extends Base_Test {

	@Test
	public void AddBooksProductToWishLish() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Books_Page booksPage=new Books_Page(driver);
		WishList_Page wp=new WishList_Page(driver);
		booksPage.addBooksProductToWishlish();//this method is in Books_Page
		Thread.sleep(2000);
		wp.viewWishlishedItems();
		Thread.sleep(2000);
		
	}
}
