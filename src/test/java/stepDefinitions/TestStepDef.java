package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TestPageObject;

public class TestStepDef extends Base {

	TestPageObject testPageObject = new TestPageObject();

	@When("user search for {string}")
	public void user_search_for(String string) {
		// Write code here that turns the phrase above into concrete actions
		testPageObject.enterValueForSearchBar(string);
		testPageObject.clickOnSearchButton();
	}

	@Then("iphone should be displayed")
	public void iphone_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(testPageObject.isIphoneDisplayed());
	}

}
