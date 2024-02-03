package steps;

import common.amazonBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.amazonHomePage;

public class userLogin extends amazonBase {
	amazonHomePage ap;
	@Given("i am rhe amazon home page")
	public void i_am_rhe_amazon_home_page() {
	   launchBrowser();
	}

	@When("i click on sign in button in the homepage")
	public void i_click_on_sign_in_button_in_the_homepage() {
	   ap = new amazonHomePage(driver);
	   ap.clickOnSignButtonInHomePage();
	}

	@When("i enter the {string} in the email input bar")
	public void i_enter_the_in_the_email_input_bar(String string) {
	   ap= new amazonHomePage(driver);
	   ap.enterEmailAdress(string);
	   
	}

	@When("i click the continue button")
	public void i_click_the_continue_button() {
		ap= new amazonHomePage(driver);
		   ap.clickOnContinueButton();
		   
	}

	@When("i enter the {string} in the password input bar")
	public void i_enter_the_in_the_password_input_bar(String string) {
		ap= new amazonHomePage(driver);
		ap.enterPassword(string);
	}

	@When("i click on the sign button")
	public void i_click_on_the_sign_button() {
		ap= new amazonHomePage(driver);
		ap.clickOnsSignInButton();
	}

	@Then("i can login into my account successfully")
	public void i_can_login_into_my_account_successfully() {
	   
}
	
	
}
