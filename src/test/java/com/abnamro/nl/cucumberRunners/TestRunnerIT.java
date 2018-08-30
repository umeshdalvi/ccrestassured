package com.abnamro.nl.cucumberRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
		format ={ "pretty", "json:target/Destination/cucumber.json"},
		glue = {"com.abnamro.nl.stepdefinition"})				

public class TestRunnerIT {
	}
