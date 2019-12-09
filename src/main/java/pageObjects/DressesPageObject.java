package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesPageObject extends BasePage {

	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement txtHeader;

	@FindBys(@FindBy(xpath = "//ul[@class='product_list grid row']/li"))
	private List<WebElement> lstProducts;

	public DressesPageObject() {
		PageFactory.initElements(driver, this);
	}

	public int getCountFromHeader() {

/*		String txt = txtHeader.getText();
		String[] arr = txt.split(" ");
		txt = arr[2];
		int number = Integer.parseInt(txt);
		return number;*/		
		return Integer.parseInt(txtHeader.getText().split(" ")[2]);
	}	
	
	public int getProductCount(){
		return lstProducts.size();
	}

}
