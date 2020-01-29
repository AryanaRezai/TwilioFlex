Feature: Login HTML Rendering

  Scenario Outline: Rendering Login Page 
  

   *Scenario Name: "Login: valid credentials"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on Login Page
    When User enters valid username "john.fischelli@realpage.com"
    And User enters valid password "password"
    And User clicks on Login Button
    And User is directed to the Home Page "/properties"
    When User clicks on SMS tab "SMS Status"
    Then User is directed to the phone page "/smsstatuses"
    When User enters a phone number "+14692165826"
    And Clicks on search 
    Then That number is displayed
    When User clicks search with an empty box
    Then An error message is displayed
    
    
  

    Examples:
    |userName|pageName|
    |QA Tester|LoginPage|
  
   
 

   