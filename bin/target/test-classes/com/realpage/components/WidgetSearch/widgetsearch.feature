Feature: Properties HTML Rendering

  Scenario Outline: Rendering Widget Search Page 
  

   *Scenario Name: "WidgetSearch"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on Login Page
    When User enters valid username "john.fischelli@realpage.com"
    And User enters valid password "password"
    And User clicks on Login Button
    And User is directed to the Home Page "/properties"
    When User expands the Naigation Menu
    And User clicks on Widget Search Page
    Then User is directed to the Widget Search Page "/products/widgetsearch"
    When User enters a Widget ID "Ya1ITCXgNMc6EVQ2446n7A"
    And User clicks on the search submit icon
    Then User sees eight column titles
    When User enters a Widget Name "Test Automation Widget"
    And User clicks on the search submit icon
    Then User sees eight column titles
    When User enters RPCC ID "702"
    And User clicks on the search submit icon
    Then User sees eight column titles
    When User enters RPCC property ID "414"
    And User clicks on the search submit icon
    Then User sees eight column titles
    Then User sees information that is related to the search
    When User clicks on the Preview button
    Then User sees a payload
    And A widget is opened in less than 10 seconds

    
 
    Examples:
    |userName|pageName|
    |QA Tester|LoginPage|
  
   
 
   