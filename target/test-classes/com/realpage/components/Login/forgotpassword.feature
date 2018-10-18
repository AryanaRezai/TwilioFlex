Feature: Forgot Password HTML Rendering

  Scenario Outline: Rendering Forgot Password Page 
  

   *Scenario Name: "ForgotPassword"
    Given <userName> wants to navigate the content of <pageName>
    When User clicks on the Forgot Your Password link
    Then User is directed to Send Password Reset Link Page
    When User enters non existing email address "xx.xx@realpage.com"
    Then User clicks on the Send Password Reset button
    Then User sees a message
    When User enters email address "aryana.rezai@realpage.com"
    Then User clicks on the Send Password Reset button
    Then User sees a success message
    
 
    Examples:
    |userName|pageName|
    |QA Tester|LoginPage|
   
    
   
 

   