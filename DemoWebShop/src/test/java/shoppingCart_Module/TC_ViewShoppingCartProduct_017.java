package shoppingCart_Module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Computers_Page;
import org.automation.element_repository.Shopping_Cart_Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_ViewShoppingCartProduct_017 extends Base_Test {
	
   @Test
   public void viewShoppingCartProducts() throws InterruptedException {
       
	    WebDriverManager.chromedriver().setup();
		Shopping_Cart_Page scp=new Shopping_Cart_Page(driver);  
		Computers_Page computer=new Computers_Page(driver);
		
	    JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Actions action=new Actions(driver);
		action.moveToElement(computer.getComputerModule()).perform();
		Thread.sleep(3000);
		action.moveToElement(computer.getDesktopModule()).click().perform();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		computer.getAddToCartButtonOfDesktop().click();
		Thread.sleep(3000);
		scp.getShoppingCartLink().click();
		Thread.sleep(3000);
		}
}
