package seleniumSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class TestRightClickAndArrowKey {
@Test
public void TestClick() throws Exception{
WebDriver driver=new FirefoxDriver();
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();
Actions act=new Actions(driver);
//act.contextClick(driver.findElement(By.linkText("Sell"))).perform();
Thread.sleep(5000);
act.contextClick(driver.findElement(By.linkText("Sell"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
}
}

