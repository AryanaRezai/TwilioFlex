Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "Flex Login"
    Given <userName> wants to navigate the content of <pageName>
    And Agent enters User name <userEmail>
    And Agent enters password <passWord>
    And Agent selects Sign In
    Then Agent is logged in
    
  
   
   
    Examples:
    |userName|pageName|userEmail|passWord|
    |QA Tester|Flexloginpage|test-leasing.agent@realpage.onmicrosoft.com|Automation@2020|
  
    
   
 
   