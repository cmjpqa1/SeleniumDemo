package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMultipleBrowsersAmazonLogin {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void AmazonLogin(String browserName) {

		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		/*
		 * else if (browserName.equalsIgnoreCase("IE")) { driver = new
		 * InternetExplorerDriver(); }
		 */

		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("cmjpqa3@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Seleniumtest1@");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		driver.get("https://www.amazon.in/?ref_=nav_ya_signin&");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException ie) {
		}
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//span[contains(text(),\"Account & Lists\")]"));
		action.moveToElement(we).build().perform();
		 
		/*
		 * WebElement ele = driver.findElement(By.xpath("//span[text()='Sign Out']"));
		 * // Sign Out element JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView(true);", ele);
		 * js.executeScript("scroll(0, 0);");
		 */
		
		boolean b1 = driver.findElement(By.xpath("//span[text()='Sign Out']")).isDisplayed();
		System.out.println(b1); //true
		
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
		// driver.quit();

	}    

}
