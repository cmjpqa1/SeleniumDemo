package amazontest;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	WebDriver driver;

	@BeforeMethod //Instead @BeforeClass can also be used
	
	@Parameters("browser")
	public void setupApplication(String browserName) {

		Reporter.log("====Browser Session Start====", true);
		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

			// add (Below 2 lines) parameter which will disable the extensions
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");

	        // (disable Chrome notifications --Start)Create object of HashMap Class
			Map<String, Object> prefs = new HashMap<String, Object>();
	        // Set the notification setting it will override the default setting
			prefs.put("profile.default_content_setting_values.notifications", 2);
	        // Set the experimental option
			options.setExperimentalOption("prefs", prefs);
			// (disable Chrome notifications --End)
			
			driver = new ChromeDriver(options);
		}

		/*
		 * else if (browserName.equalsIgnoreCase("IE")) { driver = new
		 * InternetExplorerDriver(); }
		 */
		
		// PageLoadTimeout:
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Reporter.log("====Application Started====", true);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@AfterMethod //Instead @AfterClass can also be used 
	public void closeApplication() {
		driver.quit();
		Reporter.log("====Browser Session End====", true);
	}

}
