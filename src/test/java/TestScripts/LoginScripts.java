package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginObjects;

public class LoginScripts {

	LoginObjects lg;

	public LoginScripts() {
		lg = new LoginObjects();
	}

	@Test
	public void verifyUserName() {
		lg.setUserName("Abuthaheer");
		String name = lg.getEnteredUserName();
		Assert.assertTrue(name.equals("Abuthahe"), "Failed: Not Entered");
	}

	@Test
	public void verifylogin() {
		lg.loginToApp("Abuthaheer123", "PE64C9");
		Assert.assertTrue(lg.getTitlte().contains("Search"), "Failed: login failed");
	}

}
