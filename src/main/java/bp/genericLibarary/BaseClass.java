package bp.genericLibarary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClass {

	public static WebDriver driver;

	FileUtilities pro = new FileUtilities();
	WebDriverUtilities wLib = new WebDriverUtilities();

	/* read data from property file */
	String BROWSER = pro.dataProperty("browser");
	String URL = pro.dataProperty("url");
	String USERNAME = pro.dataProperty("username");
	String PASSWORD = pro.dataProperty("password");

	@BeforeClass
	public void openBrowser() {
		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Invalid browser");
		}
		wLib.implicitwait(driver);
		wLib.maximiseWindow(driver);
		driver.get(URL);
		Reporter.log("Login Page is Dispalyed", true);
	}

	@BeforeMethod
	public void login() {
		/* Step 1: Login into application */
		
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		/* Step : Logout from the Application */
		
	}

	@AfterClass
	public void closeBrowser() {
		/* Step : Close the browser */
		driver.close();
		Reporter.log("Browser successfuly closed", true);
	}
}
