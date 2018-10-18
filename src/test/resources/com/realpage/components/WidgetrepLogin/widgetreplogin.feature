Feature: Login HTML Rendering

  Scenario Outline: Rendering Login Page 
  

   *Scenario Name: "Login: valid credentials"
    And User enters email "william.davis@realpage.com"
    And User enters password "william_davis!?"
    When User clicks on Login button

  Examples:
    |userName|pageName|
    |QA Tester|WidgetreportingPage|
  
   
 

   