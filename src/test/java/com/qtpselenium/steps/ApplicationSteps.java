package com.qtpselenium.steps;

import java.util.Map;

import com.qtpselenium.webdriver.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ApplicationSteps {
	WebConnector con;

	public ApplicationSteps(WebConnector con) {
		this.con = con;
	}

	@And("^I login inside application$")
	public void login(Map<String, String> data) {
		System.out.println("UserName: "+data.get("Username"));
		System.out.println("Password: "+data.get("Password"));
		con.login(data.get("Username"), data.get("Password"));
	}

	@Then("^Login should be (.*)$")
	public void login_should_be(String expectedResult) {
		con.validateLogin(expectedResult);
	}

//=======================================================================

	@Then("^I see login (.*)$")
	public void validateLogin(String expectedResult) {
		con.validateLogin(expectedResult);
	}

}

//@Given("^I navigate to (.*)$")
//public void i_navigate_to_loginURL(String url) {
//	System.out.println("Navigating to " + url);
//	driver.get("https://home.zoho.com/home");
//	driver.quit();
//}
