package com.qmetry.nl.cucumberRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
		format ={ "pretty", "json:target/Destination/cucumber.json"},
		glue = {"com.qmetry.nl.stepdefinition"})				

public class TestRunnerIT {
	}
