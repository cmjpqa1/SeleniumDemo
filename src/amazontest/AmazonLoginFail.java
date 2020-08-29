package amazontest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import lib.excelDataConfig;

public class AmazonLoginFail extends BaseClass {

	@Test(description = "This Testcase will perform Incorrect password test")
	public void AmazonLogin() throws Throwable {
		excelDataConfig excel = new excelDataConfig("C:\\ExcelData\\TestData.xlsx");
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(excel.getData(0, 1, 0));
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(excel.getData(0, 1, 1));
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Reporter.log("====Login Button clicked Successfully(Incorrect Pwd)==== "+excel.getData(0, 1, 1), true);
		Thread.sleep(5000);

	}
	
	@Test(description = "This Testcase will perform invalid password test")
	public void AmazonLogin1() throws Throwable {
		excelDataConfig excel = new excelDataConfig("C:\\ExcelData\\TestData.xlsx");
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(excel.getData(0, 2, 0));
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(excel.getData(0, 2, 1));
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Reporter.log("====Login Button clicked Successfully(Invalid Pwd)==== "+excel.getData(0, 2, 1), true);
		Thread.sleep(5000);

	}
	
	@Test(description = "This Testcase will perform incorrect username test")
	public void AmazonLogin2() throws Throwable {
		excelDataConfig excel = new excelDataConfig("C:\\ExcelData\\TestData.xlsx");
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(excel.getData(0, 3, 0));
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(excel.getData(0, 3, 1));
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Reporter.log("====Login Button clicked Successfully(Incorrect username)==== "+excel.getData(0, 3, 0), true);
		Thread.sleep(5000);

	}

}
