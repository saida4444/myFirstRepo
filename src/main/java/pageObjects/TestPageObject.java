package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TestPageObject extends Base {

	public TestPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchBar;

	@FindBy(xpath = "//button[@type='button' and @class='btn btn-default btn-lg']")
	private WebElement searchButton;

	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iphoneImage;

	public void enterValueForSearchBar(String value) {
		searchBar.sendKeys(value);
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public boolean isIphoneDisplayed() {
		if (iphoneImage.isDisplayed())
			return true;
		else
			return false;
	}

}
