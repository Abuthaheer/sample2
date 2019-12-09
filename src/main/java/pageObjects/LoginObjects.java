package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjects extends BasePage {

	@FindBy(id = "username")
	private WebElement uName;

	@FindBy(id = "password")
	private WebElement passWord;

	@FindBy(id = "login")
	private WebElement btnLogin;

	public LoginObjects() {
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String name) {
		setText(uName, name);
	}

	public String getEnteredUserName() {
		return uName.getAttribute("value");
	}

	public void loginToApp(String user, String pass) {
		setText(uName, user);
		setText(passWord, pass);
		btnLogin.click();
	}

}
