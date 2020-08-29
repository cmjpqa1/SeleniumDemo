package waitDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetScriptTimeOut {

	// Useful when working with Ajax interface
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		driver.get("https://learn-automation.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
