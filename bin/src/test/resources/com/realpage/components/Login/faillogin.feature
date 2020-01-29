Feature: Login HTML Rendering

  Scenario Outline: Rendering Login Page 
  

   *Scenario Name: "Login: Invalid credentials"
    Given <userName> wants to navigate the content of <pageName>
    And User have landed on Login Page
    When User enters username <user>
    And User enters password <pass>
    And User clicks on Login Button
    Then User sees an error message 
      Examples:
    |userName|pageName|user|pass|loginp|
    |QA Tester|LoginPage|john.Ficshelli@realpagecom|password|devplaypen.com/login/|
    |QA Tester|LoginPage|john.Ficshelli@realpage.com|passwd|devplaypen.com/login/|
    |QA Tester|LoginPage|john.Ficshelli@realpagecom|pasword|devplaypen.com/login/|
    
   
 

   