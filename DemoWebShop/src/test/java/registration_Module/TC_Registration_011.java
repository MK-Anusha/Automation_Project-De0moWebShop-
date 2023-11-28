package registration_Module;

import org.automation.base.Base_Test;
import org.automation.element_repository.Login_Page;
import org.automation.element_repository.Register_Page;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Registration_011 extends Base_Test{
	
public ReadTestData readData;
	
	@DataProvider
	public String[][] multipleNewUsersData() throws InvalidTestCaseIdException, CheckExecutionRowException, InvalidExecutionColumnException{
		readData = new ReadTestData();
		String[][] registerationData = readData.readTestDataFromExcel("Sheet1", "TC_Register_003");
		return registerationData;
	}
		
		@Test(dataProvider="multipleNewUsersData")
		public void registerUser(String [] registrationData) {
			String gender = registrationData[1];
			String firstName = registrationData[2];
			String lastName = registrationData[3];
			String emailId = registrationData[4];
			String password = registrationData[5];
			String confirmPassword=registrationData[6];
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(readData.readDataFromPropertyFile("url"));
			Login_Page loginPage = new Login_Page(driver);
			loginPage.getRegisterLink().click();
			Register_Page registerPage = new Register_Page(driver);
			registerPage.registerUser(gender, firstName, lastName, emailId, password,confirmPassword);
			driver.quit();

}
	}
