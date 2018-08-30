Feature: Retrieve weather data for Specific City
@TEST_CASE_NUMBER_TC01
Scenario Outline: Retrieve the weather data for Specific City
Given User should able to get weather data for city "<CITY_Name>"
Examples:
 | TEST_CASE_NUMBER | CITY_Name | 
 | TC01 | Mumbai | 
 
