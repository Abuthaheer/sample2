package TestScripts;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePageObject;

public class HomePageScripts {

	HomePageObject hp;

	public HomePageScripts() {
		hp = new HomePageObject();
	}

	int number = new Random().nextInt(500000);
	String email = "Batch6Auto" + number + "@yahoo.com";
	
	@Test
	public void verifySubscription() {
		hp.setNewsLetter(email);
		String msg = hp.getSuccessMessage();
		Assert.assertTrue(msg.contains("successfully "), "Failed: Subscription not displayed");
	}

}
