Feature: Properties HTML Rendering

  Scenario Outline: Rendering Properties Page 
  

   *Scenario Name: "Properties"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on Login Page
    When User enters valid username "john.fischelli@realpage.com"
    And User enters valid password "password"
    And User clicks on Login Button
    And User is directed to the Home Page "/properties"
    When User expands the Naigation Menu
    And User clicks on Properties
    Then User is directed to the Properties Page "/properties"
    When User clicks on the property search drop down
    Then User sees a list of search options
    And User picks Property Name
    When User enters a Property Name <propName>
    And User clicks on the search submit icon
    Then User sees eight information titles
    And User sees information related to the search
    When User clicks on the property search drop down
    And User picks Company Name
    Then User enters a Company Name "Essex" 
    And User clicks on the search submit icon
    Then User sees eight information titles
    And User sees information related to the search
    When User clicks on the property search drop down
    And User picks Property ID
    Then User enters a Property ID "7789"
    And User clicks on the search submit icon
    Then User sees eight information titles
    And User sees information related to the search
    When User clicks on the actual property name
    Then User is directed to the property details page "/property/"
    
    Examples:
    |userName|pageName|propName|
    |QA Tester|LoginPage|1000 Kiely|
  
   
 
   