package com.qmetry.nl.Demo;

import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.given;

public class RATestClass {
	public void GetWeatherDetails()
	{   	
		System.out.println("In GetWeatherDetails class");
		String baseURI = "http://restapi.demoqa.com/utilities/weather/city/Mumbai";
		Response response = given().when().get(baseURI);
		System.out.println("GetWeatherDetails response :" + response.getBody().asString());			
	}
}

