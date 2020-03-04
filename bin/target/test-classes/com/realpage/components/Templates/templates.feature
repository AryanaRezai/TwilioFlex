Feature: Properties HTML Rendering

  Scenario Outline: Rendering Properties Page 
  

   *Scenario Name: "Properties"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on Login Page
    When User enters valid username "john.fischelli@realpage.com"
    And User enters valid password "password"
    And User clicks on Login Button
    And User is directed to the Home Page "/properties"
    And User clicks on Company tab
    Then User is directed to the Comany Page "/company"
    And User select a company "AHS Development Group"
    Then A page with five tabs is displayed
    When User selects the Property Tab 
    Then Related properties are dispalyed
    When User selects the Settings tab
    Then User sees differet cards
    When User selects Widget Templates card
    Then Template List Page is displayed
    When User clicks on Add Widget Template
    Then An empty template is displayed
    When User selects cancel button
    Then User is directed to template list page
    When User clicks on an already existing template
    And User changes the content of the template
    
     
    
    
  
    Examples:
    |userName|pageName|
    |QA Tester|LoginPage|
  
   
 
   