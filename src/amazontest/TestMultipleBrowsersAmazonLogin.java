package amazontest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import lib.excelDataConfig;

public class TestMultipleBrowsersAmazonLogin extends BaseClass {

	@Test(description = "This Testcase will perform valid login")

	public void AmazonLogin() throws Exception {

		excelDataConfig excel = new excelDataConfig("C:\\ExcelData\\TestData.xlsx");
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(excel.getData(0, 0, 0));
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(excel.getData(0, 0, 1));
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		driver.get("https://www.amazon.in/?ref_=nav_ya_signin&");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		Thread.sleep(5000);

		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//span[contains(text(),\"Account & Lists\")]"));
		action.moveToElement(we).build().perform();

		Thread.sleep(2000);
		
		/*
		 * List <WebElement> linkList = driver.findElements(By.tagName("a"));
		 * 
		 * 
		 * System.out.println(linkList.size());
		 * 
		 * for(int i=0; i<linkList.size(); i++){ String linkText =
		 * linkList.get(i).getText(); System.out.println(linkText); }
		 */
		
		
		
		boolean b1 = driver.findElement(By.xpath("//span[text()='Sign Out']")).isDisplayed();
		System.out.println(b1); // true

		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
		Reporter.log("====Application Signout Successful====", true);

	}

}
