
Feature: As a user I want a login page so that only authentic 
     users will be able to login
         
     Scenario: Valid users should be able to login 
     Given i am on techfios site 
     When i enter <username> and <password>
     And  i click on sign in button
     Then Dashboard page should diplay
   
     When user logs in with valid credentials 
     Then Dashboard page should display
