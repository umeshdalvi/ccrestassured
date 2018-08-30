package com.qmetry.nl.stepdefinition;
 
 
import com.qmetry.nl.Demo.RATestClass;

import cucumber.api.java.en.Given;

public class Stepdefinition {
  
 	@Given("^User should able to get weather data for city \"([^\"]*)\"$")
 	public void getWeather_City(String CityName){
		System.out.println("Inside StepDefination weather City: " + CityName);
		RATestClass ratest = new RATestClass();
		ratest.GetWeatherDetails();
	}	
 
 }
