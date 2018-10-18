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
    When User clicks on the property search drop down
    And User picks Property Name
    When User enters a Property Name <propname>
    And User clicks on the search submit icon
    When User clicks on the actual property name
    Then User is directed to the property details page "/property"
    When user selects Settings
    Then User is directed to "/settings"
    When User selects Communication Widgets
    Then User is directed to widgets page "/widgets"
    When User selects an already excisting widget 
    Then User is directed to widgets details page "/widgets"
    And A chat preview is displayed
    And User setts the status to Disable
    And The widget name box is not empty
    And Call To Action Text is modified
    When User clicks on save
    And User clicks on Widget Search Page
    Then User is directed to the Widget Search Page "/products/widgetsearch"
    When User enters a new Widget Name <widgname>
    And User clicks on the search submit icon
    When User clicks on Preview
    Then Enabled is false
    When User expands the Naigation Menu
    And User clicks on Properties
    Then User is directed to the Properties Page "/properties"
    When User clicks on the property search drop down
    And User picks Property Name
    When User enters a Property Name <propname>
    And User clicks on the search submit icon
    When User clicks on the actual property name
    Then User is directed to the property details page "/property/"
    When user selects Settings
    Then User is directed to "settings"
    When User selects Communication Widgets
    Then User is directed to widgets page "/widgets"
    When User selects an already excisting widget
    Then User is directed to widgets details page "/widgets"
    And A chat preview is displayed
    And User setts the status to Active
    When User clicks on save
    And User clicks on Widget Search Page
    Then User is directed to the Widget Search Page "/products/widgetsearch"
    When User enters a new Widget Name <widgname>
    And User clicks on the search submit icon
    When User clicks on Preview
    Then Enabled is True
    
    
 
    Examples:
    |userName|pageName|propname|widgname|
    |QA Tester|LoginPage|1000 Kiely|Automation Test Widget|
    
   

   