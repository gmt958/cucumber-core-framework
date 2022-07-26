package Stepdefinitions;

import GenericMethods.BrowserStackAndroid;
import GenericMethods.RealDevices;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import pages.login;

public class Login {

	
	
	public login l=new login(BrowserStackAndroid.getdriver());

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("first step");
		l.click();
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("second step");

	}

	@When("I complete action")
	public void i_complete_action() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("third step");

	}

	@And("I close the browser")
	public void i_close_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("fourth step");

	}

}
