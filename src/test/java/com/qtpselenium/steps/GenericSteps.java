package com.qtpselenium.steps;

import com.qtpselenium.webdriver.WebConnector;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.Scenario;

public class GenericSteps {

	WebConnector con;

	public GenericSteps(WebConnector con) {
		this.con = con;
	}

	@Before
	public void before(Scenario scenarioName) {

		con.initReports(scenarioName.getName());
	}

	@After
	public void after() {

		con.quit();
	}

	@Given("^I open (.*)$")
	public void openBrowser(String browserName) {

		// con.infoLog("Opening Browser GNS " + browserName);
		con.openBrowser(browserName);
	}

	@And("^I go to (.*)$")
	public void navigate(String url) {

		// con.infoLog("Navigating to GNS " + url);
		con.navigate(url);
	}

//====================================================================
	@And("^I navigate to (.*)$")
	public void i_navigate_to_loginURL(String url) {
		// System.out.println("Navigating to " + con.name);
		// con.infoLog("Navigating to " + url);
		con.navigate(url);
	}

//=====================@CreatePortFolio==============================================
	@And("^I click (.*) and wait for (.*)$")
	public void clickAndWait(String src, String target) {
		// con.infoLog("Clicking on " + src);
		con.clickAndWait(src, target, 20);
	}

	@And("^I clear (.*)$")
	public void clear(String locatorKey) {
		// con.infoLog("Clearing in " + locatorKey);
		con.clear(locatorKey);
	}

	@And("^I type (.*) in (.*) field$")
	public void type(String data, String locatorKey) {
		// con.infoLog("Typing in " + locatorKey + ".Data " + data);
		con.type(locatorKey, data);
	}

	@And("^I click on (.*)$")
	public void click(String locatorKey) {
		// con.infoLog("Clicking on " + locatorKey);
		con.click(locatorKey);
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			con.infoLog("Submit button");
			e.printStackTrace();
		}
	}

//==========================@CreatePortFolio--END=======================================
	@And("I select (.*) from (.*)")
	public void select(String data, String locatorKey) {

		//con.infoLog("Selecting from " + locatorKey);
		con.select(locatorKey, data);
	}

	@And("^I wait for page to load$")
	public void waitForPageToLoad() {
		con.waitForPageToLoad();
	}

	@When("^I accept alert$")
	public void iAcceptAlert() {
		con.acceptAlertIfPresent();
	}

	@Given("I look for {string}")
	public void i_look_for(String you) {
		con.infoLog("Looking for " + you);
	}

}
