package FirstTestNGTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGScript {
	
	@Test(priority=1, description = "This testcase will verify the login functionality")
	public void loginapplication() {
		
		System.out.println("Hey, this is my first test");
		Assert.assertEquals(12, 12);
	}

	@Test(priority=2, description="This testcase will add items to the basket")
	public void selectItems() {
		
		System.out.println("Items Selected");

	}
	
	@Test(priority=3, description="This testcase will perform checkout operation")
	public void checkout() {
		
		System.out.println("Checkout completed");

	}
}
