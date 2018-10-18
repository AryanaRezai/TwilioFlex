Feature: Login HTML Rendering

  Scenario Outline: Rendering Login Page 
  

   *Scenario Name: "Login: valid credentials"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on Login Page
    When User enters valid username "john.fischelli@realpage.com"
    And User enters valid password "password"
    And User clicks on Login Button
    When User clicks on the Log Out link
    Then User is redirected to the Login Page "/login"

    Examples:
    |userName|pageName|
    |QA Tester|LoginPage|
  
   
 

   