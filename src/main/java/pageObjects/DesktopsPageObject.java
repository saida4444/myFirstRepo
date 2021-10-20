package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPageObject extends Base {
	
	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div[1]/img")
	private WebElement icon;

}
