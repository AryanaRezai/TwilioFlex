Feature: ChatTest HTML Rendering

  Scenario Outline: Rendering Consumer Widget Page 
  

   *Scenario Name: "Flex Login"
    Given <userName> wants to navigate the content of <pageName>
    And Admin enters User name <userEmail>
    And Admin enters password <passWord>
    And Admin selects Sign In
    Then Admin is logged in
    
  
   
   
    Examples:
    |userName|pageName|userEmail|passWord|
    |QA Tester|Flexloginpage|aryana.rezai@realpage.com|UniversalStudios@2020|
  
    
   
 
   