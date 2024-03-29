package seleniumSamples;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriver {
	
	static WebDriver driver;
	
	public static void main(String[] args) {

		{

			File file = new File("C:\\msedgedriver.exe");
			System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
			driver = new EdgeDriver();
			
			driver.get(
					"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());

			driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("cmjpqa3@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
			driver.quit();

			driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Seleniumtest1@");
			driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();

		}
	}

}
