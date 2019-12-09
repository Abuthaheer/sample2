package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {

	@FindBy(id = "newsletter-input")
	private WebElement txtBoxNewsLetter;

	@FindBy(name = "submitNewsletter")
	private WebElement btnSubmit;

	@FindBy(xpath = "//*[@class='alert alert-success']")
	private WebElement txtSuccessMessage;

	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[2]/a")
	private WebElement tabDresses;

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickDresses(){
		tabDresses.click();
	}

	public void setNewsLetter(String email) {
		setText(txtBoxNewsLetter, email);
		btnSubmit.click();
	}

	public String getSuccessMessage() {
		return txtSuccessMessage.getText();
	}

}
