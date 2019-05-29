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
@tag
Feature: Busienss Calnder - UK Global
  I want to new business calener option to Kroger 

  @tag1
  Scenario:Users will be given the ability in the UI to configure a 4-4-4 on fiscal calendar 
    Given I navigate to the login page
     When I login as superuser and password as Passw0rd
    When I check for the <value> in step
    Then I verify the <status> in step

   