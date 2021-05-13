package com.amazon.stepdefinition;

import org.junit.runner.Runner;
import org.openqa.selenium.WebDriver;

import com.amazon.pom.Amazon_Pom;
import com.amazon.runner.Amazon_runner;
import com.baseclass.org.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonStepDefinition extends Baseclass {

	public static WebDriver driver = Amazon_runner.driver;

	Amazon_Pom ap = new Amazon_Pom(driver);

	@Given("^User launch application$")
	public void user_launch_application() throws Throwable {
		getUrl("https://www.amazon.in/");

	}

	@Then("^User click the Todays deal$")
	public void user_click_the_Todays_deal() throws Throwable {
		clickOnElement(ap.getToday());
	}

	@When("^User click on Signup button$")
	public void user_click_on_Signup_button() throws Throwable {
		clickOnElement(ap.getSign());
	}

	@When("^User enter \"([^\"]*)\" in signin page$")
	public void user_enter_in_signin_page(String arg1) throws Throwable {
		inputValueElement(ap.getEmail(), arg1);
	}

	@Then("^User click the continue button$")
	public void user_click_the_continue_button() throws Throwable {
		clickOnElement(ap.getSearch());

	}

	@When("^User enter \"([^\"]*)\" as a password$")
	public void user_enter_as_a_password(String arg1) throws Throwable {
		inputValueElement(ap.getPw(), arg1);
	}

	@When("^User click the search button$")
	public void user_click_the_search_button() throws Throwable {
		clickOnElement(ap.getEnter());
	}

	@When("^User enter the \"([^\"]*)\"\" for validation$")
	public void user_enter_the_for_validation(String arg1) throws Throwable {
		inputValueElement(ap.getOtp(), arg1);
	}

	@Then("^User click the login page$")
	public void user_click_the_login_page() throws Throwable {
		clickOnElement(ap.getLg());
	}

}
