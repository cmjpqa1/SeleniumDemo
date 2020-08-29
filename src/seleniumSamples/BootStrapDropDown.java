package seleniumSamples;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrapDropDown {
	public static void main(String[] args) throws InterruptedException {

		// Start firefox browser

		FirefoxDriver driver = new FirefoxDriver();

		// start the application

		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");

		// First we have to click on menu item then only dropdown items will display

		driver.findElement(By.xpath(".//*[@id='menu1']")).click();

		// adding 2 seconds wait to avoid Sync issue

		Thread.sleep(2000);

		// Dropdown items are coming in <a> tag so below xpath will get all

		// elements and findElements will return list of WebElements

		List<WebElement> list = driver.findElementsByXPath("//ul[@class='dropdown-menu']//li/a");

		// We are using enhanced for loop to get the elements

		for (WebElement ele : list)

		{

			// for every elements it will print the name using innerHTML

			System.out.println("Values " + ele.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal to Java Script

			if (ele.getAttribute("innerHTML").contains("JavaScript")) {

				// if yes then click on link (iteam)

				ele.click();

				// break the loop or come out of loop

				break;

			}

		}

		// here you can write rest piece of code

	}

}
