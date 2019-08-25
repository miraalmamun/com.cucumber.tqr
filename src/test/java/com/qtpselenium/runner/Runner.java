package com.qtpselenium.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		dryRun=false,
		strict=true,
		monochrome=true,
		features= {"src/test/resources/"},
		glue = {"com.qtpselenium.steps"},
		plugin= { "pretty",
				"html:target/site/cucumber-html",
				"json:target/cucumber1.json"},
		tags= {"@CreatePortFolio,@DeletePortFolio"}
		)

public class Runner {

}










/*
 * @CucumberOptions
		(
		features= {".//Features/"},
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output"},
		tags= {"@sanity, @regression"}
		)
 */
