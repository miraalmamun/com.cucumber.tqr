package com.qtpselenium.practice;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		dryRun=false,
		strict=true,
		monochrome=true,
		features= {".//Features/"}, 
	    //{"C:\\Users\\Mir\\eclipse-workspace\\com.cucumber.tqr\\Features\\holiday.feature"},
		glue = {"com.qtpselenium.practice"}//stepDefinitions-->Just Package name here
		
		/*
		dryRun=false,
		strict=true,
		monochrome=true,
		features= {"src/test/resources/"},
		glue = {"com.qtpselenium.steps"},
		plugin= { "pretty",
				"html:target/site/cucumber-html",
				"json:target/cucumber1.json"},
		tags= {"@CreatePortFolio,@DeletePortFolio"}
		*/
		)
public class MyRunner2 {

}
