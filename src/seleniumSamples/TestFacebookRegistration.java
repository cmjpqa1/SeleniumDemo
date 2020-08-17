package seleniumSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookRegistration {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		System.out.println("Application title is ============="+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys("Prakash");
		driver.findElement(By.xpath("//*[@id=\"u_0_p\"]")).sendKeys("Murugesan");
		driver.findElement(By.xpath("//*[@id=\"u_0_s\"]")).sendKeys("cmjpqa5@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"u_0_v\"]")).sendKeys("cmjpqa5@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("Looploop1");
		Select sel1 = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		sel1.selectByIndex(31);
		Select sel2 = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		sel2.selectByVisibleText("Jul");
		Select sel3 = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		sel3.selectByIndex(44);
		driver.findElement(By.xpath("//*[@name=\"sex\" and @value=\"2\"]")).click();  
		driver.findElement(By.xpath("//*[@id=\"u_0_14\"]")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
