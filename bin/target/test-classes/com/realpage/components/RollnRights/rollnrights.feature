Feature: Onboarding HTML Rendering

  Scenario Outline: Rendering Onboarding Page 
  

   *Scenario Name: "Onboarding"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on Login Page
    When User enters valid username "john.fischelli@realpage.com"
    And User enters valid password "password"
    And User clicks on Login Button
    Then User navigates to People Page
    And finds an specific agent "william"
    And Verifies that agents roll
    When User clicks on the Log Out link
    Then User is redirected to the Login Page "/login"
    And User have landed on Login Page
    When User enters valid username "william.davis@realpage.com"
    And User enters valid password "password"
    And User clicks on Login Button
    And User is directed to the Home Page "/properties"
    When User clicks on navigation button
    And User is able to see Properties and Onboarding only 
  
    
    
    
    Examples:
    |userName|pageName|
    |QA Tester|LoginPage|
  
   
 
   