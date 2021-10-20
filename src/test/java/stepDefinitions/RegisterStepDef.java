package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.RegisterPageObject;
import utilities.UtilityClass;

public class RegisterStepDef extends Base {

	RegisterPageObject registerPage = new RegisterPageObject();

	@And("user click on Register")
	public void user_click_on_register() {
		registerPage.clickOnRegister();
		logger.info("user clicked on Register");
		UtilityClass.takeScreenShot();

	}

	@And("user fill registration form with below information")
	public void user_fill_registration_form_with_below_information(DataTable dataTable) {

		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		registerPage.enterFirstName(info.get(0).get("firstName"));
		registerPage.enterLastName(info.get(0).get("lastName"));
		registerPage.enterEmail(info.get(0).get("email"));
		registerPage.enterPhone(info.get(0).get("telephone"));
		registerPage.enterPassword(info.get(0).get("password"));
		registerPage.enterConfirmPassword(info.get(0).get("passwordConfirm"));
		registerPage.subscription(info.get(0).get("subscribe"));
		logger.info("user entered personal information " + info.toString());
		UtilityClass.takeScreenShot();

	}

	@And("user agree to privacy and policy")
	public void user_agree_to_privacy_and_policy() {
		registerPage.clickOnPrivacyPolicy();
		logger.info("user clicked on privacy and policy checkbox");
	}

	@And("user click on continue button")
	public void user_click_on_continue_button() {
		registerPage.clickOnContinueButton();
		logger.info("user clicked on continue button");
	}

	@Then("user should see successful message {string}")
	public void user_should_see_successful_message(String string) {
		Assert.assertEquals(string, registerPage.getSuccessMessage());
		logger.info("account was created successfully");
		UtilityClass.takeScreenShot();
	}

}
