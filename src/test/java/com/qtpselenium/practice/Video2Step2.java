package com.qtpselenium.practice;

import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;

public class Video2Step2 {
	/*
	 * What is BDD Cucumber implements BDD Downloading Cucumber Jars Preparing
	 * Features File having test scenarios Writing a step definition Writing Runner
	 * Class Given, When, Then, And, But annotations and usage in features class
	 * Passing parameters in Step Functions Using regular expression in step
	 * implementation to parameterize Parameterize complete scenario using features
	 * class Data Table in Cucumber and its implementation Running Cucumber through
	 * ANT Pretty, Tags and Glue Junit Report Generation in Cucumber Cucumber HTML
	 * Reports Log4j Usage Using Assertions to report failure
	 */

	// Part#2

	/*
	 * 
	 * Topics covered Passing parameters from Feature files to Step Definitions
	 * Using Regular expressions in Cucumber Step Definitions Managing multiple
	 * scenarios Passing list to Step Definition Running Scenario with Multiple sets
	 * of Data
	 * 
	 */

//=============================================================	

	/*
	 * Step Definitions is a Java file.
	 */


	
	

	@And("^I want to book flight ([^\"]*) to ([^\"]*)$")
	public void bookflight(String airp,String arrp )
	{
		System.out.println("Departure Airport: "+airp);
		System.out.println("Arrival airport: "+arrp);
	}
	
	@And("^I want to fly on ([^\"]*)$")
	public void depDate(String dedate)
	{
		System.out.println("Fly date: "+dedate);
	}

	
}



/*
 * 
 * @And("^I want to go on a holiday$")
	public void i_want_() {
		System.out.println("I want to go on a holiday");
	}

	@And("^We are now (\\d+) adults$")
	public void adultsNameAndAge(int adults, List<Map<String, String>> data) {
		// This is example of Map. Here feature sending data
		// in form of Map. 3 adults here I am going to send
		// Name and age. Passing parameter from feature file to step definition
		// file in form of List/Map

		System.out.println(data);

	}

	@And("^We are (\\d+) adults$")
	public void we_are(int adults, List<String> data) {
		System.out.println("We are " + adults + " adults ");
		System.out.println(data);
		System.out.println("First name: " + data.get(0));

	}

	@Then("^He should provide me option to cancel$")
	public void he_should_provide_me_option_to_cancel() {
		System.out.println("He should provide me option to cancel");
	}

	@And("^We want to book from ([^\"]*) to ([^\"]*)$")
	public void we_want_book(String dateA, String dateB) {
		System.out.println("We want to book from " + dateA + " to " + dateB);
	}

	@When("^I go to travel agent$")
	public void travel_Agent() {
		System.out.println("I go to travel agent");
	}

	@Then("^He should be able to to help me in a budget of 1000 USD$")
	public void help_Me() {
		System.out.println("He should be able to to help me in a budget of 1000 USD");
	}

	@But("^He should not ask for advance more the (.*) USD$")
	public void advance(String doller) {
		System.out.println("He should not ask for advance more the " + doller + " USD");
	}

	@And("^I want to book flight ([^\"]*) to ([^\"]*)$")
	public void bookflight(String airp, String arrp) {
		System.out.println("Departure Airport: " + airp);
		System.out.println("Arrival airport: " + arrp);
	}

	@And("^I want to fly on ([^\"]*)$")
	public void depDate(String dedate) {
		System.out.println("Fly date: " + dedate);
	}

	/*
	 * @And("^My return data on ([^\"]*)&") public void returnd(String date) {
	 * System.out.println(date); }
	 */
/*
	@And("^My return data on ([^\"]*)&")
	public void my_return_data_on_th_May(String date) {
		System.out.println("Return date: " + date);
	}
*/
