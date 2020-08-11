Feature: As a user I want a login page so that only authentic 
	users will be able to login
         
#Scenario: Valid users should be able to login 
#     Given i am on techfios site 
#     When i enter username and password
#     And  i click on sign in button
#     Then Dashboard page should diplay
#	
	
	
Scenario Outline: Valid users should be able to login using example 
	Given i am on techfios site 
	When user logs in with valid "<username>" and "<password>"
	Then Dashboard page should display 
	Examples: 
		| username| password|
		| demo@techfios.com| abc123|
	
