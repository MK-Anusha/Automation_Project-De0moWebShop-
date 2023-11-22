package org.automation.generic_utilities;

import org.automation.base.Base_Page;
import org.automation.element_repository.Books_Page;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Sumanth
 *
 */
public class InitObjects {

	public  WebDriver driver;
	public ReadTestData readData;
	public WebDriverWait explicitWait;
	public InitObjects initClass;
	public Login_Page loginPage;
	public Home_Page homePage;
	public String url= "https://demowebshop.tricentis.com/";
	public String emailId="mjshivu@gmail.com";
	public String password="Testing@66";
	public Base_Page basePage;
	public Books_Page booksPage;
	
	public ActionsUtil getActionsUtil() {
		return new ActionsUtil(driver);
	}
	
	public JavaScriptUtil getJavaScriptUtil() {
		return new JavaScriptUtil(driver);
	}
	
	public ReadTestData getReadTestData() {
		return new ReadTestData();
	}
	
	public UtilityMethods getUtilityMethods() {
		return new UtilityMethods(driver);
	}
}
