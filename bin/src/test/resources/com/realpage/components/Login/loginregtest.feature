Feature: Login HTML Rendering

  Scenario Outline: Rendering Login Page 
  

   *Scenario Name: "Login: Invalid credentials"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on Login Page
    When User enters username <user>
    And User enters password <pass>
    And User clicks on Login Button
    Then User sees an error message 
    And User is Not directed to the Home Page <loginp>
    And User have landed on Login Page
    When User enters valid username "john.fischelli@realpage.com"
    And User enters valid password "password"
    And User clicks on Login Button
    When User clicks on the Log Out link
    Then User is redirected to the Login Page "/login"
    When User clicks on the Forgot Your Password link
    Then User is directed to Send Password Reset Link Page
    When User enters non existing email address "xx.xx@realpage.com"
    Then User clicks on the Send Password Reset button
    Then User sees a message
    When User enters email address "aryana.rezai@realpage.com"
    Then User clicks on the Send Password Reset button
    Then User sees a success message
    
   
   

    Examples:
    |userName|pageName|user|pass|loginp|
    |QA Tester|LoginPage|john.Ficshelli@realpagecom|password|/login/|
    
    
   
 

   