package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DressesPageObject;
import pageObjects.HomePageObject;

public class DressesTestScript {

	DressesPageObject dp;
	HomePageObject hp;

	public DressesTestScript() {
		dp = new DressesPageObject();
		hp = new HomePageObject();
	}

	@Test
	public void verifyHeaderCount() {
		hp.clickDresses1();
		Assert.assertEquals(dp.getCountFromHeader(), dp.getProductCount(), "Failed: Not Equal");
	}

}
