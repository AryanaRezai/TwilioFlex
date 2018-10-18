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
    And User picks Property Name
    When User enters a Property Name <propName>
    And User clicks on the search submit icon
    When User clicks on the actual property name
    Then User is directed to the property details page "/property/"
    When user selects Settings
    Then user is directed to settings "/property/8d514821-236a-445e-84d5-eecc4a14b24b/settings"
    
    
    
    Examples:
    |userName|pageName|propName|
    |QA Tester|LoginPage|1000 Kiely|
  
   
 
   