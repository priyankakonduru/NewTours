#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: OrangeHRM Application Testing

 
  Scenario: OrangeHRM LogIn Functionality Application Testing
    Given Open Chrome Browser and Navigate OrangeHRM Application
   
    When User enters UserName and Password and click on LogIn button
   
    Then User should be able to LogIn successfully and then close the Application
   

  
  
